package ex0124.���;

class IfExam02{

	public static void main(String[] args){
		//1~12 ������ ������ �߻��Ѵ�.
		int nansu = (int)(Math.random() * 12 + 1);
		System.out.println(nansu);
		
		//�߻��� ������ 1�̸� �Ͽ���, 2�̸� ������, 3�̸� ȭ����, 4�̸� ������, 5�̸� �����, 6�̸� �ݿ���, �ǿ��� ���� ����� ���
		if(nansu == 1) System.out.println("�Ͽ���");
		else if(nansu == 2) System.out.println("������");
		else if(nansu == 3) System.out.println("ȭ����");
		else if(nansu == 4) System.out.println("������");
		else if(nansu == 5) System.out.println("�����");	
		else if(nansu == 6) System.out.println("�ݿ���");
		else System.out.println("�����");
	}

}