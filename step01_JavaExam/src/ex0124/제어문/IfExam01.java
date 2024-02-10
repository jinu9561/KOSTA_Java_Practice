package ex0124.제어문;

public class IfExam01 {
	public static void main(String[] args) {
		int a = 80;
		if(a%2 == 0) System.out.println("짝수");
		else System.out.println("홀수");
		
		System.out.println("---------------------------");
		double nansu = Math.random(); // 0.0 ~ 0.999999
		System.out.println(nansu);
		// 1~10 사이의 숫자
		// Math.random() * 경우의 수 + 최솟값
		nansu = nansu*10 + 1;
		System.out.println(nansu);
		System.out.println((int)nansu);
	}
	

}
