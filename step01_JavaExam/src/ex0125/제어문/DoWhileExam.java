package ex0125.���;

public class DoWhileExam {
	
	public static void main(String[] args) {
		// 1~100 ���� ���� ���
		int a = 1;
		do {
			System.out.print(a + " ");
			a++;
		} while(a < 101);
		
		System.out.println();
		
		// A~Z���� �������
		char b = 'A';
		do {
			System.out.print(b + " ");
			b++;
		} while(b <= 'Z');
		
		System.out.println();
		
		// 1~100 ������ 3�� ����� ��
		int c = 1;
		int sum = 0;
		
		do {
			if(c%3 == 0) sum += c;
			c++;
		} while(c < 101);
		
		System.out.println(sum);
		
		
		// 1~100���� 10�� 10���� ��� (2�� while�̿�)
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
