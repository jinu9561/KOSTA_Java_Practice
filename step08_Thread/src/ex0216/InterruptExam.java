package ex0216;

public class InterruptExam {
	
	public static void main(String[] args) {
		System.out.println("***메인 시작입니다...");
		
//		Thread th = new Thread( () -> {
//			try {
//				while(true) {
//					System.out.println("Thread 노잼");
//					Thread.sleep(1); // 0.001초
//					}
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//					}
//			} );
//		
//		th.start();
//		
//		// 3초후에 스레드 종료시키자
		
		Thread th = new Thread( () -> {
				while(true) {
					if(Thread.interrupted()) break;
					
					System.out.println("Thread 노잼");
					}
				}
			 );
		
		th.start();
		
		// 3초후에 스레드 종료시키자
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th.interrupt(); //스레드 종료 반드시 일시정지 상태가 될때 종료를 감지하고 스레드를 안전하게 종료할수 있다
		
		System.out.println("***메인 종료합니다...");
	}
	
	
}
