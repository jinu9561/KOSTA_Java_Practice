package ex0126.staticEx;

class Test {
	 int i; // 인스턴스 필드 -> 객체가 생성될때 만들어진다.
	 static int j = 5; // static 필드 -> 객체 생성과 상관없이 하드웨어에 클래스가 로더 될때 자동으로 메모리가 만들어진다.
	 
	 public void aa() { // non-static 메소드 안에서는 static, non-static 모두 접근 가능
		 System.out.println(i); // 10
		 System.out.println(this.i); // 10
		 
		 System.out.println(j); // 5
		 System.out.println(this.j); // 5
		 System.out.println(Test.j); //5
		 
	 }
	 
	 public void bb() {
		 // 메소드 호출
		 aa();
		 this.aa();
		 
		 cc();
		 this.cc();
		 Test.cc();
		 
	 }
	 
	 public static void cc() { // static 메소드 안에서 non-static 접근 불가, this 사용 안됨
//		 System.out.println(i); // 오류 -> non-static 이어서
//		 System.out.println(this.i); // 오류 ->  non-static 이고, this 사용
		 
		 System.out.println(j); // 5
//		 System.out.println(this.j); // 오류 -> static 변수 이지만 this를 사용해서
		 System.out.println(Test.j); // 5
		 
	 }
	 
	 public static void dd() {
		 // 메소드 호출
//		 aa(); // 오류 -> non-static 이어서
//		 this.aa(); // 오류 ->  non-static 이고, this 사용
		 
		 cc();
//		 this.cc(); // 오류 -> static 변수 이지만 this를 사용해서
		 Test.cc();
		 
	 }
}



public class StaticExam {

	public static void main(String[] args) {
		System.out.println("------------------메인 시작합니다!---------------");
		
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		
		System.out.println("주소값 t1 = " + t1);
		System.out.println("주소값 t2 = " + t2);
		System.out.println("주소값 t3 = " + t3); // 주소값 셋이 다름
		
		System.out.println("----인스턴스 필드 접근(변경 전)-----");
		System.out.println("t1.i = " + t1.i); // 10
		System.out.println("t2.i = " + t2.i); // 10
		System.out.println("t3.i = " + t3.i); // 10
		
		t1.i = 50; // 값 변경
		
		System.out.println("----인스턴스 필드 접근(변경 후)-----");
		System.out.println("t1.i = " + t1.i); // 50 -> 변경한 t1만 바뀜
		System.out.println("t2.i = " + t2.i); // 10
		System.out.println("t3.i = " + t3.i); // 10
		
		
		
		System.out.println("----static 필드 접근(변경 전)-----");
		System.out.println("t1.j = " + t1.j); // 5
		System.out.println("t2.j = " + t2.j); // 5
		System.out.println("t3.j = " + t3.j); // 5
		// 번호앞에 경고등 뜨는것 -> Test.j로 접근하는게 좋다고 말 하는거임
		
		t1.j = 20; // 값 변경
		
		System.out.println("----static 필드 접근(변경 후)-----");
		System.out.println("t1.j = " + t1.j); // 20
		System.out.println("t2.j = " + t2.j); // 20
		System.out.println("t3.j = " + t3.j); // 20 -> 다 바뀌었음 
		
	}

	/*
	 * static 초기화 작업, 환경설정 세팅, 초기치 데이터 로딩...
	 */
	static {
		System.out.println("static init 은 메인보다 먼저 실행됩니다!!");
	}

}
