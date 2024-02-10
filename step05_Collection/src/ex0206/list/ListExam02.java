package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam02 { 
	public ListExam02() {
		
		// List<Integer> list = new ArrayList<Integer>(5); // size 5���� ArrayList ����
		// List<Integer> list = new LinkedList<Integer>(); // size 5���� ArrayList ����
		List<Integer> list = new Vector<Integer>(5); // size 5���� ArrayList ����
		
		System.out.println("����� ���� : " + list.size()); 
		
		// ��Ҹ� �߰�
		list.add(1);
		list.add(24);
		list.add(3);
		list.add(423);
		list.add(9999);
		list.add(2); // �ڷᱸ���� �����ϸ� �÷���
		list.add(3);
		
		System.out.println("�߰��� ����� ���� : " + list.size()); 
		
		// list ���� ��� ������
		for(int i = 0; i < list.size(); i++) {
			int no = list.get(i);
			System.out.print(no + ", ");
		}
		
		System.out.println("\n\nthis = " + list);
		
		// ��� ����
		list.remove(2);// 3��° ��� ����
		list.remove(4);
		
		System.out.println("\n-----������ for��------");
		for(int i : list) {
			System.out.print(i + ", ");
		} 
		
		System.out.println("\n\nthis = " + list);
		
		// ����
		Collections.sort(list);
		System.out.println("\nthis = " + list);
		
		Collections.sort(list, Collections.reverseOrder()); // ��������
		System.out.println("\nthis = " + list);

	}
	
	public static void main(String[] args) {
		new ListExam02();
		
		
	}
}
