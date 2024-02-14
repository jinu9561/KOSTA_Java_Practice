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
			
			System.out.println("복사완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//닫기
				if(fis != null) fis.close();
				if(fis != null) fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		String readName = JOptionPane.showInputDialog("읽을 파일 이름?");
		
		String writeName = JOptionPane.showInputDialog("저장할 파일 이름?");
		
		long start = System.nanoTime();
		
		new FileCopyExam(readName, writeName);
		
		long end = System.nanoTime();
		
		
		
		
	}

}
