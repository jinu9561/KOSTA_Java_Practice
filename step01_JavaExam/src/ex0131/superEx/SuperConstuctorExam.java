package ex0131.superEx;

class Parent {
//	Parent(){
//		System.out.println(1);
//	}
	Parent(int i){
		System.out.println(2);
	}
	Parent(String s){
		System.out.println(3);
	}
	
}
/////////////////////////////////////////////////////////////////////////
class Child extends Parent{ // Child is a Parent ����
	
	Child(){
		this(4); // ���� ��ü�� int�� �Ѱ� �޴� ������ ȣ��
		System.out.println(4);
	}
	Child(int i ){
		super(i);
		System.out.println(5);
	}
	Child(boolean b){
		super("����");
		System.out.println(6);
	}
	
}

///////////////////////////////////////////////////////////////////////////
public class SuperConstuctorExam {

	public static void main(String[] args) {
//		new Child(); 1 4
//		new Child(1); 1 5
//		new Child(true); 1 6
		// ���: �ڽ� ������ ������ ù��° �ٿ��� super()�� �����Ǿ��ִ� -> �θ��� �⺻�����ڸ� ȣ���Ѵ�.
		
//		new Child("aaa"); // ����
		
		// Parent�� �����ڸ� ��� ��������
//		new Child(); // 4
//		new Child(1); // 5
//		new Child(true); // 6
		// ��� : �����ڸ� �ϳ��� �ۼ����� ������ �⺻�����ڴ� �ڵ� ���� �Ǿ�����.
		
		
		
		
	}

}
