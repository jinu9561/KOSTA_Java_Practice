package step03_Exception.ex0205;


// 예외 처리방법2 : 던지기 
// 1) 예외를 한쪽으로 몰아서 한번에 처리하기 위해서
// 2) 제공되는 메소드에서 발생할 수 있는 예외정보르 제공하고 호출하는 쪽에서 적절하게 예외처리를 할 수 있도록 한다.

class Test {
	public void aa(int i) {
		System.out.println("Test aa() 호출됨...");
		
		try {
			this.bb(i);
		} catch (ArithmeticException e) {
			System.out.println("aa메소드의 catch 영역입니다.");
		}
		
		System.out.println("Test aa() 호출끝...");
	}
	
	public void bb(int i) throws ArithmeticException { // 예외 처리방법2 : 던지기 -> 호출한곳에 처리하라고 던짐
		System.out.println("Test bb() 호출됨...");
		
//		try { // 예외 처리방법1 : 직접 처리 방법
//			int result = 100/i; // ArithmeticException 가능성 있다.
//			System.out.println("나눈 결과 = " + result);		
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		try {
			int result = 100/i; // ArithmeticException 가능성 있다.
			System.out.println("나눈 결과 = " + result);	
		} finally {
			System.out.println("Test bb() 호출끝...");
		}
		
		System.out.println("Test bb() 호출끝..."); // throws 시에는 다음것들은 호출 안되므로 호출하려면 finally를 써야 호출됨
	}
}


public class ThrowsExceptionExam {

	public static void main(String[] args) {
		
		System.out.println("----메인 시작합니다--------");
		
		try {
//			new Test().aa(5);
			new Test().aa(0);
		} catch (ArithmeticException e) {
			System.out.println("main의 catch입니다.");
		}
		
		
		
		
		System.out.println("----메인 끝입니다---------");
		
		
	}

}
