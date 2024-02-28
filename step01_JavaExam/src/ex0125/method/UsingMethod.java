package ex0125.method;

//UsingMethod.java
class UsingMethodExam{
     //�Ʒ��� ���� �޼ҵ带 �ۼ��ϼ���.
   
     /*Method�̸� :  methodExam03_01
     �ڱ��ڽŸ� ���ٰ���
     ReturnType : ����
     Parameter : ���� 1��
	(�����ο���)�ϴ� �� : 
	methodExam03_01�� ȣ��Ǿ����ϴ�. ���
	�μ��� ���� ���� ��� 
	����*2 ����. */
	
	private int methodExam03_01(int num) {
		System.out.println("methodExam03_01�� ȣ��Ǿ����ϴ�.");
		return num*2;
	}
	 
	 /*Method�̸� :  methodExam03_02
     ��𼭳� �ƹ��� ���ٰ���
     Return String
     Parameter : String 1��, ���� 1��
	(�����ο���)�ϴ� �� : 
		methodExam03_02�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ���
		�ι�°�μ��� ���� ���� methodExam03_01�� �־� �ָ� methodExam03_01�� ȣ���ϰ� �����ϴ� ���� ���
		�μ��� ���� String �� �ٺ��� �ٿ��� ����
	*/	
	
	public String methodExam03_02(String str, int num) {
		System.out.println("methodExam03_02�� ȣ��Ǿ����ϴ�.");
		System.out.println(str + " �ٺ�~");
		
		int a = this.methodExam03_01(num);
		System.out.println("���ϰ��� " + a);
		
		return str + " �ٺ�";
	}
			
	 /*Method�̸� :  methodExam03_03
     ���� package���� �ƹ��� ���� ����
     ReturnType : ���Ͼ���
     Parameter : ���� 1���� String 1��
     (�����ο���)�ϴ� �� : 
		methodExam03_03�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� 1���� String 1���� �Ѱ��ָ�
		methodExam03_02ȣ��
	*/	
		
	void methodExam03_03(int num, String str) {
		System.out.println("methodExam03_03�� ȣ��Ǿ����ϴ�.");
		this.methodExam03_02(str, num);
	}
	
     /*Method�̸� :  methodExam03_04
     ��Ӱ����� ��𼭳� ���� ����
     ReturnType : �Ǽ�(�ε��Ҽ���)
     Parameter : ù��° �μ�(����),�ι�° �μ�(�Ǽ�), ����°�μ�(����)
	(�����ο���)�ϴ� �� : 
		methodExam03_04�� ȣ��Ǿ����ϴ�. ���
		�μ��� ���� ���� �̿��� 
		MakeMethodExam02��ü�� methodExam02_04�޼ҵ� ȣ���ϰ�
		method02_04�� �����ϴ� ���� ����
	*/	
		
	protected double methodExam03_04(int a, double b, int c) {
		System.out.println("methodExam03_04�� ȣ��Ǿ����ϴ�.");
		
		MakeMethodExam02 mme02 = new MakeMethodExam02();
		double res = mme02.methodExam02_04(a, b, c);
		return res;
	}
	
} // UsingMethodExam ��

class UsingMethod{
	//���θ޼ҵ忡��
		//UsingMethodExam�� ȣ�Ⱑ���� �޼ҵ���� ȣ���ϰ�
		// �����ϴ� �� �ִٸ� ���
	
	public static void main(String[] args) {
		UsingMethodExam ume = new UsingMethodExam();
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@ 1�� �޼ҵ� @@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		String a = ume.methodExam03_02("������", 7);
		System.out.println(a);
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@ 3�� �޼ҵ� @@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		ume.methodExam03_03(3, "����");
		
		System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@ 4�� �޼ҵ� @@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		double b = ume.methodExam03_04(1, 4.0, 5);
		System.out.println(b);
	}
	
}

  
