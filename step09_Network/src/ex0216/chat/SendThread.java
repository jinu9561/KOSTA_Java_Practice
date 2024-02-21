package ex0216.chat;
// 키보드 입력을 받아서 상대측에게 데이터 전송하기

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
	Socket sk;
	
	public SendThread(Socket sk, String name) {
		super(name); // 스레드의 이름 설명
		this.sk = sk;
	}
	
	
	@Override
	public void run() {
		//키보드 입력 받기
		Scanner sc = new Scanner(System.in);
		try {
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			
			while(true) {
				String inputData = sc.nextLine();
				
				if(inputData.equals("exit")) {
					pw.println(inputData);
					break;
				} else {
					pw.println(super.getName() + " 가 보낸 내용" + inputData);
				}
			}
			
			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		while(true) {
			String inputData = sc.nextLine();
			
			// 상대측에 전송
			
			
		}
		
	}
	
	
	
}
