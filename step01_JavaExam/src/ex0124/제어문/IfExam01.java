package ex0124.���;

public class IfExam01 {
	public static void main(String[] args) {
		int a = 80;
		if(a%2 == 0) System.out.println("¦��");
		else System.out.println("Ȧ��");
		
		System.out.println("---------------------------");
		double nansu = Math.random(); // 0.0 ~ 0.999999
		System.out.println(nansu);
		// 1~10 ������ ����
		// Math.random() * ����� �� + �ּڰ�
		nansu = nansu*10 + 1;
		System.out.println(nansu);
		System.out.println((int)nansu);
	}
	

}
