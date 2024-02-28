package ex0130;

class Puppy3{
	/*String Ÿ�� ���� ���� ����
		int Ÿ�� ���� ���� ����*/
	
	private String name;
	private int age;
		
	
	/*�μ��� ���� �������ۼ�
		String Ÿ�� ���������� "�޸�" �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/		
	
	Puppy3() {
		this.name = "�޸�";
		System.out.println("public Puppy3()ȣ��Ǿ����ϴ�");
		System.out.println(name);
		System.out.println(age);
	}
	
	/*String Ÿ���� �μ� 1���� �޴� �������ۼ�
		String Ÿ�� ���������� �μ� �Ҵ�
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
		�������� ���
	*/		
	Puppy3(String s) {
		this.name = s;
		System.out.println("public Puppy3()ȣ��Ǿ����ϴ�");
		System.out.println(name);
		System.out.println(age);
	}
		
	
	/*String Ÿ���� �μ� 2���� �޴� �������ۼ�
		�μ�2���� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"���
	*/		
	Puppy3(String a, String b) {
		this(a+b);
		System.out.println("public Puppy3()ȣ��Ǿ����ϴ�.");
	}
	
	
	/*boolean Ÿ���� �μ� 1���� �޴� �������ۼ�
		�μ��� "��"�� �ٿ� �ϳ��� String���� �����
		String Ÿ���� �μ� 1���� �޴� �����ڿ��� �μ��� �ָ� ȣ��
		"puplic Puppy3()ȣ��Ǿ����ϴ�"  ���
	*/					
	
	Puppy3(boolean b) {
		this(b+"��");
		System.out.println("public Puppy3()ȣ��Ǿ����ϴ�");
	}
	
	/*char Ÿ���� �μ� 1���� �޴� �������ۼ�
			�μ��� ���� �����ڸ� ȣ���ϰ�
			�μ��� ���� data�� intŸ�� ���������� �Ҵ�	
			"puplic Puppy3()ȣ��Ǿ����ϴ�"���
			int�� �����������
	*/			
	Puppy3(char c) {
		this();
		this.age = c;
		System.out.println("public Puppy3()ȣ��Ǿ����ϴ�");
		System.out.println(age);
	}
	
	
	/*�޼ҵ� printMemberVariable
	���� ����
	���������� ���
	*/	
	
	public void printMemberVariable() {
		System.out.println(name);
		System.out.println(age);
	}
	
}

class ConstructorOverloadingExam{
		//���θ޼ҵ忡��
		public static void main(String [] args){
			//Puppy3 Ŭ������ �� �����ڸ� �ѹ��� �̿��� ��ü 5�� ����
			
			System.out.println("----1--------------");
			Puppy3 p1 = new Puppy3();
			System.out.println("\n----2--------------");
			Puppy3 p2 = new Puppy3("java");
			System.out.println("\n----3--------------");
			Puppy3 p3 = new Puppy3("java", "hi");
			System.out.println("\n----4--------------");
			Puppy3 p4 = new Puppy3('A');
			System.out.println("\n----5--------------");
			Puppy3 p5 = new Puppy3(true);
			
		//�� ��ü�� printMemberVariable�޼ҵ带 �ѹ��� ȣ��
			
			System.out.println("\n----1--------------");
			p1.printMemberVariable();
			System.out.println("\n----2--------------");
			p2.printMemberVariable();
			System.out.println("\n----3--------------");
			p3.printMemberVariable();
			System.out.println("\n----4--------------");
			p4.printMemberVariable();
			System.out.println("\n----5--------------");
			p5.printMemberVariable();
			
	}
}