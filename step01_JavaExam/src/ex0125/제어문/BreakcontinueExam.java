package ex0125.���;

public class BreakcontinueExam {
	
	public static void main(String[] args) {
		outer : for(int a = 1; a <= 5; a++) {
			for(int b = 1; b <= 3; b++) {
//				if(b == 2) continue;
//				if(b == 2) break;
				if(b == 2) break outer;
				System.out.print(b + " ");
			}
			
			System.out.println();
		}
		
		// ������ 5�ܸ� ���� ���
		System.out.println("\n ������ 5�ܻ��� ����ϱ�");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(j == 5) continue;
				System.out.print(j + " X " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
		
		// ������ 5�ܱ����� ���
		
		System.out.println("\n ������ 5�ܱ����� ����ϱ�");
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 10; j++) {
				if(j > 5) break;
				System.out.print(j + " X " + i + " = " + i*j + "\t");
			}
			System.out.println();
		}
	}

}
