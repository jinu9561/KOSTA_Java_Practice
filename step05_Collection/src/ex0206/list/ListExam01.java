package ex0206.list;

import java.util.ArrayList;
import java.util.Collections;

public class ListExam01 extends ArrayList<Integer> { // ListExam01�� ArrayList�̴�. // <Integer>�� ���ʸ���!!
	public ListExam01() {
		super(5); // 5��¥�� ArrayList �������
		
		System.out.println("����� ���� : " + size()); // super. this. ��������
		
		// ��Ҹ� �߰�
		this.add(1);
		this.add(24);
		this.add(3);
		this.add(423);
		this.add(9999);
		this.add(2); // �ڷᱸ���� �����ϸ� �÷���
		this.add(3);
		
		System.out.println("�߰��� ����� ���� : " + size()); 
		
		// list ���� ��� ������
		for(int i = 0; i < size(); i++) {
			int no = get(i);
			System.out.print(no + ", ");
		}
		
		System.out.println("\n\nthis = " + this);
		
		// ��� ����
		super.remove(2);// 3��° ��� ����
		super.remove(4);
		
		System.out.println("\n-----������ for��------");
		for(int i : this) {
			System.out.print(i + ", ");
		} 
		
		System.out.println("\n\nthis = " + this);
		
		// ����
		Collections.sort(this);
		System.out.println("\nthis = " + this);
		
		Collections.sort(this, Collections.reverseOrder()); // ��������
		System.out.println("\nthis = " + this);

	}
	
	public static void main(String[] args) {
		new ListExam01();
		
		
	}
}
