package step03_Exception.ex0205;

import java.io.IOException;

import javax.management.RuntimeErrorException;

public class ThrowExam {
	
	public void aa(int i) throws IOException , ArithmeticException {
		try {
			System.out.println("aa method call...");
			//�μ��� �����̸� �ȵȴ�!! -> ������ ���ܸ� �߻���Ų��.
			if(i < 0) {
				throw new IOException("������ �ʵ�~~"); // üũ ����
//				throw new RuntimeException("������ �ʵ�~~~~~"); // ��üũ ����
			}
			
			System.out.println("��� i�� ���� = " + i);
			int result = 100/i;
			
		} finally {
			System.out.println("aa method End...");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("---���� ����---");
		
		try {
			new ThrowExam().aa(0);
		} catch (IOException | ArithmeticException e) {
			System.out.println("ù��° ���� : " + e.getMessage());
		}
		
		System.out.println("---���� ��---");
		
	}
}
