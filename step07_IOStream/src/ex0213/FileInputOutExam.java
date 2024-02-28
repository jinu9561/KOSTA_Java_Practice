package ex0213;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class FileInputOutExam {
	
	public FileInputOutExam() {
		FileInputStream fis = null; // 지역변수기 때문에 초기값 주는거임
		FileOutputStream fos = null;
		
		try {		
			//byte 단위로 읽기
			fis = new FileInputStream("src/ex0213/test.txt");
			//fis = new FileInputStream("src/ex0213/FileExam.java");
			
//			//1byte씩 읽기
//			while(true) {
//				int i = fis.read(); // test.txt의 한 바이트씩 읽음
//				if(i == -1) break;
//				System.out.println(i + " , " + (char)i);
//			}
			
//			int length = fis.available();
//			System.out.println("length = " + length);
//			byte b[] = new byte[length];
//			fis.read(b);
			
//			for(byte bb : b) {
//				System.out.println(bb);
//			}
			
			//byte 배열을 String으로 변환
			//String str = new String(b);
			//System.out.println(str);
			
			//////////////////////////////////////
			// byte단위로 저장 = 쓰기
			fos = new FileOutputStream("src/ex0213/writer.txt", true);
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
			fos.write(32); //공백
			fos.write(68);
			fos.write(69);
			
			fos.write(13);
			fos.write(10);
			
			fos.write(70);
			
			//String을 byte 배열로 변환해서 넣기
			String message = "안녕하세요.Jinwoo";
			fos.write(message.getBytes());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new FileInputOutExam();
	}
	
}
