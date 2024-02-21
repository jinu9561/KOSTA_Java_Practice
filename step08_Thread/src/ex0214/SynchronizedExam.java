package ex0214;

public class SynchronizedExam {
	
	public static void main(String[] args) {
		System.out.println("---메인 시작----");
		
		// 공유객체 생성
		Bank bank = new Bank();
		
		CustomerThread th1 = new CustomerThread(bank, "인출자", false);		
		CustomerThread th2 = new CustomerThread(bank, "입금자", true);
		
		th1.start();
		th2.start();
		
		System.out.println("---메인 끝----");
		
	}
}



class Bank{
	int balance;
	
	// 인출자 또는 입금자가 잔액을 변경하는 메소드
	// state가 true 이면 입금, false 면 출금
	public synchronized void balanceChange(String name, boolean state) {
		
		if(state) {
			
			if(balance == 0) { // 잔액이 0이면 증가시켜라
			//synchronized (this) { // 
				System.out.print(name + " ====> 현재 잔액 확인 : " + balance + " , ");
				balance++;
				System.out.println(name + " ====> 증가한 후 잔액 확인 : " + balance);
			//}
			} else {
				System.out.println(name + " 대기중 입니다...");
				try {
					wait(); // this. 이나 super. 생략됨!!! Bank의 부모 Object 에 있는 메소드 호출한것
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		} else {
			
			if(balance > 0) {
			//synchronized (this) {
				System.out.print(name + " ====> 현재 잔액 확인 : " + balance + " , ");
				balance--;
				System.out.println(name + " ====> 증가한 후 잔액 확인 : " + balance);
			//}
			} else {
				System.out.println(name + " 대기중입니다...");
				try {
					wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // else end...
			
			notifyAll(); // wait() 에 의해 대기중인 스레드 깨우기
		}
	} // 메소드 끝...
} // bank end...

class CustomerThread extends Thread {
	Bank bank;
	String name;
	boolean state;	
	
	public CustomerThread(Bank bank, String name, boolean state) {
		this.bank = bank;
		this.name = name;
		this.state = state;
	}
	
	@Override
	public void run() {
		for(int i = 0; i <= 50; i++) {
			bank.balanceChange(name, state);
		}
		System.out.println(super.getName() + " End 입니다... ");
	}
	
}
