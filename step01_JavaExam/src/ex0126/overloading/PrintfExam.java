package ex0126.overloading;

import java.util.Calendar;
import java.util.GregorianCalendar;

class  PrintfExam{
	public static void main(String[] args) {
		System.out.printf("%d%d%n",20,30); // printf() �� �μ��� string �ݵ�� ���ð�����
		System.out.printf("%d , %d%n",20,30);
		System.out.println();
		System.out.printf("���� : %,d��%n",25320000);
		System.out.printf("%5.2f%n",35.33333);
		System.out.println();
		System.out.printf("%d��  %d�� %d��%n",2009,5,3);
		System.out.printf("%2$d�� %3$d�� %1$d��%n",1, 2005, 3);

		Calendar now= Calendar.getInstance();
		System.out.println("\nYear=>"+now.get(Calendar.YEAR));
		System.out.println("month=>"+ (now.get(Calendar.MONTH)+1) );
		System.out.println("date=>"+now.get(Calendar.DATE) +"\n");
		
		//System.out.println(now); // -> java.util.GregorianCalendar[time=1706246145453,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,useDaylight=false,transitions=30,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=26,DAY_OF_YEAR=26,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=15,SECOND=45,MILLISECOND=453,ZONE_OFFSET=32400000,DST_OFFSET=0]

		System.out.printf("%tY�� %tm�� %td�� %tH�� : %tM�� : %tS��%n" , now, now, now, now, now, now);
		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$tH�� : %1$tM�� : %1$tS��%n" , now); // 1$ ����ؼ� �����Ŷ� �Ȱ��� ����
		
		System.out.println();
		System.out.printf("%3d %-10s %-8s %-5d%n",1,"jang","������",20); // - : ���� ���� (���ϸ� ������ ����)
		System.out.printf("%3d %-10s %-8s %-5d%n",22,"hee","��ȿ��",03);
		System.out.printf("%3d %-10s %-8s %-5d%n",3,"rew97","������",20);
		System.out.printf("%3d %-10s %-8s %-5d%n",4,"jang","������",20);
	}
}
