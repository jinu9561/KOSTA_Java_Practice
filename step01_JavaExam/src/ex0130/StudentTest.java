package ex0130;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***학생관리 프로그램을 시작합니다***");
		
		StudentService service = new StudentService();
		
		// 전체 학생 정보 출력
		service.selectAll();
		
		// 등록하기'
		System.out.println("--등록하기----------");
		
		System.out.println("민수.29세.대구 등록");
		Student st = new Student("민수",29,"대구");
		service.insert(st);
		
		System.out.println("민수.29세.대구 등록");
		Student st2 = new Student("민수",36,"울산");
		service.insert(st2);
		
		System.out.println("진수.19세.대구 등록");
		Student st3 = new Student("진수",19,"대구");
		service.insert(st3);
		
		System.out.println("정우.20세.울산 등록");
		Student st4 = new Student("정우",20,"울산");
		service.insert(st4);
		System.out.println();
	
		
		// 이름으로 검색하기
		System.out.println("--검색하기----------");
		service.selectByName("진우");
		
		System.out.println("이름: 수민");
		service.selectByName("수민");
		
		// 수정하기
		System.out.println("--수정하기1----------");
		Student stUpdate = new Student("진우",19,"미국");
		System.out.print("이름: 진우 나이: 19 주소: 미국");
		service.update(stUpdate);
		
		System.out.println("--수정하기2----------");
		Student stUpdate2 = new Student("지수",29,"미국");
		service.update(stUpdate2);
		
		System.out.println("--수정하기3----------");
		Student stUpdate4 = new Student("진수","태국");
		service.update(stUpdate4);
		
		// 전체 학생 정보 출력
		service.selectAll();
	}
}
