package ex0131.superEx;

class Animal {
	int a=10;
	int b=5;
	public void aa() {
		System.out.println("super 의 aa() call");
	}
	
	public void bb() {
		System.out.println("super 의 bb() call");

	}
	
}
///////////////////////////////////////////////////////////
class Cat extends Animal{ 
	int a=20;
	int c=7;
	
	@Override // 재정의(없어도 되지만 권장)
	public void aa() {
		System.out.println("sub 의 cc() call...");
		
//		System.out.println("a = " + a);
//		System.out.println("this.a = " + this.a);
//		System.out.println("super.a = " + super.a);
//		
//		// 부모쪽에만 있는 인스턴스 필드
//		System.out.println("b = " + b);
//		System.out.println("this.b = " + this.b); // this. 생략 가능함
//		System.out.println("super.b = " + super.b); // super. 생략 가능함
//		
//		// 자식쪽에만 있는 인스턴스 필드
//		System.out.println("c = " + c);
//		System.out.println("this.c = " + this.c); // 부모 = 나
//		// System.out.println("super.c = " + super.c); // 오류 -> 부모쪽에 없으므로
	}
	
	public void cc() {
		System.out.println("sub 의 cc() call...");
	}
	
	public void test() {
		// 메소드 호출
		// aa() 메소드는 재정의 되었다!!(부모에도 자식에도 존재)
		
		aa(); // sub
		this.aa(); // sub
		super.aa(); // super
		
		System.out.println("-----bb()는 부모쪽에만-----------");
		bb(); // sub
		this.bb(); // sub
		super.bb(); // super
		
		System.out.println("-----cc()는 자식쪽에만-----------");
		cc(); // sub
		this.cc(); // sub
		//super.cc(); // super
		
		
	}
}





public class SuperKeywordExam {
	public static void main(String[] args) {
		
		//new Cat().test();
		Animal animal = new Cat(); // 필드를 이용한 다형성
		
		Cat cat = new Cat();
		System.out.println("cat주소 = " + cat);
		
		System.out.println("cat.a = " + cat.a); //20
		System.out.println("cat.b = " + cat.b); //5
		System.out.println("cat.c = " + cat.c); //7

		System.out.println("====메소드 호출=========");
		cat.aa(); //sub
		cat.bb(); //super
		cat.cc(); //sub
		
		System.out.println("---------------------------------------");
		System.out.println("animal.a = " + animal.a); //10
		System.out.println("animal.b = " + animal.b); //5
		//System.out.println("animal.c = " + animal.c); //
		
		System.out.println("====메소드 호출=========");
		animal.aa(); // 재정의된 메소드는 부모타입이라도 반드시 재정의된 메소드로 호출된다!!!!!!!
		animal.bb(); //super
		//animal.cc(); // 부모타입으로 자식부분 접근불가
		
		//자식쪽에 있는 필드나 메소드 접근하기 위해서는 캐스팅이 필요하다
		if(animal instanceof Cat) {
			Cat cat2 = (Cat)animal; // 부모 > 자식
			System.out.println("cat2 주소 = " + cat2);
			System.out.println("cat2.c = " + cat2.c);
			cat2.cc();

		}
		
	}

}
