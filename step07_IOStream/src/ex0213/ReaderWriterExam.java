package ex0213;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterExam {
	
	public ReaderWriterExam() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("src/ex0213/test.txt")); 
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0213/info.txt"))) {
			
//			while(true) {
//				int i = br.read();
//				if(i == -1 ) break;
//				System.out.println(i + " , " + (char)i);
//				
//			}
			
			String data = null;
			
			while((data = br.readLine()) != null) {
				System.out.println(data);
			}
			
			///////////////////////////////////////////////////////////////
			bw.write(65);
			bw.write("bcdef");
			bw.write(32);
			bw.write("재미있다.");
			bw.newLine();
			bw.write("좋아요");
			bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		new ReaderWriterExam();
	}
}
