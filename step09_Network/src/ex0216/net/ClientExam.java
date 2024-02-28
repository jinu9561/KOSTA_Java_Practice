package ex0216.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
	public ClientExam() {
		// 서버에 접속
			try(Socket sk = new Socket("192.168.56.1", 8000)) { // ip = 192.168.56.1
				// 서버에게 데이터를 전송을 먼저 해야함
				PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
				pw.println("자바세상에 접속하고 싶은디------");
				
				// 서버가 보내온 데이터 읽기
				BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				String data = br.readLine();
				System.out.println("서버가 보내온 데이터 : " + data);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ClientExam();
	}
}
