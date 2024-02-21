package ex0216.net;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	
	public ServerExam() {
		try(ServerSocket server = new ServerSocket(8000)) {
			while(true) {
				System.out.println("클라이언트 접속 대기중입니다...^^b");
				Socket sk = server.accept();
				System.out.println(sk.getInetAddress() + "님 접속되었습니다.");
				
				// 클라이언트가 보내온 데이터 읽기
				InputStream is = sk.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is)); // 한줄씩 읽기 위함!!!!
				String data = br.readLine();
				System.out.println("클라이언트가 보내온 내용 : " + data);
				
				// 서버에게 응답 (데이터 전송)
				PrintWriter pw = new PrintWriter(sk.getOutputStream(), true); // BufferedWriter 써도 되지만 얘는 "오토 flush" 기능이 되면서(true) 원하는 타입으로 전송가능
				pw.println("서버에 접속하신걸 환영합니다.");
				sk.close();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new ServerExam();
	}
}
