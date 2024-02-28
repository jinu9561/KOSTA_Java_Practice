package ex0126.array;

import java.util.Random;

//ObjectInArray.java

class ObjectOne{
	public int a; // 속성
}

public class ObjectInArray{
	//메인 메소드에서 
	public static void main(String[] args) {
		//ObjectOne 타입을 5개 까지 저장하는 배열을 선언하고
		ObjectOne arr[] = new ObjectOne[5];
		
		//5개의 ObjectOne객체를 생성하세요.
				//각 객체가 갖고있는 전역변수 출력
				//각 객체의 주소값 출력
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print ("생성전 : " + arr[i] + " / ");
			arr[i] = new ObjectOne();
			System.out.println("생성후 주소값: " + arr[i]);
		}
		
				//각각의 ObjectOne객체가 서로 다른 a의 값을 갖도록 a의 값을 변경하세요.			
				//각 ObjectOne 객체의 a를 출력하세요
		
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번지의 전역변수는 " + arr[i].a + " / ");
			arr[i].a = r.nextInt(100);
			System.out.println(i + "번지의 변경된 전역변수는 " + arr[i].a);
		}

		
		
		
		
	}
		 
		
			
		
	
}
