package ex0124.���;

public class SwitchExam02 {
	public static void main(String[] args) {
		//1~12 ���� ���� �߻�
		int nansu = (int)(Math.random()*12 + 1);
		
		// ��� -> ~���� ~�ϱ��� �Դϴ�.(������ ���°ɷ� ġ��)
		int day = 31;
		
//		switch (nansu) {
//		case 2: day = 28; break;
//		case 4, 6, 9, 11: day = 30; break; // ������ ���°� ���� 14 ���ĺ��� ��������
//		}
		
//		switch (nansu) {
//		case 2 -> {day=28;}
//		case 4, 6, 9, 11 -> {day=30;} // ������ ���°� ���� 14 ���ĺ��� ��������
//		}
		
//		switch (nansu) {
//		case 2 -> day=28;
//		case 4, 6, 9, 11 -> day=30; // ������ ���°� ���� 14 ���ĺ��� ��������
//		}
		
		day = switch (nansu) {
		case 2 -> 28;
		case 4, 6, 9, 11 -> {yield 30;} // -> �ڿ� {} ������ yield �����
		default -> 31; 
		};
		
		System.out.println(nansu + "���� " + day + "�ϱ��� �ֽ��ϴ�.");
		
		//if������ ����
		if(nansu == 2) day = 28;
		else if(nansu == 4||nansu == 6||nansu == 9||nansu == 11) day = 30;
		System.out.println(nansu + "���� " + day + "�ϱ��� �ֽ��ϴ�.");
		
	}
	
}
