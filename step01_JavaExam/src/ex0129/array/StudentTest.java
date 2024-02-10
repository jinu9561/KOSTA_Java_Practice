package ex0129.array;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***�л����� ���α׷��� �����մϴ�***");
		
		StudentService service = new StudentService();
		Scanner sc = new Scanner(System.in);
		
		service.init(); // �ʱ�ġ ������ ����
		
		// ��ü �л� ���� ���
		service.selectAll();
		
		// ����ϱ�'
		for(int i = 0; i < 3; i++) {
			System.out.println("--����ϱ�----------");
			Student st = new Student();
			System.out.print("�̸�: ");
			st.setName(sc.next());
			System.out.print("����: ");
			st.setAge(sc.nextInt());
			System.out.print("�ּ�: ");
			st.setAddr(sc.next());
			
			service.insert(st);
		}
	
		
		// �̸����� �˻��ϱ�
		System.out.println("--�˻��ϱ�----------");
		System.out.println("�̸�: ");
		service.selectByName(sc.next());
		
		// �����ϱ�
		System.out.println("--�����ϱ�----------");
		Student stUpdate = new Student();
		System.out.print("�̸�: ");
		stUpdate.setName(sc.next());
		System.out.print("����: ");
		stUpdate.setAge(sc.nextInt());
		System.out.print("�ּ�: ");
		stUpdate.setAddr(sc.next());
		
		service.update(stUpdate);
		
		// ��ü �л� ���� ���
		service.selectAll();
	}
}
