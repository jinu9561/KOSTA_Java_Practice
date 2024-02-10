package ex0124.제어문;

class IfExam02{

	public static void main(String[] args){
		//1~12 사이의 난수를 발생한다.
		int nansu = (int)(Math.random() * 12 + 1);
		System.out.println(nansu);
		
		//발생한 난수가 1이면 일요일, 2이면 월요일, 3이면 화요일, 4이면 수요일, 5이면 목요일, 6이면 금요일, 의외의 수는 토요일 출력
		if(nansu == 1) System.out.println("일요일");
		else if(nansu == 2) System.out.println("월요일");
		else if(nansu == 3) System.out.println("화요일");
		else if(nansu == 4) System.out.println("수요일");
		else if(nansu == 5) System.out.println("목요일");	
		else if(nansu == 6) System.out.println("금요일");
		else System.out.println("토요일");
	}

}