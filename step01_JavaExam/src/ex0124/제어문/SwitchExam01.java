package ex0124.���;

public class SwitchExam01 {
	public static void main(String[] args) {
		//1~12 ������ ������ �߻��Ѵ�.
		int nansu = (int)(Math.random()*12 + 1);
		
		//�߻��� ������ 1�̸� �Ͽ���, 2�̸� ������, 3�̸� ȭ����, 4�̸� ������, 5�̸� �����, 6�̸� �ݿ���, �ǿ��� ���� ����� ���
		char ch;
		
		switch (nansu) {
		case 1: ch = '��'; break;
		case 2: ch = '��'; break;
		case 3: ch = 'ȭ'; break;
		case 4: ch = '��'; break;
		case 5: ch = '��'; break;
		case 6: ch = '��'; break;
		default: ch = '��';
		}
		
		System.out.println(ch + "����");
		
	}
}
