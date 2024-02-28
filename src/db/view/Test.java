package db.view;

import java.util.List;

import db.dao.EmpDAO;
import db.dto.Emp;

public class Test {
	public static void main(String[] args) {
		System.out.println("****JDBC연동*****");
		EmpDAO dao = new EmpDAO();
		dao.selectByName();
		
		System.out.println("2. 전체검색...");
		List<Emp> list = dao.selectAll();
		for(Emp e : list) {
			System.out.println(e);
		}
		
		System.out.println("3. 사원번호로...검색...");
		Emp emp = dao.selectByEmpno(7499);
		if(emp==null) {
			System.out.println("찾는 정보가 없습니다.");
		} else {
			System.out.println(emp);
		}
		
		/*
		System.out.println("4. 사원등록...");
		int re = dao.insert(new Emp(9004, "king3", "student", 200 ,null));
		if(re==0) System.out.println("등록되지 않았습니다.");
		else System.out.println("등록되었습니다.");
		*/
		
		System.out.println("4. 사원등록...");
		int re = dao.preparedInsert(new Emp(9005, "king4", "student", 200 ,null));
		if(re==0) System.out.println("등록되지 않았습니다.");
		else System.out.println("등록되었습니다.");
		
	}
}
