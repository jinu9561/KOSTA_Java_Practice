package ex0213;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class FileCopyExam {
	
	public FileCopyExam(String readName, String writeName) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(readName);
			fos = new FileOutputStream(writeName);
			
			int i = 0;
			while (( i = fis.read()) != -1 ) {
				fos.write(i);
			}
			
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//�ݱ�
				if(fis != null) fis.close();
				if(fis != null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		String readName = JOptionPane.showInputDialog("���� ���� �̸�?");
		
		String writeName = JOptionPane.showInputDialog("������ ���� �̸�?");
		
		long start = System.nanoTime();
		
		new FileCopyExam(readName, writeName);
		
		long end = System.nanoTime();
		
		
		
		
	}

}
