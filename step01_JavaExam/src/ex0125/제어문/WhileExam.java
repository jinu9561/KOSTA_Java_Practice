package ex0125.제어문;

public class WhileExam {

	public static void main(String[] args) {
		// 1~100 까지 한줄 출력
		int a = 1;
		
		while(a < 101) {
			System.out.print(a + " ");
			a++;
		}
		
		System.out.println();
		
		// A~Z까지 한줄출력
		char b = 'A';
		
		while(b <= 'Z') {
			System.out.print(b + " ");
			b++;
		}
		System.out.println();
		
		// 1~100 사이의 3의 배수의 합
		int c = 1;
		int sum = 0;
		
		while(c < 101) {
			if(c%3 == 0) sum += c;
			c++;
		}
		System.out.println(sum);
		
		
		// 1~100까지 10행 10열로 출력 (2중 while이용)
		int d = 1;
		int e = 1;
		
		while(d < 11) {
			while(e <= d*10) {
				System.out.print(e + "\t");
				e++;
			}
			System.out.println();
			d++;
		}
		
		
		
	}
	
}
