package ex0125.제어문;

public class DoWhileExam {
	
	public static void main(String[] args) {
		// 1~100 까지 한줄 출력
		int a = 1;
		do {
			System.out.print(a + " ");
			a++;
		} while(a < 101);
		
		System.out.println();
		
		// A~Z까지 한줄출력
		char b = 'A';
		do {
			System.out.print(b + " ");
			b++;
		} while(b <= 'Z');
		
		System.out.println();
		
		// 1~100 사이의 3의 배수의 합
		int c = 1;
		int sum = 0;
		
		do {
			if(c%3 == 0) sum += c;
			c++;
		} while(c < 101);
		
		System.out.println(sum);
		
		
		// 1~100까지 10행 10열로 출력 (2중 while이용)
		int d = 1;
		int e = 1;
		
		do {
			do {
				System.out.print(e + "\t");
				e++;
			} while(e <= d*10);
			System.out.println();
			d++;
		} while(d < 11);
		
		
	}

}
