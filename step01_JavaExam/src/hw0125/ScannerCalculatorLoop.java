package hw0125;

import java.util.Scanner;

public class ScannerCalculatorLoop {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=============================================");
			System.out.println("1.���ϱ� || 2.���� || 3.���ϱ� || 4.������ || 5.����");
			System.out.println("=============================================");
			
			System.out.print("���� > ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("---------");
				System.out.println("  ���ϱ�");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("+");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.plus(a, b));
			} else if(select == 2) {
				System.out.println("---------");
				System.out.println("   ����");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("-");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.minus(a, b));
			} else if(select == 3) {
				System.out.println("---------");
				System.out.println("  ���ϱ�");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("*");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.multiple(a, b));
			} else if(select == 4) {
				System.out.println("---------");
				System.out.println("  ������");
				System.out.println("---------");
				int a = sc.nextInt();
				System.out.println("/");
				int b = sc.nextInt();
				System.out.println("= " + Calculate.divide(a, b));
			} else if(select == 5) {
				System.out.println("-----------------");
				System.out.println("  �ý����� �����մϴ�");
				System.out.println("-----------------");
				break;
			} else {
				System.out.println("�߸��� �Է¾��Դϴ�!");
			}

		
		}
	}

}
	

