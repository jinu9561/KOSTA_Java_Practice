package ex0214;

public class ThreadExam {
	
	public static void main(String[] args) {
		System.out.println("****메인 시작합니다*****");
		
		NumberThread th1 = new NumberThread("첫번째 스레드");
		NumberThread th2 = new NumberThread("두번째 스레드");
		
		Runnable alphaRun = new AlphaRunnable();
		Thread th3 = new Thread(alphaRun, "세번째 스레드");
		
		th1.start();
		th2.start();
		th3.start();
		
//		try {
//			th1.join(); // th1 스레드가 일을 마칠때까지 현재 스레드(main)는 대기
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("총합 = " + th1.sum); // 그냥 하면 0 join 쓰면 5050(첫번째 스레드 끝날때 호출)
		
		System.out.println("****메인 종료합니다*****");
		
	}	
}


///////////////////////////////////////////////

// 1~100까지 출력하는 스레드

class NumberThread extends Thread {
	int sum;
	
	public NumberThread(String name) {
		super(name); // 스레드의 이름
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(super.getName() + " --> " + i);
			//Thread.yield(); // 양보(현재 스레드를 대기 상태로)
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//sum += i;
		}
		
		System.out.println(super.getName() + " 종료합니다. ^.^b");
	}
}

//////////////////////////////////////////////////

// A~Z 출력하는 스레드

class AlphaRunnable implements Runnable{

	@Override
	public void run() {
		// 현재 스레드 
		Thread th = Thread.currentThread();
		
		for(char ch = 'A'; ch < 'z'; ch++) {
			System.out.println(th.getName() + " --> " + ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Thread.yield(); // 양보(현재 스레드를 대기 상태로)
		}
		System.out.println(th.getName() + " 종료합니다. ^.^b");

	}
	
	
}
