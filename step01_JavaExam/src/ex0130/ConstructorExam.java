package ex0130;

//ConstructorExam.java
class Puppy{
		//String,int  Ÿ�� ���� ���� ����(member ��������)
	
	private String name;
	private int age;
		
		/*	�޼ҵ� printPuppyName�ۼ�
			�μ�����, ���Ͼ���
			"public void printPuppyName() ȣ��Ǿ����ϴ�!"���
			���������� ���
		*/	
	
	public void printPuppyName() {
		System.out.println("public void printPuppyName() ȣ��Ǿ����ϴ�!");
		System.out.println(name);
		System.out.println(age);
	}
		
		
		/*�μ��� ���� ������ �ۼ�
			"������ public Puppy() ȣ��Ǿ����ϴ�!"���
			printPuppyName�޼ҵ� ȣ��
				�������� String��"�޸�" �Ҵ�
			�������� int�� -98998 �Ҵ�
		*/
			
	public Puppy() {
		System.out.println("������ public Puppy() ȣ��Ǿ����ϴ�!");
		this.printPuppyName();
		this.name = "�޸�";
		this.age = -98998;
	}
}
class ConstructorExam {
	//���θ޼ҵ忡��
	public static void main(String [] agrs){
		//Puppy��ü ����
		Puppy puppy = new Puppy(); // *****�������� �ʱ�ȭ, ����� �ʱ�ȭ, �����ڰ� �����ȴ�!!!!!
		 
		//Puppy��ü�� printPuppyName�޼ҵ� ȣ��
		puppy.printPuppyName();
		
	}
}
			
