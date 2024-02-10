package ex0131.superEx;

class Animal {
	int a=10;
	int b=5;
	public void aa() {
		System.out.println("super �� aa() call");
	}
	
	public void bb() {
		System.out.println("super �� bb() call");

	}
	
}
///////////////////////////////////////////////////////////
class Cat extends Animal{ 
	int a=20;
	int c=7;
	
	@Override // ������(��� ������ ����)
	public void aa() {
		System.out.println("sub �� cc() call...");
		
//		System.out.println("a = " + a);
//		System.out.println("this.a = " + this.a);
//		System.out.println("super.a = " + super.a);
//		
//		// �θ��ʿ��� �ִ� �ν��Ͻ� �ʵ�
//		System.out.println("b = " + b);
//		System.out.println("this.b = " + this.b); // this. ���� ������
//		System.out.println("super.b = " + super.b); // super. ���� ������
//		
//		// �ڽ��ʿ��� �ִ� �ν��Ͻ� �ʵ�
//		System.out.println("c = " + c);
//		System.out.println("this.c = " + this.c); // �θ� = ��
//		// System.out.println("super.c = " + super.c); // ���� -> �θ��ʿ� �����Ƿ�
	}
	
	public void cc() {
		System.out.println("sub �� cc() call...");
	}
	
	public void test() {
		// �޼ҵ� ȣ��
		// aa() �޼ҵ�� ������ �Ǿ���!!(�θ𿡵� �ڽĿ��� ����)
		
		aa(); // sub
		this.aa(); // sub
		super.aa(); // super
		
		System.out.println("-----bb()�� �θ��ʿ���-----------");
		bb(); // sub
		this.bb(); // sub
		super.bb(); // super
		
		System.out.println("-----cc()�� �ڽ��ʿ���-----------");
		cc(); // sub
		this.cc(); // sub
		//super.cc(); // super
		
		
	}
}





public class SuperKeywordExam {
	public static void main(String[] args) {
		
		//new Cat().test();
		Animal animal = new Cat(); // �ʵ带 �̿��� ������
		
		Cat cat = new Cat();
		System.out.println("cat�ּ� = " + cat);
		
		System.out.println("cat.a = " + cat.a); //20
		System.out.println("cat.b = " + cat.b); //5
		System.out.println("cat.c = " + cat.c); //7

		System.out.println("====�޼ҵ� ȣ��=========");
		cat.aa(); //sub
		cat.bb(); //super
		cat.cc(); //sub
		
		System.out.println("---------------------------------------");
		System.out.println("animal.a = " + animal.a); //10
		System.out.println("animal.b = " + animal.b); //5
		//System.out.println("animal.c = " + animal.c); //
		
		System.out.println("====�޼ҵ� ȣ��=========");
		animal.aa(); // �����ǵ� �޼ҵ�� �θ�Ÿ���̶� �ݵ�� �����ǵ� �޼ҵ�� ȣ��ȴ�!!!!!!!
		animal.bb(); //super
		//animal.cc(); // �θ�Ÿ������ �ڽĺκ� ���ٺҰ�
		
		//�ڽ��ʿ� �ִ� �ʵ峪 �޼ҵ� �����ϱ� ���ؼ��� ĳ������ �ʿ��ϴ�
		if(animal instanceof Cat) {
			Cat cat2 = (Cat)animal; // �θ� > �ڽ�
			System.out.println("cat2 �ּ� = " + cat2);
			System.out.println("cat2.c = " + cat2.c);
			cat2.cc();

		}
		
	}

}
