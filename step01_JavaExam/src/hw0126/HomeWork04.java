package hw0126;

import java.util.Random;

public class HomeWork04 {
	
	public static void main(String[] args) {
		
		int arr[] = new int[6];
		HomeWork04 hw = new HomeWork04();
		
		hw.saveNumber(arr);
		hw.Descent(arr);
		hw.printArr(arr);
		
	}
	
	//========================================================
	
	public boolean isRepeat(int[] arr, int val) { // �Է��� ���� �迭�� �ߺ��Ǵ� ���� ������ false ����
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) 
			if(val == arr[i]) return false;
		
		return flag;
	}
	
	//-----------------------------------------------------------
	
	public void saveNumber(int[] arr) { // 1~45���� �ߺ����� �ʴ� ���� �迭�� ����
		Random r = new Random();
		
		
		int num = 0;
		
		while(num < 6) {
			int val = r.nextInt(45);
			
			if(this.isRepeat(arr, val) == true) {
				arr[num] = val;				
				num++;
			}
		}
	}
	
	//-----------------------------------------------------------
	
	public void Descent(int[] arr) { // �������� ����
		for(int i = 0; i < arr.length-1; i++) {
			int minIdx = i;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] > arr[minIdx]) minIdx = j;
			}
			
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
	
	//-----------------------------------------------------------

	public void printArr(int[] arr) { // �迭 ���
		System.out.print("������ �ζ� ��ȣ��~ ");	
		for(int i = 0; i <arr.length; i++) System.out.print(arr[i] + " ");		
		System.out.println("�Դϴ�!");
	}

}
