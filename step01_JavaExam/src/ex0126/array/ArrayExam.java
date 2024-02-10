package ex0126.array;

import java.util.Random;

class ArrayExam{
	
	//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요

	int[] intArr = new int[5];
	double[] doubleArr = new double[5];
	char[] charArr = new char[5];
	boolean[] booArr = new boolean[5];
	String[] strArr = new String[5];
	
	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
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

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	
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
			strArr[i] = "아";
		}
		
	}
	
	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	
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
	
	//메인메소드에서
	//ArrayExam의 메소드들을 순서대로 호출하세요.
	
	public static void main(String[] args) {
		
		ArrayExam ae = new ArrayExam();
		
		ae.printArrayValue01();
		
		System.out.println("==============================================");
		
		ae.printArrayValue02();
		
		ae.printArrayValue03();
		
	}
	
}