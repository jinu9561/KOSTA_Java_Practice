package hw0126;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. �л��� | 2. �����Է� | 3. ��������Ʈ | 4. �м� | 5.����");
			System.out.println("-------------------------------------------------");
			System.out.println("���� > ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				System.out.print("�л���: ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			} else if(selectNo == 2) {
				for(int i = 0; i < studentNum; i++) {
					System.out.print("scores[" + i + "]> ");
					int a = sc.nextInt();
					scores[i] = a;
				}
				
			} else if(selectNo == 3) {
				for(int i = 0; i < studentNum; i++) 
					System.out.println("scores[" + i + "]: " + scores[i]);
			} else if(selectNo == 4) {
				
				int max = scores[0];
				for(int i = 0; i < studentNum; i++) 
					if(scores[i] > max) max = scores[i];
				System.out.println("�ְ� ����: " + max);
				//--------------------------------------------------------------
				int sum = 0;
				for(int i = 0; i < studentNum; i++) sum += scores[i];
				int avg = sum/studentNum;
				System.out.println("��� ����: " + avg);
				
			} else if(selectNo == 5) {
				System.out.println("���α׷� ����");
				run = false;
			} else System.out.println("�߸��� �Է°� �Դϴ�.");
			
		}

	}

}
