package ex0129.array;

public class MultiArrayExam {
//	int [][] arr;
	int [][] arr = new int [3][4];
//	int [][] arr = new int [3][];
	
//	// ������ ���ÿ� ����� �ʱ�ȭ
//	int[][] arr = new int[][] {
//		{1,3,5,7},
//		{2,4,8},
//		{10,20,30,40,50,60,70},
//		{1,5}
//	};

	
	public void test() {
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[0][0]);
		
		arr[0] = new int [4];
		arr[1] = new int [] {1, 3, 5, 7, 8, 0};
		arr[2] = new int [] {2, 4};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		System.out.println("----------------------------");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("******������ for������********");
		for(int[] row : arr) {
			for(int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MultiArrayExam me = new MultiArrayExam();
		
		
		me.test();
		
		
	}

}
