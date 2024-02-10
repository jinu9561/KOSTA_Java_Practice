package hw0125;

import java.util.Scanner;

public class ScannerGrade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("##########����ǥ ���ϱ�#########\n");
		while(true) {
			System.out.println("=======================");
			System.out.println("1. ����ǥ ���ϱ� || 2. ���� ");
			System.out.println("=======================\n");
			
			System.out.print("����> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("# �̸� �Է�: ");
				String name = sc.next();
				
				System.out.println("# ���� �Է�");
				System.out.print("����> ");
				int kor = sc.nextInt();
				System.out.print("����> ");
				int eng = sc.nextInt();
				System.out.print("����> ");
				int math = sc.nextInt();
				
				int sum = Grade.sum(kor, eng, math);
				double avg = Grade.avg(sum, 3);
				char grade = Grade.grade(avg);
				
				System.out.println("----------����ǥ----------");
				System.out.println("�̸� : " + name);
				System.out.println("--------------------");
				System.out.println("���� : " + kor + "��");
				System.out.println("���� : " + eng + "��");
				System.out.println("���� : " + math + "��");
				System.out.println("--------------------");
				System.out.println("���� : " + sum + "��");
				System.out.println("��� : " + (int)(avg*100)/100.0 + "��");
				System.out.println("���� : " + grade);
				
			} else if(select == 2) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �Է¾��Դϴ�!");
			}
			
		}
		
	}
	
	class Grade {
		
		private static int sum(int kor, int eng, int math) {
			return kor + eng + math;
		}
		
		private static double avg(int sum, int num) {
			return (double)sum / (double)num;
		}
		
		private static char grade(double avg) {
			if(avg >= 90) return 'A';
			else if(avg >= 80 && avg < 90) return 'B';
			else if(avg >= 70 && avg < 80) return 'C';
			else if(avg >= 60 && avg < 70) return 'D';
			else return 'F';
		}
		
	}

}

