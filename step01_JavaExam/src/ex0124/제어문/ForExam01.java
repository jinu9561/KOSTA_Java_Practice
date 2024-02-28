package ex0124.제어문;

public class ForExam01 {

	public static void main(String[] args) {
		// 1 ~ 100까지 한줄로 출력 
		for(int i = 1; i < 101; i++) System.out.print(i + " ");
		System.out.println();
		System.out.println();
		
		// A ~ Z까지 한줄로 출력
		for(char ch = 'A'; ch <= 'Z'; ch++) System.out.print(ch + " ");
		System.out.println();
		System.out.println();
		
		// 1 ~ 10까지의 합
		int sum = 0;
		for(int i = 1; i < 11; i++) sum += i;
		System.out.println(sum);
		System.out.println();
		
		 //1 ~ 100사이의 7의 배수만 출력
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
		
		// 1 ~ 100사이의 7의 배수만 출력
		for(int i = 100; i > 0; i--) {
			if(i%7 == 0) System.out.print(i + " ");
		}
		
	}

}
