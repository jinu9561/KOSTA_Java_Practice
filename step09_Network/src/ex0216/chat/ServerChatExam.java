package ex0216.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatExam {
	Socket sk;
	public ServerChatExam() {
		
		try(ServerSocket server = new ServerSocket(9000)) {
			System.out.println("클라이언트 접속 대기중...");
			server.accept();
			
			sk = server.accept();
			
			// 읽기 - Inner 클래스 (상대측에서 보내온 데이터 읽기)
			
			
			// 쓰기 - Outer 클래스 (상대측에게 데이터 전송)
			new SendThread(sk, "SERVER").start();
			
		} catch (Exception e) {
			//e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new ServerChatExam();
		
	}
	
	// Inner 클래스는  Outer 클래스의 필드와 메소드를 접근
	
	class ServerReceiveTread extends Thread {
		
		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))) {
				
				while(true) {
					String read = br.readLine();
					if(read.equals("exit")) break;
					
					System.out.println(read); // exit아니면 모니터에 출력
				}
				
				System.out.println("서버 받는 스레드 종료합니다.ㅎ.ㅎ");
				
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("ServerReceivedTread catch 입니다...");
			} finally {
				
				//남아있는 리소스 정리
				System.out.println("서버 프로그램 종료하겠습니다.^^");
				System.exit(0);
			}
		}
		
	}  // Inner 클래스 => ServerChatExamServerRecriveThread.class
} // 클래스 끝
