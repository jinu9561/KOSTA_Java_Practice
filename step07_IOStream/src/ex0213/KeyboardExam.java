package ex0213;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyboardExam {
	
	public KeyboardExam() throws Exception {
		//Ű���� �Է¹ޱ�
//		InputStream is = System.in; // byte ������ �б�
//		int i = is.read(); //1����Ʈ �б�
//		System.out.println(i + " , " + (char)i);
		
		//InputStream --> Reader�� ��ȯ�ؼ� Ű���� �Է� ó���Ѵ�.
		InputStreamReader isr =  new InputStreamReader(System.in);
		int i = isr.read();
		System.out.println(i + " , " + (char)i);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		new KeyboardExam();
	}
}
