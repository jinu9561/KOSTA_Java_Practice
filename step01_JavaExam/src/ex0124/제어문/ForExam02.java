package ex0124.제어문;

public class ForExam02 {

	public static void main(String[] args) {
		// 1 ~ 100까지 10행 10열로 출력 (2중 for문)
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j < 11; j++) 
				System.out.print(j + i*10 + "\t");
			System.out.println();
		}
		System.out.println();
		
		// 구구단 출력
		for(int i =1; i < 10; i++) {
			for(int j =2; j < 10; j++) 
				System.out.print(j + " X " + i + " = " + i*j + "\t");
			System.out.println();
		}
		
		// 
		
		
		// 
		
	}

}
