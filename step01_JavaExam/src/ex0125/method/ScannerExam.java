package ex0125.method;

import java.util.Random;
import java.util.Scanner; //Scanner��� ��ü�� util������ �������ּ���.

/**
    java.util.Scanner �� ����ڷ� ���� Ű���� �Է��� Ÿ�Ժ��� ������ �ֵ��� �پ��� �޼ҵ带 �����Ѵ�.
	 1) ���ڸ� �Է¹�����
        int i = �����̸�.nextInt(); // ���๮��(\n)���� �ȴ�.

	 2) ���ڸ� �Է¹�����
	    String data = �����̸�.next(); // ������� �Է°� , (���๮��(\n)����

	 3) ���ڿ�(��������) �Է¹�����
	     String data = �����̸�.nextLine();// ������ ���� ���ڿ� 

*/
class  ScannerExam{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.print("���������� : ");
        int kor = sc.nextInt();

        System.out.print("���� ������ : ");
        int eng =  sc.nextInt();

         sc.nextLine();

		System.out.print("�̸��� :");
		//String name = sc.next();
		String name = sc.nextLine();

		System.out.println("���� : " + kor);
		System.out.println( "���� : " + eng);
		System.out.println( "�̸� : " + name);*/

		/////////////////////////////////////////////////
		System.out.print("���������� : ");
        int kor = Integer.parseInt(sc.nextLine());

        System.out.print("���� ������ : ");
        int eng =  Integer.parseInt(sc.nextLine());

		System.out.print("�̸��� :");
		String name = sc.nextLine();

		System.out.println("���� : " + kor);
		System.out.println( "���� : " + eng);
		System.out.println( "�̸� : " + name);

		// ���� �߻�
		int nansu = (int)(Math.random()*12 + 1);
		// ������ Ÿ�Ժ��� ������ִ� ���� Ŭ���� - java.util.Random
		Random r = new Random();
		int num = r.nextInt(5); // 0~4
		System.out.println(num);
		
 
	}
}
