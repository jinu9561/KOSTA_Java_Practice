package ex0216;

public class DaemonThreadExam {
	
	public static void main(String[] args) {
		System.out.println("***메인 시작입니다...");
		
		Runnable r = () -> {
			// run 메소드에서 해야할일 작성
			while(true) {
				System.out.println("아임 데몬스레드");
			}
			
		};
		
		Thread th = new Thread(r);
		
		th.setDaemon(true);
		th.start();
		
		// 2초후 메인이 종료되면 스레드도 함께 종료하고싶다 - 데몬스레드
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("***메인 종료합니다...");
		
		
		
	}
	
}
