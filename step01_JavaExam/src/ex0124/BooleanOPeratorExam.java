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
		System.out.println("false&&false="+(f&&f)); // false // |�� ������ : �տ��� false�̸� �ڿ��ͱ��� ���� ���ϰ� false ��ȯ �ع���
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
		
		System.out.println("------------ | (or ��Ʈ������) ----------------");
		System.out.println("��� : " + (true | test()));
		System.out.println("��� : " + (false | test()));
		System.out.println();
		System.out.println("------------ || (or ��������) ----------------");
		System.out.println("��� : " + (true || test()));
		System.out.println("��� : " + (false || test()));
		System.out.println();System.out.println();
		
		System.out.println("------------ & (or ��Ʈ������) ----------------");
		System.out.println("��� : " + (true & test()));
		System.out.println("��� : " + (false & test()));
		System.out.println();
		System.out.println("------------ && (or ��������) ----------------");
		System.out.println("��� : " + (true && test()));
		System.out.println("��� : " + (false && test()));
		System.out.println();System.out.println();

	}
	public static boolean test() {
		System.out.println("test�޼ҵ� �����...");
		return false;
	}
}