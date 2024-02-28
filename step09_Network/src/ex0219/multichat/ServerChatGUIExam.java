package ex0219.multichat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerChatGUIExam {
	Socket sk;
	String userIp;
	List<ClientSocketThread> list = new ArrayList<ServerChatGUIExam.ClientSocketThread>();
	
	public ServerChatGUIExam() {
		
		try(ServerSocket server = new ServerSocket(8000)) {
			
			while(true) {
				System.out.println("CLIENT 접속 대기중...");
				sk = server.accept();
				userIp = sk.getInetAddress().toString();
				System.out.println(userIp + "님 접속되었습니다!!");
				
				//접속된 각 sk를 스레드로 만든다 -> 자료구조에 추가
				ClientSocketThread th = new ClientSocketThread();
				list.add(th);
				th.start();
				
				System.out.println("[접속 인원수] " + list.size() + "명");
				System.out.println();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // 생성자 끝
	
	// List에 저장된 ClientSocketThread를 꺼내서 모든 유저에게 메시지 전송
	public void sendMessage(String message) {
		for(ClientSocketThread th : list) {
			th.pw.println(message);
		}
	}
	
	// 클라이언트 Socket을 스레드로 만들어서 클라이언트가 보내오는 내용을 읽어서 모든 User에서 데이터 전송하는 스레드
	class ClientSocketThread extends Thread {
		BufferedReader br;
		PrintWriter pw;
		String nickName;
		
		@Override
		public void run() {
			// 읽기
			try {
				br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				
				// 전송=쓰기
				pw = new PrintWriter(sk.getOutputStream(), true); // Autoflush
				
				// 대화명 읽기
				nickName = br.readLine();
				
				// 대화명을 모든 유저에게 보낸다.
				sendMessage(nickName + "님이 입장하셨습니다.");
				
				String inputData = null;
				while((inputData = br.readLine()) != null) {
					// 읽은 내용을 모든 클라이언트에게 전송
					sendMessage("[" + nickName + "] " + inputData);
				}
				
			} catch (IOException e) {
				// 접속된 클라이언트 Socket 이 닫힌 경우 리스트에서 삭제
				list.remove(this);
				
				// 남아있는 모든 유저에게 누가 나간지 알림
				sendMessage("[" + nickName + "] 님이 퇴장하셨습니다.");
				
				// 서버창에도 출력
				System.out.println("[" + nickName + "] 님이 퇴장하셨습니다. | 현재 접속인원 = " + list.size());
			}
		
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		
		new ServerChatGUIExam();
		
	}
}
