package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import util.DbManager;
import vo.Room;
import vo.Student;
import vo.Subject;
import vo.Teacher;

public class StudentTeacherDAOImpl implements StudentTeacherDAO {
	/**
	 * 1번 : 성별이 여자인 학생의 정보 검색
       select * from student where  수_주민등록번호 like '%-2%'
	 * */
	public List<Student> getGenderByWomen(){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Student> list = null;
		String sql = "select * from student where student_jumin like ?";
		
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, "'%-2%'");
			
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Student student = new Student(rs.getInt(1), rs.getString("student_name"),
						rs.getString("student_jumin"),rs.getString("student_phone"),rs.getString("student_address"),rs.getString("student_email"));
				
				list.add(student);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		
		return list;
	}
	
	/**
	 * 3.  "구"를 인수로 전달받아 구에 거주하는 강사의 정보 검색
	 *      select * from teacher  where 주소 like ?
	 * */
	@Override
	public List<Teacher> getTeacherInfoByAddr(String gu) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher teacher = null;
		List<Teacher> list = null;
		String sql = "select * from teacher  where address like ?";
		
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, "'%" + gu + "구%'");
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				teacher = new Teacher(rs.getInt(1), rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5),
						rs.getString(6), rs.getString(7));
				
				list.add(teacher);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		
		return list;
	}
	
	/**
	 * 5. 과목을 인수로 전달받아 그 과목을 강의하는 강사의 정보 (서브쿼리) 
         select * from teacher where 수강코드 = 
          (select 수강코드 from subject where upper(과목)=upper( ? ))
	 * */
	@Override
	public Teacher getTeacherInfoBySubject(String subject) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher teacher = null;
		Subject sub = null;
		String sql = "select * from teacher where sugang_code = "
				+ "(select sugang_code from subject where upper(subject)=upper(?))";
		
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, sub.getSubjectName());
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				teacher = new Teacher(rs.getInt(1), rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5),
						rs.getString(6), rs.getString(7));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		
		return teacher;
	}

	/**
	 * 8. 강사의 번호를 인수로 전달받아 뷰에서 그 강사번호에 해당하는 정보를 출력한다
	 *   select * from v_teacherInfo  where 강사번호=?
	 * 
	 * */
	@Override
	public Teacher getTeacherInfoByNo(int teacherNo) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Teacher teacher = null;
		Teacher res = new Teacher();
		Subject sub = null;
		Room room = null;
		String sql = "select * from v_teacherInfo  where teacher_num=?";
		
		try {
			con = DbManager.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, teacher.getTeacherNo());
			ps.setString(2, teacher.getTeacherName());
			ps.setString(3, sub.getSugangCode());
			ps.setString(4, sub.getSubjectName());
			ps.setInt(5, room.getRoomNo());
			ps.setInt(6, room.getRoomCount());
			
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				res = Teacher(rs.getInt(1), rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5),
						rs.getString(6));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbManager.dbClose(con, ps, rs);
		}
		
		return teacher;
	}

	private Teacher Teacher(int int1, String string, String string2, String string3, String string4, String string5) {
		// TODO Auto-generated method stub
		return null;
	}
}
