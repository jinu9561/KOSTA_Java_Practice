package hw0125;

import java.util.Scanner;

public class ScannerBankAccount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.println("----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------");
			
			System.out.print("����> ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.print("���ݾ�> ");
				int in = sc.nextInt();
				sum += in;
				
			} else if(select == 2) {
				System.out.print("��ݾ�> ");
				int out = sc.nextInt();
				sum -= out;
				
			} else if(select == 3) {
				System.out.println("�ܰ�> " + sum);
				
			} else if(select == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�߸��� �Է¾��Դϴ�!");
			}
		}
		
	}

}
