package ex0125.method;

//MakeMethodExam.java
class MakeMethodExam{
	public static void main(String []args){
		MakeMethodExam mme=new MakeMethodExam();
		int k=mme.methodExam01(33);
		System.out.println(k);
		mme.methodExam02();
		mme.methodExam03(42);
		String s = mme.methodExam04(17);
		System.out.println(s);

	}

/*
	Method�̸� : methodExam01
	�ڱ��ڽŸ� ���ٰ���
	Return Type : ����
	Parameter : ����1��
	(�����ο���)�ϴ��� : 
	�μ��� ����(����)������ ����ϰ� �μ��� 2�� ���� Return
*/
	
	private int methodExam01(int num) {
		System.out.println("�μ��� �� = " + num);
		return num*2;
	}

/*
	Method�̸� : methodExam02
	��𿡼��� �ƹ��� ���ٰ���
	Return ����	
	Parameter ����
	(�����ο���)�ϴ��� : �ƹ��ų� ���
*/
	
	public void methodExam02() {
		System.out.println("�ƹ��ų�!");
	}
	
/*
	Method�̸� : methodExam03
	����pakage������ �ƹ��� ���ٰ���
	Return Type : Return ����
	Parameter : ����1��	
	(�����ο���)�ϴ��� : �μ��� ����(����) ������ ����ϰ�
		�׼��� ¦����� "¦��",Ȧ�����"Ȧ��" ���
*/
	
	void methodExam03(int num) {
		System.out.println("�μ��� �� = " + num);
		if(num%2 == 0) System.out.println(num + "�� ¦��");
		else System.out.println(num + "�� Ȧ��");
	}
	
/*
	Method�̸� : methodExam04
	��Ӱ����� ��𼭳� ���ٰ���
	Return Type : StringŸ��
	Parameter : ����1��	
	(�����ο���)�ϴ��� : �μ��� ����(����) ������ ����ϰ�
		�׼��� ¦����� "¦��",Ȧ�����"Ȧ��" ����
*/
	
	private String methodExam04(int num) {
		System.out.println(num);
		if(num%2 == 0) return "�� ¦��";
		else return "�� Ȧ��";
	}
	
}

