package hw0125;

import java.util.Scanner;

public class ScannerCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ΰ��� ������ ��Ģ�����ȣ(+ , - , *, / )�� �Է��Ͻÿ�.");
		int a = sc.nextInt();
		String s = sc.next();
		int b = sc.nextInt();
		
		
		switch (s) {
		case "+" :  System.out.println("= " + Calculate.plus(a, b)); break;
		case "-" :  System.out.println("= " + Calculate.minus(a, b)); break;
		case "*" :  System.out.println("= " + Calculate.multiple(a, b)); break;
		case "/" :  System.out.println("= " + Calculate.divide(a, b)); break;
		default: System.out.println("�����ȣ�� �߸��Ǿ����ϴ�.");
			
		}
	}
}

class Calculate {
	public static int plus(int a, int b) {
		return a+b;
	}
	public static int minus(int a, int b) {
		return a-b;
	}
	public static int multiple(int a, int b) {
		return a*b;
	}
	public static double divide(int a, int b) {
		return (double)a/(double)b;
	}
	
}
