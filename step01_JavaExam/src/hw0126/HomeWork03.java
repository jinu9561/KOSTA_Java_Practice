package hw0126;

public class HomeWork03 {
	public static void main(String[] args) {
		int arr[] = {5,7,1,2,4,3,8,9,6,10};
		
		for(int i = 0; i < arr.length-1; i++) {
			int minIdx = i;
			
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
