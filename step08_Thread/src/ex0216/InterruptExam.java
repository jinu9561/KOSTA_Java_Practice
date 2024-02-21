package ex0216;

public class InterruptExam {
	
	public static void main(String[] args) {
		System.out.println("***���� �����Դϴ�...");
		
//		Thread th = new Thread( () -> {
//			try {
//				while(true) {
//					System.out.println("Thread ����");
//					Thread.sleep(1); // 0.001��
//					}
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//					}
//			} );
//		
//		th.start();
//		
//		// 3���Ŀ� ������ �����Ű��
		
		Thread th = new Thread( () -> {
				while(true) {
					if(Thread.interrupted()) break;
					
					System.out.println("Thread ����");
					}
				}
			 );
		
		th.start();
		
		// 3���Ŀ� ������ �����Ű��
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		th.interrupt(); //������ ���� �ݵ�� �Ͻ����� ���°� �ɶ� ���Ḧ �����ϰ� �����带 �����ϰ� �����Ҽ� �ִ�
		
		System.out.println("***���� �����մϴ�...");
	}
	
	
}
