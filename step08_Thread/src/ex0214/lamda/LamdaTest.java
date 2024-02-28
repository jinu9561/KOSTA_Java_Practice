package ex0214.lamda;

public class LamdaTest {
	public static void main(String[] args) {
		//기존코딩방식
		/*AInterface ai = new Test();
		ai.aa();*/
		
		//@FunctionalInterface 인경우 람다식으로 변경가능하다.
		
		////////////////////////////////////
		
		//  () -> { }
		/*AInterface ai = ()->{
			System.out.println("람다식... aa() call...");
		};*/
		
		AInterface ai = () -> System.out.println("람다식... aa() call...");
		ai.aa();
		

	}

}

///////////////////////////////
class Test implements AInterface{
	@Override
	public void aa() {
		System.out.println("Test의 aa() call....");
		
	}
}
