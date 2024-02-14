package ex0213;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class BufferedFileCopyExam {
	
	public BufferedFileCopyExam(String readName, String writeName) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(readName);
			fos = new FileOutputStream(writeName);
			
			//Buffered ����
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int i = 0;
			while (( i = bis.read()) != -1 ) {
				bos.write(i);
			}
			
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//�ݱ�
				if(fis != null) bis.close();
				if(fis != null) bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		String readName = JOptionPane.showInputDialog("���� ���� �̸�?");
		
		String writeName = JOptionPane.showInputDialog("������ ���� �̸�?");
		
		long start = System.nanoTime();
		
		new BufferedFileCopyExam(readName, writeName);
		
		long end = System.nanoTime();
		
		
		
		
	}

}
