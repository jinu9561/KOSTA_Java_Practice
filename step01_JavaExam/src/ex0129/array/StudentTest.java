package ex0129.array;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생관리 프로그램을 시작합니다***");
		
		StudentService service = new StudentService();
		Scanner sc = new Scanner(System.in);
		
		service.init(); // 초기치 데이터 세팅
		
		// 전체 학생 정보 출력
		service.selectAll();
		
		// 등록하기'
		for(int i = 0; i < 3; i++) {
			System.out.println("--등록하기----------");
			Student st = new Student();
			System.out.print("이름: ");
			st.setName(sc.next());
			System.out.print("나이: ");
			st.setAge(sc.nextInt());
			System.out.print("주소: ");
			st.setAddr(sc.next());
			
			service.insert(st);
		}
	
		
		// 이름으로 검색하기
		System.out.println("--검색하기----------");
		System.out.println("이름: ");
		service.selectByName(sc.next());
		
		// 수정하기
		System.out.println("--수정하기----------");
		Student stUpdate = new Student();
		System.out.print("이름: ");
		stUpdate.setName(sc.next());
		System.out.print("나이: ");
		stUpdate.setAge(sc.nextInt());
		System.out.print("주소: ");
		stUpdate.setAddr(sc.next());
		
		service.update(stUpdate);
		
		// 전체 학생 정보 출력
		service.selectAll();
	}
}
