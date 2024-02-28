package ex0126.array;

import java.util.Random;

class ArrayExam{
	
	//��int,double,char,boolean ,String type���� �� 5���� �����ϴ�  �迭�� �����ϼ���

	int[] intArr = new int[5];
	double[] doubleArr = new double[5];
	char[] charArr = new char[5];
	boolean[] booArr = new boolean[5];
	String[] strArr = new String[5];
	
	//�޼ҵ� : printArrayValue01	
	//���� �迭�鿡 �ڵ����� �ʱ�ȭ �Ȱ��� ����ϼ���
	public void printArrayValue01() {
	
		System.out.print("[ ");
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------		
		System.out.print("[ ");
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println("]");
		
		System.out.print("[ ");
		for(double d : doubleArr) {
			System.out.print(d + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------			
		System.out.print("[ ");
		for(int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------			
		System.out.print("[ ");
		for(int i = 0; i < booArr.length; i++) {
			System.out.print(booArr[i] + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------			
		System.out.print("[ ");
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println("]");
		
	}

	//�޼ҵ� : printArrayValue02	
	//���� 5���� �迭���� ���� ������ ������ data�� �Ҵ��ϼ���.
	
	public void printArrayValue02() {
		
		Random r = new Random();
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = r.nextInt(100);
		}
//-------------------------------------------------------------------		
		for(int i = 0; i < doubleArr.length; i++) {
			doubleArr[i] = r.nextDouble(100);
		}
//-------------------------------------------------------------------			
		char c = 'A';
		for(int i = 0; i < charArr.length; i++) {
			charArr[i] = c++;
		}
//-------------------------------------------------------------------			
		for(int i = 0; i < booArr.length; i++) {
			booArr[i] = r.nextBoolean();
		}
//-------------------------------------------------------------------			
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = "��";
		}
		
	}
	
	//�޼ҵ� : printArrayValue03	
	//���Ӱ� �Ҵ�Ȱ��� ����ϼ���
	
	public void printArrayValue03() {
		
		System.out.print("[ ");
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------		
		System.out.print("[ ");
		for(int i = 0; i < doubleArr.length; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------			
		System.out.print("[ ");
		for(int i = 0; i < charArr.length; i++) {
			System.out.print(charArr[i] + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------			
		System.out.print("[ ");
		for(int i = 0; i < booArr.length; i++) {
			System.out.print(booArr[i] + " ");
		}
		System.out.println("]");
//-------------------------------------------------------------------			
		System.out.print("[ ");
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println("]");
		
	}
	
	//���θ޼ҵ忡��
	//ArrayExam�� �޼ҵ���� ������� ȣ���ϼ���.
	
	public static void main(String[] args) {
		
		ArrayExam ae = new ArrayExam();
		
		ae.printArrayValue01();
		
		System.out.println("==============================================");
		
		ae.printArrayValue02();
		
		ae.printArrayValue03();
		
	}
	
}