package exam;

import java.util.Scanner;

public class EncapsulationExam {
	
	private int weight;
	private String pwd;
	
	public EncapsulationExam() { };
	
	public EncapsulationExam(int weight, String pwd) { 
		this.weight = weight;
		this.pwd = pwd;
	}
	
	public int getWeight(String pwd) {
		if(isPassword(pwd)) return this.weight;
		else return -1;
	}
	
	public void setWeight(int weight, String pwd) {
		if(isPassword(pwd)) this.weight = weight;			
		else System.out.println("��й�ȣ ����ġ");
	}
	
	public void setPassword(String pwd1, String pwd2) {
		if(isPassword(pwd1)) this.pwd = pwd2;
		else System.out.println("��й�ȣ ����ġ");
	}
	
	private boolean isPassword(String pwd) {
		if(this.pwd.equals(pwd)) return true;
		else return false;
	}
	
	//---------------------------------------------------------------------------

	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		boolean run=true;
		
		System.out.println("������ �����Դ�>");
		int w = sc.nextInt();
		System.out.println("������ ��й�ȣ��>");
		String p = sc.next();
		
		EncapsulationExam e = new EncapsulationExam(w, p);
		
		while(run) {
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1.������ �˻�  | 2.������ ����   | 3. ��й�ȣ ����  |  9.����");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("����> ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1: {
				System.out.println("������ �˻�");
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				int weight = e.getWeight(sc.next());
				if(weight == -1) System.out.println("��й�ȣ ����ġ");
				else System.out.println(weight);
				break;
			} case 2: {
				System.out.println("������ ����");
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				String pwd = sc.next();
				System.out.print("������ �����Ը� �Է��ϼ���: ");
				int weight = sc.nextInt();
				e.setWeight(weight, pwd);
				break;
			} case 3: {
				System.out.println("��й�ȣ ����");
				System.out.print("��й�ȣ�� �Է��ϼ���: ");
				String pwd = sc.next();
				System.out.print("������ ��й�ȣ�� �Է��ϼ���: ");
				String pwd2 = sc.next();
				e.setPassword(pwd, pwd2);
				break;
			} case 9: {
				System.out.println("�ý��� ����");
				run = false;
				break;
			}
			default:{
				System.out.println("�߸��� ���� �Դϴ�!");
				break;
			}
				
			}

		}
	}
}
