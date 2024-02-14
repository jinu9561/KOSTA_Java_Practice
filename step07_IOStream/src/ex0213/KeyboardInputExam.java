package ex0213;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class KeyboardInputExam {

	public KeyboardInputExam() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0213/save.txt"));

		
		try(br; bw){
			
			while(true) {
				System.out.println("입력 > ");
				String data = br.readLine();
				
				if(data.equals("exit")) break;
				
				bw.write(data);
				System.out.println(data);
				bw.flush();
				
			}
			
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
	
	public static void main(String[] args) throws Exception {
		new KeyboardInputExam();
	}
}
