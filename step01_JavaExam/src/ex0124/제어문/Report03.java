package ex0124.���;

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

public class Report03 {
	
	public static void main(String[] args) {
		
		String name = "������";
		int korean, english, math, total;
		double avg;
		char grade;
		
		// ������ ������ 45~100 ������ ������ ����
		// 90�̻� a 80~89 b 70~79 c 60~69 d, �������� e
		
		korean = (int)(Math.random() * 56 + 45);
		english = (int)(Math.random() * 56 + 45);
		math = (int)(Math.random() * 56 + 45);
		
		total = korean + english + math;
		
		avg = total/3.0;
		
		grade = switch ((int)(avg/10)) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'E';
		};
		
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
