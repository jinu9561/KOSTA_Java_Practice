package ex0201.final_abstract;

class Test{
//	final int age = 20; // �ݵ�� �ʱ�ȭ �ʼ� (����� �ʱ�ȭ or �����ڸ� �̿��� �ʱ�ȭ)
	
	final int age;
	
	static final int pie = 20; // static final�� ������ �ʱ�ȭ�� ����
	
	static final int pie2; // ����� �ʱ�ȭ or static ������ �ʱ�ȭ ���� = constant = ���
	static {
		pie2 = 100;
	}
	
	Test(int age){
		this.age = age; // �����ڸ� �̿��� �ʱ�ȭ
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////

public class FinalVsConstantExaml {
	public static void main(String[] args) {
		
		Test t = new Test(20);
		System.out.println("t.age = " + t.age);
		// t.age = 30; // final �ʵ��̹Ƿ� ������ �Ұ�
		
		Test t2 = new Test(30);
		System.out.println("t2.age = " + t2.age);
		
	}

}
