package ex0124.���;

public class ForExam01 {

	public static void main(String[] args) {
		// 1 ~ 100���� ���ٷ� ��� 
		for(int i = 1; i < 101; i++) System.out.print(i + " ");
		System.out.println();
		System.out.println();
		
		// A ~ Z���� ���ٷ� ���
		for(char ch = 'A'; ch <= 'Z'; ch++) System.out.print(ch + " ");
		System.out.println();
		System.out.println();
		
		// 1 ~ 10������ ��
		int sum = 0;
		for(int i = 1; i < 11; i++) sum += i;
		System.out.println(sum);
		System.out.println();
		
		 //1 ~ 100������ 7�� ����� ���
		for(int i = 1; i < 101; i++) {
			if(i%7 == 0) System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		for(int i = 7; i < 101; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		
		// 1 ~ 100������ 7�� ����� ���
		for(int i = 100; i > 0; i--) {
			if(i%7 == 0) System.out.print(i + " ");
		}
		
	}

}
