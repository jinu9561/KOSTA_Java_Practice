package ex0214;

public class ThreadExam {
	
	public static void main(String[] args) {
		System.out.println("****���� �����մϴ�*****");
		
		NumberThread th1 = new NumberThread("ù��° ������");
		NumberThread th2 = new NumberThread("�ι�° ������");
		
		Runnable alphaRun = new AlphaRunnable();
		Thread th3 = new Thread(alphaRun, "����° ������");
		
		th1.start();
		th2.start();
		th3.start();
		
//		try {
//			th1.join(); // th1 �����尡 ���� ��ĥ������ ���� ������(main)�� ���
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		System.out.println("���� = " + th1.sum); // �׳� �ϸ� 0 join ���� 5050(ù��° ������ ������ ȣ��)
		
		System.out.println("****���� �����մϴ�*****");
		
	}	
}


///////////////////////////////////////////////

// 1~100���� ����ϴ� ������

class NumberThread extends Thread {
	int sum;
	
	public NumberThread(String name) {
		super(name); // �������� �̸�
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			System.out.println(super.getName() + " --> " + i);
			//Thread.yield(); // �纸(���� �����带 ��� ���·�)
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//sum += i;
		}
		
		System.out.println(super.getName() + " �����մϴ�. ^.^b");
	}
}

//////////////////////////////////////////////////

// A~Z ����ϴ� ������

class AlphaRunnable implements Runnable{

	@Override
	public void run() {
		// ���� ������ 
		Thread th = Thread.currentThread();
		
		for(char ch = 'A'; ch < 'z'; ch++) {
			System.out.println(th.getName() + " --> " + ch);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			//Thread.yield(); // �纸(���� �����带 ��� ���·�)
		}
		System.out.println(th.getName() + " �����մϴ�. ^.^b");

	}
	
	
}
