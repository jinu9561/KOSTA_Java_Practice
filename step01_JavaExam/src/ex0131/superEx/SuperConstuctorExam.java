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
class Child extends Parent{ // Child is a Parent 성립
	
	Child(){
		this(4); // 현재 객체의 int형 한개 받는 생성자 호출
		System.out.println(4);
	}
	Child(int i ){
		super(i);
		System.out.println(5);
	}
	Child(boolean b){
		super("하이");
		System.out.println(6);
	}
	
}

///////////////////////////////////////////////////////////////////////////
public class SuperConstuctorExam {

	public static void main(String[] args) {
//		new Child(); 1 4
//		new Child(1); 1 5
//		new Child(true); 1 6
		// 결론: 자식 생성자 구현부 첫번째 줄에는 super()가 생략되어있다 -> 부모의 기본생성자를 호출한다.
		
//		new Child("aaa"); // 오류
		
		// Parent의 생성자를 모두 지웠을때
//		new Child(); // 4
//		new Child(1); // 5
//		new Child(true); // 6
		// 결론 : 생성자를 하나도 작성하지 않으면 기본생성자는 자동 삽입 되어진다.
		
		
		
		
	}

}
