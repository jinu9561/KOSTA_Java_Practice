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
	
	public boolean isRepeat(int[] arr, int val) { // 입력한 값과 배열에 중복되는 값이 있으면 false 리턴
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) 
			if(val == arr[i]) return false;
		
		return flag;
	}
	
	//-----------------------------------------------------------
	
	public void saveNumber(int[] arr) { // 1~45까지 중복되지 않는 숫자 배열에 저장
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
	
	public void Descent(int[] arr) { // 내림차순 정렬
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

	public void printArr(int[] arr) { // 배열 출력
		System.out.print("오늘의 로또 번호는~ ");	
		for(int i = 0; i <arr.length; i++) System.out.print(arr[i] + " ");		
		System.out.println("입니다!");
	}

}
