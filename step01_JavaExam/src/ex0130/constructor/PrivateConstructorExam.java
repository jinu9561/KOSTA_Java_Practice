package ex0130.constructor;

//
// 싱글톤 클래스 만드는 방법
//  1) private 생성자를 만든다.
//  2) static 멤버필드를 이용해서 객체르 생성
//  3) 자기자신 객체를 리턴해주는 static 메소드 제공ㄴ
//


class Test{
	private static Test t = new Test(); // 공유변수이므로 100개를 불러들여도 1개임
	
	// private 생성자는 외부에서 객체를 직접 생성할수 없도록 하는것
	private Test() { }
	
	// 자기자신 객체를 직접 생성해서 리턴해주는 메소드 제공한다.
	public static Test getInstance() {
		// Test t = new Test();
		return t;
	}
	
}

public class PrivateConstructorExam {

	public static void main(String[] args) {

		// new Test(); // 생성자 호출 -> private 생성자를 갖고 있어서 객체 생성 못함
		
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		
	}

}
