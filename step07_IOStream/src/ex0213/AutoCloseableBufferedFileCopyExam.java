package ex0213;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.swing.JOptionPane;

public class AutoCloseableBufferedFileCopyExam {
	
	public AutoCloseableBufferedFileCopyExam(String readName, String writeName) throws Exception {
		
//		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readName));
//				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeName))) { // 1.7���� ����
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readName));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeName));
		
		try(bis;bos){	// �ڵ����� close() �޼ҵ� ȣ���
			
			
			int i = 0;
			while (( i = bis.read()) != -1 ) {
				bos.write(i);
			}
			
			System.out.println("����Ϸ�Ǿ����ϴ�.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		String readName = JOptionPane.showInputDialog("���� ���� �̸�?");
		
		String writeName = JOptionPane.showInputDialog("������ ���� �̸�?");
		
		long start = System.nanoTime();
		
		new AutoCloseableBufferedFileCopyExam(readName, writeName);
		
		long end = System.nanoTime();
		
		
		
		
	}

}
