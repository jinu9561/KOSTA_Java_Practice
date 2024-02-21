package ex0216.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam {
	public ClientChatExam() {
		try {
			Socket sk = new Socket("192.168.56.1", 9000);
			System.out.println("서버와 채팅을 시작합니다...");
			
			// 보내는 스레드 
			new SendThread(sk, "CLIENT").start();
			
			// 받는 스레드 
			new Thread( () -> {
				try(BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))) {
					
					while(true) {
						String read = br.readLine();
						if(read.equals("exit")) break;
						
						System.out.println(read); // exit아니면 모니터에 출력
					}
					
					System.out.println("서버 받는 스레드 종료합니다.ㅎ.ㅎ");
					
				} catch (Exception e) {
					//e.printStackTrace();
				} finally {
					
					//남아있는 리소스 정리
					System.out.println("클라이언트 프로그램 종료하겠습니다.^^");
					System.exit(0);
					
				}
				
			} ).start();
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("ClientChatExam catch...");
		} }
	
	public static void main(String[] args) {
		new ClientChatExam();
	}
}
