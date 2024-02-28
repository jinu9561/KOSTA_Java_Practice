package ex0130.constructor;

//
// �̱��� Ŭ���� ����� ���
//  1) private �����ڸ� �����.
//  2) static ����ʵ带 �̿��ؼ� ��ü�� ����
//  3) �ڱ��ڽ� ��ü�� �������ִ� static �޼ҵ� ������
//


class Test{
	private static Test t = new Test(); // ���������̹Ƿ� 100���� �ҷ��鿩�� 1����
	
	// private �����ڴ� �ܺο��� ��ü�� ���� �����Ҽ� ������ �ϴ°�
	private Test() { }
	
	// �ڱ��ڽ� ��ü�� ���� �����ؼ� �������ִ� �޼ҵ� �����Ѵ�.
	public static Test getInstance() {
		// Test t = new Test();
		return t;
	}
	
}

public class PrivateConstructorExam {

	public static void main(String[] args) {

		// new Test(); // ������ ȣ�� -> private �����ڸ� ���� �־ ��ü ���� ����
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		
	}

}
