package ex0126.array;

import java.util.Random;

//ObjectInArray.java

class ObjectOne{
	public int a; // �Ӽ�
}

public class ObjectInArray{
	//���� �޼ҵ忡�� 
	public static void main(String[] args) {
		//ObjectOne Ÿ���� 5�� ���� �����ϴ� �迭�� �����ϰ�
		ObjectOne arr[] = new ObjectOne[5];
		
		//5���� ObjectOne��ü�� �����ϼ���.
				//�� ��ü�� �����ִ� �������� ���
				//�� ��ü�� �ּҰ� ���
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print ("������ : " + arr[i] + " / ");
			arr[i] = new ObjectOne();
			System.out.println("������ �ּҰ�: " + arr[i]);
		}
		
				//������ ObjectOne��ü�� ���� �ٸ� a�� ���� ������ a�� ���� �����ϼ���.			
				//�� ObjectOne ��ü�� a�� ����ϼ���
		
		Random r = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "������ ���������� " + arr[i].a + " / ");
			arr[i].a = r.nextInt(100);
			System.out.println(i + "������ ����� ���������� " + arr[i].a);
		}

		
		
		
		
	}
		 
		
			
		
	
}
