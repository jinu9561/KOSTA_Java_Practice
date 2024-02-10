package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam02 { 
	public ListExam02() {
		
		// List<Integer> list = new ArrayList<Integer>(5); // size 5개인 ArrayList 생성
		// List<Integer> list = new LinkedList<Integer>(); // size 5개인 ArrayList 생성
		List<Integer> list = new Vector<Integer>(5); // size 5개인 ArrayList 생성
		
		System.out.println("요소의 개수 : " + list.size()); 
		
		// 요소를 추가
		list.add(1);
		list.add(24);
		list.add(3);
		list.add(423);
		list.add(9999);
		list.add(2); // 자료구조는 부족하면 늘려줌
		list.add(3);
		
		System.out.println("추가후 요소의 개수 : " + list.size()); 
		
		// list 안의 요소 꺼내기
		for(int i = 0; i < list.size(); i++) {
			int no = list.get(i);
			System.out.print(no + ", ");
		}
		
		System.out.println("\n\nthis = " + list);
		
		// 요소 제거
		list.remove(2);// 3번째 요소 제거
		list.remove(4);
		
		System.out.println("\n-----개선된 for문------");
		for(int i : list) {
			System.out.print(i + ", ");
		} 
		
		System.out.println("\n\nthis = " + list);
		
		// 정렬
		Collections.sort(list);
		System.out.println("\nthis = " + list);
		
		Collections.sort(list, Collections.reverseOrder()); // 내림차순
		System.out.println("\nthis = " + list);

	}
	
	public static void main(String[] args) {
		new ListExam02();
		
		
	}
}
