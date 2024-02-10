package ex0124.제어문;

public class SwitchExam01 {
	public static void main(String[] args) {
		//1~12 사이의 난수를 발생한다.
		int nansu = (int)(Math.random()*12 + 1);
		
		//발생한 난수가 1이면 일요일, 2이면 월요일, 3이면 화요일, 4이면 수요일, 5이면 목요일, 6이면 금요일, 의외의 수는 토요일 출력
		char ch;
		
		switch (nansu) {
		case 1: ch = '일'; break;
		case 2: ch = '월'; break;
		case 3: ch = '화'; break;
		case 4: ch = '수'; break;
		case 5: ch = '목'; break;
		case 6: ch = '금'; break;
		default: ch = '토';
		}
		
		System.out.println(ch + "요일");
		
	}
}
