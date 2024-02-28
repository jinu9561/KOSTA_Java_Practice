package ex0126.overloading;

public class VariableArgsExam {
	
//	public void test(int ... i) { // 0개 이상의 int형 인수를 허용한다
//		System.out.println(i);
//	}
	
	public void test(Object... i) { // 0개 이상의 인수를 어떤 타입이던 허용한다
		System.out.println(i);
	}
	
	public void test2(String name, int ... i) { // public void test2(String ... name, int ... i) { 
		// -> 오류남 (...은 무한의 개념이라 앞에 오면 안됨)
		
	}
	
	public static void main(String[] args) {
		
		VariableArgsExam va = new VariableArgsExam(); // 객체를 생성하고 호출해야하는 이유 : 메인 메소드는 static 이기 때문
		va.test(4);
		va.test();
		va.test(4, 3, 1);
		va.test(4, 3, 5, 6, 7, 98);
		
		va.test( 3.2 );
		va.test( true );
		va.test( 3.2, "dasad" );
		

	}

}
