package ex0130;

import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		System.out.println("***�л����� ���α׷��� �����մϴ�***");
		
		StudentService service = new StudentService();
		
		// ��ü �л� ���� ���
		service.selectAll();
		
		// ����ϱ�'
		System.out.println("--����ϱ�----------");
		
		System.out.println("�μ�.29��.�뱸 ���");
		Student st = new Student("�μ�",29,"�뱸");
		service.insert(st);
		
		System.out.println("�μ�.29��.�뱸 ���");
		Student st2 = new Student("�μ�",36,"���");
		service.insert(st2);
		
		System.out.println("����.19��.�뱸 ���");
		Student st3 = new Student("����",19,"�뱸");
		service.insert(st3);
		
		System.out.println("����.20��.��� ���");
		Student st4 = new Student("����",20,"���");
		service.insert(st4);
		System.out.println();
	
		
		// �̸����� �˻��ϱ�
		System.out.println("--�˻��ϱ�----------");
		service.selectByName("����");
		
		System.out.println("�̸�: ����");
		service.selectByName("����");
		
		// �����ϱ�
		System.out.println("--�����ϱ�1----------");
		Student stUpdate = new Student("����",19,"�̱�");
		System.out.print("�̸�: ���� ����: 19 �ּ�: �̱�");
		service.update(stUpdate);
		
		System.out.println("--�����ϱ�2----------");
		Student stUpdate2 = new Student("����",29,"�̱�");
		service.update(stUpdate2);
		
		System.out.println("--�����ϱ�3----------");
		Student stUpdate4 = new Student("����","�±�");
		service.update(stUpdate4);
		
		// ��ü �л� ���� ���
		service.selectAll();
	}
}
