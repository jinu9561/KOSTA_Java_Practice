package ex0124.제어문;

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

public class Report02 {
	
	public static void main(String[] args) {
		
		String name = "정진우";
		int korean, english, math, total;
		double avg;
		char grade;
		
		// 국영수 점수를 45~100 사이의 난수로 저장
		// 90이상 a 80~89 b 70~79 c 60~69 d, 나머지는 e
		
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
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		avg *= 100;
		System.out.println("평균: " + (int)avg/100.0);
		System.out.println("학점: " + grade);
	}
}
