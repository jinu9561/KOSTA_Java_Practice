package ex0126.array;

class MultiArray{
//������ 2���� �迭 8*9
	
	int[][] intArr = new int[8][9];
	
//�޼ҵ��̸� :array99
	
	public void array99() {
		for(int i = 0; i < intArr.length; i++) 
			for(int j = 0; j < intArr[i].length; j++) 
				intArr[i][j] = (i+2) * (j+1);
		
		for(int row[] : intArr) {
			for(int col : row) System.out.print(col + "\t");
			System.out.println();
		}
	}
	
	//for loop �� ����Ͽ� 
	//�迭�� ���� (������)�������
	//�迭�� ����� �������
		
}
public class MemoryApart{
//main�޼ҵ忡�� 
//MultiArray��ü�� array99�޼ҵ�ȣ��
	public static void main(String[] args) {
		MultiArray ma = new MultiArray();
		ma.array99();
	}
	
}

