package step03_Exception.ex0205;


// ���� ó�����2 : ������ 
// 1) ���ܸ� �������� ���Ƽ� �ѹ��� ó���ϱ� ���ؼ�
// 2) �����Ǵ� �޼ҵ忡�� �߻��� �� �ִ� ���������� �����ϰ� ȣ���ϴ� �ʿ��� �����ϰ� ����ó���� �� �� �ֵ��� �Ѵ�.

class Test {
	public void aa(int i) {
		System.out.println("Test aa() ȣ���...");
		
		try {
			this.bb(i);
		} catch (ArithmeticException e) {
			System.out.println("aa�޼ҵ��� catch �����Դϴ�.");
		}
		
		System.out.println("Test aa() ȣ�ⳡ...");
	}
	
	public void bb(int i) throws ArithmeticException { // ���� ó�����2 : ������ -> ȣ���Ѱ��� ó���϶�� ����
		System.out.println("Test bb() ȣ���...");
		
//		try { // ���� ó�����1 : ���� ó�� ���
//			int result = 100/i; // ArithmeticException ���ɼ� �ִ�.
//			System.out.println("���� ��� = " + result);		
//		} catch (ArithmeticException e) {
//			e.printStackTrace();
//		}
		
		try {
			int result = 100/i; // ArithmeticException ���ɼ� �ִ�.
			System.out.println("���� ��� = " + result);	
		} finally {
			System.out.println("Test bb() ȣ�ⳡ...");
		}
		
		System.out.println("Test bb() ȣ�ⳡ..."); // throws �ÿ��� �����͵��� ȣ�� �ȵǹǷ� ȣ���Ϸ��� finally�� ��� ȣ���
	}
}


public class ThrowsExceptionExam {

	public static void main(String[] args) {
		
		System.out.println("----���� �����մϴ�--------");
		
		try {
//			new Test().aa(5);
			new Test().aa(0);
		} catch (ArithmeticException e) {
			System.out.println("main�� catch�Դϴ�.");
		}
		
		
		
		
		System.out.println("----���� ���Դϴ�---------");
		
		
	}

}
