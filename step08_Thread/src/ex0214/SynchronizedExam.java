package ex0214;

public class SynchronizedExam {
	
	public static void main(String[] args) {
		System.out.println("---���� ����----");
		
		// ������ü ����
		Bank bank = new Bank();
		
		CustomerThread th1 = new CustomerThread(bank, "������", false);		
		CustomerThread th2 = new CustomerThread(bank, "�Ա���", true);
		
		th1.start();
		th2.start();
		
		System.out.println("---���� ��----");
		
	}
}



class Bank{
	int balance;
	
	// ������ �Ǵ� �Ա��ڰ� �ܾ��� �����ϴ� �޼ҵ�
	// state�� true �̸� �Ա�, false �� ���
	public synchronized void balanceChange(String name, boolean state) {
		
		if(state) {
			
			if(balance == 0) { // �ܾ��� 0�̸� �������Ѷ�
			//synchronized (this) { // 
				System.out.print(name + " ====> ���� �ܾ� Ȯ�� : " + balance + " , ");
				balance++;
				System.out.println(name + " ====> ������ �� �ܾ� Ȯ�� : " + balance);
			//}
			} else {
				System.out.println(name + " ����� �Դϴ�...");
				try {
					wait(); // this. �̳� super. ������!!! Bank�� �θ� Object �� �ִ� �޼ҵ� ȣ���Ѱ�
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		} else {
			
			if(balance > 0) {
			//synchronized (this) {
				System.out.print(name + " ====> ���� �ܾ� Ȯ�� : " + balance + " , ");
				balance--;
				System.out.println(name + " ====> ������ �� �ܾ� Ȯ�� : " + balance);
			//}
			} else {
				System.out.println(name + " ������Դϴ�...");
				try {
					wait();
				} catch (Exception e) {
					e.printStackTrace();
				}
			} // else end...
			
			notifyAll(); // wait() �� ���� ������� ������ �����
		}
	} // �޼ҵ� ��...
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
		System.out.println(super.getName() + " End �Դϴ�... ");
	}
	
}
