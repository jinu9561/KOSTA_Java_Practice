package ex0131.practiceEx.sample02;


public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee [] emp = new Employee[5];
		
		emp[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전", 8500, 200);
		emp[1] = new FullTime(20, "박명수", "가수", 10, "2013-06-20", "무한도전", 7500, 100);
		emp[2] = new FullTime(30, "정준하", "예능인", 10 , "2013-06-22", "무한도전", 6000, 0);
		emp[3] = new PartTime(40, "노홍철", "예능인", 20 , "2014-05-01", "무한도전", 20000);
		emp[4] = new PartTime(50, "하하", "가수", 30 , "2014-05-02", "무한도전", 25000);
		
		//출력화면을 보고 코딩...
		
		System.out.println("\n*********FullTime 정보************");
		for(Employee fu : emp) {
			if(fu instanceof FullTime) {
				System.out.println(fu);
			}
		}
		
		System.out.println("\n*********PartTime 정보***********");
		for(Employee pa : emp) {
			if(pa instanceof PartTime) {
				System.out.println(pa);
			}
		}
		
		System.out.println("\n************Message************");
		for(Employee fu : emp) {
			if(fu instanceof FullTime) {
				fu.message();
			}
		}
		
		for(Employee pa : emp) {
			if(pa instanceof PartTime) {
				pa.message();
			}
		}
		
	}

}






