package ex0207.set;

import java.util.HashSet;

public class MemberSetExam extends HashSet<Member> {
	
	public MemberSetExam() {
		// set의 중복체크를 위해서 hashcode()를 호출하고 그 결과가 다르면 추가, 
		// 같으면 equals()를 호출해서 false 이면 추가,
		// true이면 추가 안됨
		super.add(new Member("희정", 20, "서울"));
		super.add(new Member("희정", 20, "서울")); // 실제로 들어간건 주소값이라 두개가 다름 (중복 아님)
		super.add(new Member("희수", 23, "대구"));
		super.add(new Member("진우", 21, "대전"));
		super.add(new Member("철수", 25, "서울"));
		
		System.out.println("저장된 객체의 개수 : " + super.size());
		System.out.println(this);
	}
	
	
	public static void main(String[] args) {
		new MemberSetExam();
	}
}
