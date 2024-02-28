package ex0124;

class BooleanOPeratorExam{
	public static void main(String args[]){
		boolean  t=true ;
		boolean f=false;
		System.out.println("true&false="+(t&f)); //false
		System.out.println("true&true="+(t&t)); //true
		System.out.println("false&false="+(f&f)); //false
		System.out.println();
	
		System.out.println("true|false="+(t|f)); //true
		System.out.println("true|true="+(t|t)); //true
		System.out.println("false|false="+(f|f)); //false
		System.out.println();

		System.out.println("true^false="+(t^f)); // true
		System.out.println("true^true="+(t^t)); // false
		System.out.println("true^false="+(t^f)); // true
		System.out.println("true^true="+(t^t)); // false
		System.out.println();

		System.out.println("true&&false="+(t&&f)); // false 
		System.out.println("true&&true="+(t&&t)); // true
		System.out.println("true&&false="+(t&&f)); // false
		System.out.println("false&&false="+(f&&f)); // false // |과 차이점 : 앞에가 false이면 뒤에것까지 연산 안하고 false 반환 해버림
		System.out.println();

		System.out.println("true||false="+(t||f)); // true
		System.out.println("true||true="+(t||t)); // true
		System.out.println("false||false="+(f||f)); // false
		System.out.println();

		int i=5; int j=3;
		System.out.println("int i="+i+"\tint j="+j);
		System.out.println("i>=j ==>> "+(i>=j)); // true
		System.out.println("i>j =>> "+(i>j)); // true
		System.out.println("i<=j =>> "+(i<=j)); // false
		System.out.println("i<j =>> "+(i<j)); // false
		System.out.println("i==j =>> "+(i==j)); // false
		System.out.println("i!=j =>> "+(i != j)); // true
		System.out.println();
		
		System.out.println("------------ | (or 비트연산자) ----------------");
		System.out.println("결과 : " + (true | test()));
		System.out.println("결과 : " + (false | test()));
		System.out.println();
		System.out.println("------------ || (or 논리연산자) ----------------");
		System.out.println("결과 : " + (true || test()));
		System.out.println("결과 : " + (false || test()));
		System.out.println();System.out.println();
		
		System.out.println("------------ & (or 비트연산자) ----------------");
		System.out.println("결과 : " + (true & test()));
		System.out.println("결과 : " + (false & test()));
		System.out.println();
		System.out.println("------------ && (or 논리연산자) ----------------");
		System.out.println("결과 : " + (true && test()));
		System.out.println("결과 : " + (false && test()));
		System.out.println();System.out.println();

	}
	public static boolean test() {
		System.out.println("test메소드 실행됨...");
		return false;
	}
}