package ex0201.final_abstract;

class Test{
//	final int age = 20; // 반드시 초기화 필수 (명시적 초기화 or 생성자를 이용한 초기화)
	
	final int age;
	
	static final int pie = 20; // static final은 생성자 초기화는 못함
	
	static final int pie2; // 명시적 초기화 or static 블럭에서 초기화 가능 = constant = 상수
	static {
		pie2 = 100;
	}
	
	Test(int age){
		this.age = age; // 생성자를 이용한 초기화
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////

public class FinalVsConstantExaml {
	public static void main(String[] args) {
		
		Test t = new Test(20);
		System.out.println("t.age = " + t.age);
		// t.age = 30; // final 필드이므로 값변경 불가
		
		Test t2 = new Test(30);
		System.out.println("t2.age = " + t2.age);
		
	}

}
