package hw0125;

import java.util.Scanner;

public class ScannerGrade {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("##########성적표 구하기#########\n");
		while(true) {
			System.out.println("=======================");
			System.out.println("1. 성적표 구하기 || 2. 종료 ");
			System.out.println("=======================\n");
			
			System.out.print("선택> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("# 이름 입력: ");
				String name = sc.next();
				
				System.out.println("# 점수 입력");
				System.out.print("국어> ");
				int kor = sc.nextInt();
				System.out.print("영어> ");
				int eng = sc.nextInt();
				System.out.print("수학> ");
				int math = sc.nextInt();
				
				int sum = Grade.sum(kor, eng, math);
				double avg = Grade.avg(sum, 3);
				char grade = Grade.grade(avg);
				
				System.out.println("----------성적표----------");
				System.out.println("이름 : " + name);
				System.out.println("--------------------");
				System.out.println("국어 : " + kor + "점");
				System.out.println("영어 : " + eng + "점");
				System.out.println("수학 : " + math + "점");
				System.out.println("--------------------");
				System.out.println("총점 : " + sum + "점");
				System.out.println("평균 : " + (int)(avg*100)/100.0 + "점");
				System.out.println("학점 : " + grade);
				
			} else if(select == 2) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력어입니다!");
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

