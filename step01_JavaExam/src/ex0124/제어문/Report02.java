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

public class Report02 {
	
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
		
		if(avg >= 90) grade = 'A';
		else if(avg >= 80 && avg < 90) grade = 'B';
		else if(avg >= 70 && avg < 80) grade = 'C';
		else if(avg >= 60 && avg < 70) grade = 'D';
		else grade = 'E';
		
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
