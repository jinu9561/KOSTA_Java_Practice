package ex0214.lamda;

public class LamdaTest {
	public static void main(String[] args) {
		//�����ڵ����
		/*AInterface ai = new Test();
		ai.aa();*/
		
		//@FunctionalInterface �ΰ�� ���ٽ����� ���氡���ϴ�.
		
		////////////////////////////////////
		
		//  () -> { }
		/*AInterface ai = ()->{
			System.out.println("���ٽ�... aa() call...");
		};*/
		
		AInterface ai = () -> System.out.println("���ٽ�... aa() call...");
		ai.aa();
		

	}

}

///////////////////////////////
class Test implements AInterface{
	@Override
	public void aa() {
		System.out.println("Test�� aa() call....");
		
	}
}
