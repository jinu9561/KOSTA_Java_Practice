package ex0126.staticEx;

class Test {
	 int i; // �ν��Ͻ� �ʵ� -> ��ü�� �����ɶ� ���������.
	 static int j = 5; // static �ʵ� -> ��ü ������ ������� �ϵ��� Ŭ������ �δ� �ɶ� �ڵ����� �޸𸮰� ���������.
	 
	 public void aa() { // non-static �޼ҵ� �ȿ����� static, non-static ��� ���� ����
		 System.out.println(i); // 10
		 System.out.println(this.i); // 10
		 
		 System.out.println(j); // 5
		 System.out.println(this.j); // 5
		 System.out.println(Test.j); //5
		 
	 }
	 
	 public void bb() {
		 // �޼ҵ� ȣ��
		 aa();
		 this.aa();
		 
		 cc();
		 this.cc();
		 Test.cc();
		 
	 }
	 
	 public static void cc() { // static �޼ҵ� �ȿ��� non-static ���� �Ұ�, this ��� �ȵ�
//		 System.out.println(i); // ���� -> non-static �̾
//		 System.out.println(this.i); // ���� ->  non-static �̰�, this ���
		 
		 System.out.println(j); // 5
//		 System.out.println(this.j); // ���� -> static ���� ������ this�� ����ؼ�
		 System.out.println(Test.j); // 5
		 
	 }
	 
	 public static void dd() {
		 // �޼ҵ� ȣ��
//		 aa(); // ���� -> non-static �̾
//		 this.aa(); // ���� ->  non-static �̰�, this ���
		 
		 cc();
//		 this.cc(); // ���� -> static ���� ������ this�� ����ؼ�
		 Test.cc();
		 
	 }
}



public class StaticExam {

	public static void main(String[] args) {
		System.out.println("------------------���� �����մϴ�!---------------");
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("�ּҰ� t1 = " + t1);
		System.out.println("�ּҰ� t2 = " + t2);
		System.out.println("�ּҰ� t3 = " + t3); // �ּҰ� ���� �ٸ�
		
		System.out.println("----�ν��Ͻ� �ʵ� ����(���� ��)-----");
		System.out.println("t1.i = " + t1.i); // 10
		System.out.println("t2.i = " + t2.i); // 10
		System.out.println("t3.i = " + t3.i); // 10
		
		t1.i = 50; // �� ����
		
		System.out.println("----�ν��Ͻ� �ʵ� ����(���� ��)-----");
		System.out.println("t1.i = " + t1.i); // 50 -> ������ t1�� �ٲ�
		System.out.println("t2.i = " + t2.i); // 10
		System.out.println("t3.i = " + t3.i); // 10
		
		
		
		System.out.println("----static �ʵ� ����(���� ��)-----");
		System.out.println("t1.j = " + t1.j); // 5
		System.out.println("t2.j = " + t2.j); // 5
		System.out.println("t3.j = " + t3.j); // 5
		// ��ȣ�տ� ���� �ߴ°� -> Test.j�� �����ϴ°� ���ٰ� �� �ϴ°���
		
		t1.j = 20; // �� ����
		
		System.out.println("----static �ʵ� ����(���� ��)-----");
		System.out.println("t1.j = " + t1.j); // 20
		System.out.println("t2.j = " + t2.j); // 20
		System.out.println("t3.j = " + t3.j); // 20 -> �� �ٲ���� 
		
	}

	/*
	 * static �ʱ�ȭ �۾�, ȯ�漳�� ����, �ʱ�ġ ������ �ε�...
	 */
	static {
		System.out.println("static init �� ���κ��� ���� ����˴ϴ�!!");
	}

}
