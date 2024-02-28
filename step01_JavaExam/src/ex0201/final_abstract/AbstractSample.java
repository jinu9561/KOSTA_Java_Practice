package ex0201.final_abstract;

//��� �������� ���� ������ �Ӽ��� �޼ҵ�

abstract class Animal{
	int legs; // ������ �ʵ� = �Ӽ�
	
	public void eat() {
		System.out.println("��⸦ �����Ѵ�.");
	}
	
	public abstract void sound();
	public abstract void run();
	
}

///////////////////////////////////////////////////////////////////////////////

class Cat extends Animal{
	
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
	
	@Override
	public void run() {
		System.out.println("�߶ٰ� ������ �߿ö�");
	}
	
	public void eat() {
		System.out.println("��⺸�� ����...");
	}
	
}

//////////////////////////////////////////////////////////////////////////////

class Pig extends Animal{

	@Override
	public void sound() {
		System.out.println("�ܲ�...");
	}

	@Override
	public void run() {
		System.out.println("�� �� �ڴ�...");
	}
	
}

//////////////////////////////////////////////////////////////////////////////

class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("�۸�");
	}

	@Override
	public void run() {
		System.out.println("�߶�");
	}
	
}

//////////////////////////////////////////////////////////////////////////////


public class AbstractSample {
	public static void main(String[] args) {
		
		Animal an = null; // �ʵ带 �̿��� ������
		
		an = new Cat();
		test(an);
		
		an = new Pig();
		test(an);
		
		test(new Dog());
		
	}
	
	public static void test(Animal an) { // �Ű������� �̿��� ������
		System.out.println("------------------------");
		an.eat();
		an.sound();
		an.run();
	}

}
