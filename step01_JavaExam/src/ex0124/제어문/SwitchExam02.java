package ex0124.제어문;

public class SwitchExam02 {
	public static void main(String[] args) {
		//1~12 사이 난수 발생
		int nansu = (int)(Math.random()*12 + 1);
		
		// 출력 -> ~월은 ~일까지 입니다.(윤년은 없는걸로 치고)
		int day = 31;
		
//		switch (nansu) {
//		case 2: day = 28; break;
//		case 4, 6, 9, 11: day = 30; break; // 여러개 쓰는거 버전 14 이후부터 가능해짐
//		}
		
//		switch (nansu) {
//		case 2 -> {day=28;}
//		case 4, 6, 9, 11 -> {day=30;} // 여러개 쓰는거 버전 14 이후부터 가능해짐
//		}
		
//		switch (nansu) {
//		case 2 -> day=28;
//		case 4, 6, 9, 11 -> day=30; // 여러개 쓰는거 버전 14 이후부터 가능해짐
//		}
		
		day = switch (nansu) {
		case 2 -> 28;
		case 4, 6, 9, 11 -> {yield 30;} // -> 뒤에 {} 들어가려면 yield 써야함
		default -> 31; 
		};
		
		System.out.println(nansu + "월은 " + day + "일까지 있습니다.");
		
		//if문으로 변경
		if(nansu == 2) day = 28;
		else if(nansu == 4||nansu == 6||nansu == 9||nansu == 11) day = 30;
		System.out.println(nansu + "월은 " + day + "일까지 있습니다.");
		
	}
	
}
