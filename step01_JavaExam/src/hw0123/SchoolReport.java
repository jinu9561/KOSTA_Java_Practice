package hw0123;

import java.util.Random;

/**
* document �ּ� = api �ּ� = �����Ҷ� �ٸ� ����� ���� �ּ�
* @author ������
*  :�������� ���α׷�
* */

//�κ��ּ�

/*
 * ��ü�ּ�
 */

public class SchoolReport {
	
	public static void main(String[] args) {
		
		String name = "������";
		int korean, english, math, total;
		double avg;
		char grade;
		
		Random random = new Random();
		
		korean = random.nextInt(80,100);
		english = random.nextInt(80,100);
		math = random.nextInt(80,100);
		
		total = korean + english + math;
		
		avg = total/3.0;
		
		grade = avg >= 90 ? 'A' : 'F';
		
		System.out.println(name);
		System.out.println("����: " + korean);
		System.out.println("����: " + english);
		System.out.println("����: " + math);
		System.out.println("����: " + total);
		avg *= 100;
		System.out.println("���: " + (int)avg/100.0);
		System.out.println("����: " + grade);
	}
}
