package ex0126.array;


//TwoDmArrayExam.java

class TwoDmArray{
	//String을 저장하는 twoDmArray 배열선언
	private String[][] twoDmArray = new String[10][];
	
	//메소드 make2DmArray
		//twoDmArray 배열에  값을 할당
	
	public void make2DmArray() {
		
		int y = twoDmArray.length;
		
		for(int i = 0; i < y; i++) {
			twoDmArray[i] = new String[i+1];
			int x = twoDmArray[i].length;
			
			for(int j = 0; j < x; j++) 
				twoDmArray[i][j] = (i+1) + "동" + (j+1) + "호";
		}
		
	}
		
		
	//메소드 print2DmArray
	//	twoDmArray 배열의 값을 주어진형식으로 출력
	
	public void print2DmArray() {
		
		int y = twoDmArray.length;
		
		for(int i = 0; i < y; i++) {
			int x = twoDmArray[i].length;
			
			for(int k = 1; k < x; k++) {
				System.out.print("\t");
			}
			
			for(int j = i; j < y; j++) {
				System.out.print(twoDmArray[j][i] + "\t");
			}
			
			System.out.println("\n");
		}
		
		System.out.println();
		
	}
		
}

public class TwoDmArrayExam{
	//main메소드에서
	
	public static void main(String[] args) {
		//TwoDmArray객체생성
		
		TwoDmArray td = new TwoDmArray();
		
		//TwoDmArray객체의 make2DmArray메소드 호출
		
		td.make2DmArray();
		
		//TwoDmArray객체의 print2DmArray메소드 호출
		
		td.print2DmArray();
		
	}

		
}

