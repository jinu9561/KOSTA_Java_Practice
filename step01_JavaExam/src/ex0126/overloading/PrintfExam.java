package ex0126.overloading;

import java.util.Calendar;
import java.util.GregorianCalendar;

class  PrintfExam{
	public static void main(String[] args) {
		System.out.printf("%d%d%n",20,30); // printf() 는 인수로 string 반드시 들어ㅓ가야함
		System.out.printf("%d , %d%n",20,30);
		System.out.println();
		System.out.printf("가격 : %,d원%n",25320000);
		System.out.printf("%5.2f%n",35.33333);
		System.out.println();
		System.out.printf("%d년  %d월 %d일%n",2009,5,3);
		System.out.printf("%2$d년 %3$d월 %1$d일%n",1, 2005, 3);

		Calendar now= Calendar.getInstance();
		System.out.println("\nYear=>"+now.get(Calendar.YEAR));
		System.out.println("month=>"+ (now.get(Calendar.MONTH)+1) );
		System.out.println("date=>"+now.get(Calendar.DATE) +"\n");
		
		//System.out.println(now); // -> java.util.GregorianCalendar[time=1706246145453,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=26,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=15,SECOND=45,MILLISECOND=453,ZONE_OFFSET=32400000,DST_OFFSET=0]

		System.out.printf("%tY년 %tm월 %td일 %tH시 : %tM분 : %tS초%n" , now, now, now, now, now, now);
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$tH시 : %1$tM분 : %1$tS초%n" , now); // 1$ 사용해서 위에거랑 똑같이 만듦
		
		System.out.println();
		System.out.printf("%3d %-10s %-8s %-5d%n",1,"jang","장희정",20); // - : 왼쪽 정렬 (안하면 오른쪽 정렬)
		System.out.printf("%3d %-10s %-8s %-5d%n",22,"hee","정효욱",03);
		System.out.printf("%3d %-10s %-8s %-5d%n",3,"rew97","장정희",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",4,"jang","장희정",20);
	}
}
