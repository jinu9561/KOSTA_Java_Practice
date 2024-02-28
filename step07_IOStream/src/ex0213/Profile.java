package ex0213;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Profile {
	
	public Profile() {
		// while문
		
		while(true) {
			try {
				
				
				
				System.exit(0);// 강제 종료
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
			
		}
	}

	public void saveProfile() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("몸무게 > ");
		int weight = sc.nextInt();
		System.out.println("비밀번호 > ");
		int pwd = sc.nextInt();
		
		
		BufferedOutputStream bos = null;
		
		
		try{
			File file = new File("src/ex0213/" + name + ".txt");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		
	}
	
	
	public void loadProfile() throws Exception {
		
	}
	
	public static void main(String[] args) throws Exception {
		new Profile();
	}
}
