package ex0125.method;

class MethodInvoke01{
	//������ ���� �޼ҵ带 �ۼ��ϼ���.
	
	/*method �̸� : method01
	��𼭳� ������ ���ٰ���
	���� ����
	�μ��� ����2�� ����
	�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ����*/
		
	public int method01(int a, int b) {
		System.out.println(a + " * " + b + " = " + a*b);
		return a*b;
	}
}

class MethodInvoke02{
	
	//method �̸� : method02
	//��𼭳� ������ ���ٰ���,��ü�� �������� �ʰ� ���ٰ���
	//���� ����
	//�μ��� ����2�� ����
	
	//�μ��� ���� ���� 2���� ���ؼ� ����ϰ� ���Ѽ� ����
		
	public static int method02(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
		return a + b;
	}
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01�� method01 ȣ��
		MethodInvoke01 mi01 = new MethodInvoke01();
		int a = mi01.method01(3, 5);
		System.out.println("���ϰ��� " + a);

		//MethodInvoke02�� method02 ȣ��
		int b = MethodInvoke02.method02(34, 12);
		System.out.println("���ϰ��� " + b);

	}
}

