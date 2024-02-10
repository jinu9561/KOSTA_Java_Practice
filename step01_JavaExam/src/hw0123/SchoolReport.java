package hw0123;

import java.util.Random;

/**
* document 주석 = api 주석 = 협업할때 다른 사람을 위한 주석
* @author 정진우
*  :성적관리 프로그램
* */

//부분주석

/*
 * 전체주석
 */

public class SchoolReport {
	
	public static void main(String[] args) {
		
		String name = "정진우";
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
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		avg *= 100;
		System.out.println("평균: " + (int)avg/100.0);
		System.out.println("학점: " + grade);
	}
}
