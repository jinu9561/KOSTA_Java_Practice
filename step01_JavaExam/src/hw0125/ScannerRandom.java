package hw0125;

import java.util.Random;
import java.util.Scanner;

public class ScannerRandom {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 숫자를 입력하시오");
		int start = sc.nextInt();
		int finish = sc.nextInt();
		
		RandomNumber.getRandomInt1(start, finish);
		System.out.println();
		RandomNumber.getRandomInt2(start, finish);
		
	}

}

class RandomNumber {
	public static void getRandomInt1(int a, int b) {
		for(int i = 0; i < 100; i++) {
			int res = (int)(Math.random()*(b-a) + a);
			System.out.print(res + " ");
		}
	}
	
	public static void getRandomInt2(int a, int b) {
		Random r = new Random();
		for(int i = 0; i < 100; i++) {
			int res = r.nextInt(a,b);
			System.out.print(res + " ");
		}
	}
}
