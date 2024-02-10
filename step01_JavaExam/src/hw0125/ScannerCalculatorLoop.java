package hw0125;

import java.util.Scanner;

public class ScannerCalculatorLoop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("1.더하기 || 2.빼기 || 3.곱하기 || 4.나누기 || 5.종료");
			System.out.println("=============================================");
			
			System.out.print("선택 > ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("---------");
				System.out.println("  더하기");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("+");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.plus(a, b));
			} else if(select == 2) {
				System.out.println("---------");
				System.out.println("   빼기");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("-");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.minus(a, b));
			} else if(select == 3) {
				System.out.println("---------");
				System.out.println("  곱하기");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("*");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.multiple(a, b));
			} else if(select == 4) {
				System.out.println("---------");
				System.out.println("  나누기");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("/");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.divide(a, b));
			} else if(select == 5) {
				System.out.println("-----------------");
				System.out.println("  시스템을 종료합니다");
				System.out.println("-----------------");
				break;
			} else {
				System.out.println("잘못된 입력어입니다!");
			}

		
		}
	}

}
	

