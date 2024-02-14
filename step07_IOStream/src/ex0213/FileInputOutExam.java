package ex0213;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOError;
import java.io.IOException;

public class FileInputOutExam {
	
	public FileInputOutExam() {
		FileInputStream fis = null; // ���������� ������ �ʱⰪ �ִ°���
		FileOutputStream fos = null;
		
		try {		
			//byte ������ �б�
			fis = new FileInputStream("src/ex0213/test.txt");
			//fis = new FileInputStream("src/ex0213/FileExam.java");
			
//			//1byte�� �б�
//			while(true) {
//				int i = fis.read(); // test.txt�� �� ����Ʈ�� ����
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
			
			//byte �迭�� String���� ��ȯ
			//String str = new String(b);
			//System.out.println(str);
			
			//////////////////////////////////////
			// byte������ ���� = ����
			fos = new FileOutputStream("src/ex0213/writer.txt", true);
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
			fos.write(32); //����
			fos.write(68);
			fos.write(69);
			
			fos.write(13);
			fos.write(10);
			
			fos.write(70);
			
			//String�� byte �迭�� ��ȯ�ؼ� �ֱ�
			String message = "�ȳ��ϼ���.Jinwoo";
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
