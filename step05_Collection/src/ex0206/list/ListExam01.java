package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer> { // ListExam01는 ArrayList이다. // <Integer>는 제너릭임!!
	public ListExam01() {
		super(5); // 5개짜리 ArrayList 만들어짐
		
		System.out.println("요소의 개수 : " + size()); // super. this. 생략가능
		
		// 요소를 추가
		this.add(1);
		this.add(24);
		this.add(3);
		this.add(423);
		this.add(9999);
		this.add(2); // 자료구조는 부족하면 늘려줌
		this.add(3);
		
		System.out.println("추가후 요소의 개수 : " + size()); 
		
		// list 안의 요소 꺼내기
		for(int i = 0; i < size(); i++) {
			int no = get(i);
			System.out.print(no + ", ");
		}
		
		System.out.println("\n\nthis = " + this);
		
		// 요소 제거
		super.remove(2);// 3번째 요소 제거
		super.remove(4);
		
		System.out.println("\n-----개선된 for문------");
		for(int i : this) {
			System.out.print(i + ", ");
		} 
		
		System.out.println("\n\nthis = " + this);
		
		// 정렬
		Collections.sort(this);
		System.out.println("\nthis = " + this);
		
		Collections.sort(this, Collections.reverseOrder()); // 내림차순
		System.out.println("\nthis = " + this);

	}
	
	public static void main(String[] args) {
		new ListExam01();
		
		
	}
}
