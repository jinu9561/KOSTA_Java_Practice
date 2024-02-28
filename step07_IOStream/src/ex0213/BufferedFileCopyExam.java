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
			
			//Buffered 적용
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			int i = 0;
			while (( i = bis.read()) != -1 ) {
				bos.write(i);
			}
			
			System.out.println("복사완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//닫기
				if(fis != null) bis.close();
				if(fis != null) bos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		String readName = JOptionPane.showInputDialog("읽을 파일 이름?");
		
		String writeName = JOptionPane.showInputDialog("저장할 파일 이름?");
		
		long start = System.nanoTime();
		
		new BufferedFileCopyExam(readName, writeName);
		
		long end = System.nanoTime();
		
		
		
		
	}

}
