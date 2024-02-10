package ex0126.overloading;

public class VariableArgsExam {
	
//	public void test(int ... i) { // 0�� �̻��� int�� �μ��� ����Ѵ�
//		System.out.println(i);
//	}
	
	public void test(Object... i) { // 0�� �̻��� �μ��� � Ÿ���̴� ����Ѵ�
		System.out.println(i);
	}
	
	public void test2(String name, int ... i) { // public void test2(String ... name, int ... i) { 
		// -> ������ (...�� ������ �����̶� �տ� ���� �ȵ�)
		
	}
	
	public static void main(String[] args) {
		
		VariableArgsExam va = new VariableArgsExam(); // ��ü�� �����ϰ� ȣ���ؾ��ϴ� ���� : ���� �޼ҵ�� static �̱� ����
		va.test(4);
		va.test();
		va.test(4, 3, 1);
		va.test(4, 3, 5, 6, 7, 98);
		
		va.test( 3.2 );
		va.test( true );
		va.test( 3.2, "dasad" );
		

	}

}
