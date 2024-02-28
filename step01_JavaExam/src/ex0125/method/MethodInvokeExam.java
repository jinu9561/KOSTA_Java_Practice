package ex0125.method;

class MethodInvoke01{
	//다음과 같이 메소드를 작성하세요.
	
	/*method 이름 : method01
	어디서나 누구나 접근가능
	정수 리턴
	인수로 정수2개 받음
	인수로 들어온 정수 2개를 곱해서 출력하고 리턴*/
		
	public int method01(int a, int b) {
		System.out.println(a + " * " + b + " = " + a*b);
		return a*b;
	}
}

class MethodInvoke02{
	
	//method 이름 : method02
	//어디서나 누구나 접근가능,객체를 생성하지 않고도 접근가능
	//정수 리턴
	//인수로 정수2개 받음
	
	//인수로 들어온 정수 2개를 더해서 출력하고 더한수 리턴
		
	public static int method02(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
		return a + b;
	}
}

class MethodInvokeExam{
	public static void main(String []args){
		
		//MethodInvoke01의 method01 호출
		MethodInvoke01 mi01 = new MethodInvoke01();
		int a = mi01.method01(3, 5);
		System.out.println("리턴값은 " + a);

		//MethodInvoke02의 method02 호출
		int b = MethodInvoke02.method02(34, 12);
		System.out.println("리턴값은 " + b);

	}
}

