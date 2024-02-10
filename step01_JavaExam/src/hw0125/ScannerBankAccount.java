package hw0125;

import java.util.Scanner;

public class ScannerBankAccount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("예금액> ");
				int in = sc.nextInt();
				sum += in;
				
			} else if(select == 2) {
				System.out.print("출금액> ");
				int out = sc.nextInt();
				sum -= out;
				
			} else if(select == 3) {
				System.out.println("잔고> " + sum);
				
			} else if(select == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력어입니다!");
			}
		}
		
	}

}
