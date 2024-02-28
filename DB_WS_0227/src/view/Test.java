package view;

import java.util.List;

import dao.StudentTeacherDAO;
import dao.StudentTeacherDAOImpl;
import vo.Student;
import vo.Teacher;

public class Test {
	public static void main(String[] args) {
		StudentTeacherDAOImpl dao = new StudentTeacherDAOImpl();
		
		System.out.println("1. 성별이 여자인 학생의 정보 검색");
		List<Student> list = dao.getGenderByWomen();
		for(Student st : list) {
			System.out.println(st);
		}
		
		System.out.println("3. 구를 인수로 전달받아 구에 거주하는 강사의 정보 검색");
		List<Teacher> list2 = dao.getTeacherInfoByAddr("강남");
		for(Teacher t : list2) {
			System.out.println(t);
		}
		
		System.out.println("5. 과목을 인수로 전달받아 그 과목을 강의하는 강사의 정보 (서브쿼리)");
		Teacher teacher = dao.getTeacherInfoBySubject("sql");
		System.out.println(teacher);
		
		System.out.println("8. 강사의 번호를 인수로 전달받아 뷰에서 그 강사번호에 해당하는 정보를 출력");
		Teacher teacher2 = dao.getTeacherInfoByNo(3);
		System.out.println(teacher2);

		
	}
}
