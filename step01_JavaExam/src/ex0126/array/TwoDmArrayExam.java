package ex0126.array;


//TwoDmArrayExam.java

class TwoDmArray{
	//String�� �����ϴ� twoDmArray �迭����
	private String[][] twoDmArray = new String[10][];
	
	//�޼ҵ� make2DmArray
		//twoDmArray �迭��  ���� �Ҵ�
	
	public void make2DmArray() {
		
		int y = twoDmArray.length;
		
		for(int i = 0; i < y; i++) {
			twoDmArray[i] = new String[i+1];
			int x = twoDmArray[i].length;
			
			for(int j = 0; j < x; j++) 
				twoDmArray[i][j] = (i+1) + "��" + (j+1) + "ȣ";
		}
		
	}
		
		
	//�޼ҵ� print2DmArray
	//	twoDmArray �迭�� ���� �־����������� ���
	
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
	//main�޼ҵ忡��
	
	public static void main(String[] args) {
		//TwoDmArray��ü����
		
		TwoDmArray td = new TwoDmArray();
		
		//TwoDmArray��ü�� make2DmArray�޼ҵ� ȣ��
		
		td.make2DmArray();
		
		//TwoDmArray��ü�� print2DmArray�޼ҵ� ȣ��
		
		td.print2DmArray();
		
	}

		
}

