package ex0213;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardExam {
	
	public KeyboardExam() throws Exception {
		//키보드 입력받기
//		InputStream is = System.in; // byte 단위로 읽기
//		int i = is.read(); //1바이트 읽기
//		System.out.println(i + " , " + (char)i);
		
		//InputStream --> Reader로 변환해서 키보드 입력 처리한다.
		InputStreamReader isr =  new InputStreamReader(System.in);
		int i = isr.read();
		System.out.println(i + " , " + (char)i);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		new KeyboardExam();
	}
}
