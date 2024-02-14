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
//				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeName))) { // 1.7부터 가능
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(readName));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(writeName));
		
		try(bis;bos){	// 자동으로 close() 메소드 호출됨
			
			
			int i = 0;
			while (( i = bis.read()) != -1 ) {
				bos.write(i);
			}
			
			System.out.println("복사완료되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		String readName = JOptionPane.showInputDialog("읽을 파일 이름?");
		
		String writeName = JOptionPane.showInputDialog("저장할 파일 이름?");
		
		long start = System.nanoTime();
		
		new AutoCloseableBufferedFileCopyExam(readName, writeName);
		
		long end = System.nanoTime();
		
		
		
		
	}

}
