package step03_Exception.ex0205;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ThrowExam {
	
	public void aa(int i) throws IOException , ArithmeticException {
		try {
			System.out.println("aa method call...");
			//인수가 음수이면 안된다!! -> 강제로 예외를 발생시킨다.
			if(i < 0) {
				throw new IOException("음수는 않되~~"); // 체크 예외
//				throw new RuntimeException("음수는 않되~~~~~"); // 비체크 예외
			}
			
			System.out.println("양수 i의 값은 = " + i);
			int result = 100/i;
			
		} finally {
			System.out.println("aa method End...");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("---메인 시작---");
		
		try {
			new ThrowExam().aa(0);
		} catch (IOException | ArithmeticException e) {
			System.out.println("첫번째 예외 : " + e.getMessage());
		}
		
		System.out.println("---메인 끝---");
		
	}
}
