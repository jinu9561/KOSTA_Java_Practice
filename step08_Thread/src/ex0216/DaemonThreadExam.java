package ex0216;

public class DaemonThreadExam {
	
	public static void main(String[] args) {
		System.out.println("***���� �����Դϴ�...");
		
		Runnable r = () -> {
			// run �޼ҵ忡�� �ؾ����� �ۼ�
			while(true) {
				System.out.println("���� ���󽺷���");
			}
			
		};
		
		Thread th = new Thread(r);
		
		th.setDaemon(true);
		th.start();
		
		// 2���� ������ ����Ǹ� �����嵵 �Բ� �����ϰ�ʹ� - ���󽺷���
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("***���� �����մϴ�...");
		
		
		
	}
	
}
