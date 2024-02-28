package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.dto.Emp;
import db.util.DbManager;

public class TransactionDAO {
  /**
   * 계좌이체 기능 구현
   * */
	public void transfer(String inputAccount, String outputAccount, int money) {
		// 로드 연결 실행(2번의 update select) 닫기
		Connection con = null;
		try {
			con = DbManager.getConnection();
			con.setAutoCommit(false);// 자동커밋을 해제한다. -- 여러개의 문장 한번에 처리할때는 필요
			// 한문장짜리는 안해도 상관없지만 자동커밋되면 예외처리돼도 롤백 안되고 실행돼버림
			
			// 1. 출금한다.
			int result = this.withdraw(con, outputAccount, money);
			if(result==0) throw new SQLException("출금 계좌번호 오류입니다."); // 예외 강제로 발생시킴
			
			// 2. 출금이 정상이면 입금한다.
			result = this.deposit(con, inputAccount, money);
			if(result==0) throw new SQLException("입금 계좌번호 오류입니다.");
			
			// 3. 입금이 정상이면 잔액 확인한다.
			if(!this.isCheckBalance(con, inputAccount)) {
				throw new SQLException("잔액이 1000원이 초과하여 계좌이체 할수없습니다.");
			} // 1 2번 롤백
			
			// 4. 잔액확인이 정상이면 commit 한다.
			con.commit();
			System.out.println("계좌이체 성공하였습니다.^^b");
			
		} catch (SQLException e) {
			//e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			System.out.println(e.getMessage()); // "출금 계좌번호 오류입니다."
		} finally {
			DbManager.dbClose(con, null);
		}
		
	}
	
	// 출금(=인출)하기
	// update bank set balance=balance-?(인출금액) where account = ?(출금계좌번호);
	public int withdraw(Connection con, String outputAccount, int money) throws SQLException {
		PreparedStatement ps = null;
		String sql = "update bank set balance = balance - ? where account = ?";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			
			//?의 순서대로 set 설정
			ps.setInt(1, money);
			ps.setString(2, outputAccount);
			
			//실행 하고 결과 받아서 리턴
			result = ps.executeUpdate();
			
		} finally {
			DbManager.dbClose(null, ps); // 닫지말고 유지해야함 -  앞에 con 말고 null
		}
		
		return result;
	}
	
	// 입금하기
	// update bank set balance=balance+인출금액 where account =입금계좌번호;
	public int deposit(Connection con, String inputAccount, int money) throws SQLException {
		PreparedStatement ps = null;
		String sql = "update bank set balance = balance + ? where account = ?";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			
			//?의 순서대로 set 설정

			ps.setInt(1, money);
			ps.setString(2, inputAccount);
			
			//실행 하고 결과 받아서 리턴
			result = ps.executeUpdate();
			
		} finally {
			DbManager.dbClose(null, ps); // 닫지말고 유지해야함 -  앞에 con 말고 null
		}
		
		return result;
		
	}
	
	// 잔액확인
	// select balance from bank where account=?;
	// @return : true이면 정상, false이면
	public boolean isCheckBalance(Connection con, String inputAccount) throws SQLException {
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select balance from bank where account=?";
		boolean result = false;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, inputAccount);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getInt(1) <= 1000) result = true;
			}
			
		} finally {
			DbManager.dbClose(null, ps, rs);
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		TransactionDAO dao = new TransactionDAO();
		System.out.println("--1. 출금계좌 오류----");
		dao.transfer("A02", "A05",200);//입금, 출금, 금액 (A05없음)- 오류 - 롤백
		
		System.out.println("--2. 입금계좌 오류----");
		dao.transfer("A04", "A01",200);//입금, 출금, 금액 (A04없음)- 오류 - 롤백
		
		
		System.out.println("--3. 입금계좌의 총액 1000원 이상인경우----");
		dao.transfer("A02", "A01",700);//입금, 출금, 금액 (총액 1000원 넘음)- 오류 - 롤백
		
		System.out.println("--4. 성공----------");
		dao.transfer("A02", "A01",100);//입금, 출금, 금액
	}
}











