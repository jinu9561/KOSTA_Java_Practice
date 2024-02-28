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
		else System.out.println("비밀번호 불일치");
	}
	
	public void setPassword(String pwd1, String pwd2) {
		if(isPassword(pwd1)) this.pwd = pwd2;
		else System.out.println("비밀번호 불일치");
	}
	
	private boolean isPassword(String pwd) {
		if(this.pwd.equals(pwd)) return true;
		else return false;
	}
	
	//---------------------------------------------------------------------------

	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		boolean run=true;
		
		System.out.println("설정할 몸무게는>");
		int w = sc.nextInt();
		System.out.println("설정할 비밀번호는>");
		String p = sc.next();
		
		EncapsulationExam e = new EncapsulationExam(w, p);
		
		while(run) {
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1.몸무게 검색  | 2.몸무게 변경   | 3. 비밀번호 변경  |  9.종료");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = sc.nextInt();
			
			switch (select) {
			case 1: {
				System.out.println("몸무게 검색");
				System.out.print("비밀번호를 입력하세요: ");
				int weight = e.getWeight(sc.next());
				if(weight == -1) System.out.println("비밀번호 불일치");
				else System.out.println(weight);
				break;
			} case 2: {
				System.out.println("몸무게 변경");
				System.out.print("비밀번호를 입력하세요: ");
				String pwd = sc.next();
				System.out.print("변경할 몸무게를 입력하세요: ");
				int weight = sc.nextInt();
				e.setWeight(weight, pwd);
				break;
			} case 3: {
				System.out.println("비밀번호 변경");
				System.out.print("비밀번호를 입력하세요: ");
				String pwd = sc.next();
				System.out.print("변경할 비밀번호를 입력하세요: ");
				String pwd2 = sc.next();
				e.setPassword(pwd, pwd2);
				break;
			} case 9: {
				System.out.println("시스템 종료");
				run = false;
				break;
			}
			default:{
				System.out.println("잘못된 선택 입니다!");
				break;
			}
				
			}

		}
	}
}
