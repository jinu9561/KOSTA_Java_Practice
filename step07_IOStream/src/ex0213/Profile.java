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
		// while��
		
		while(true) {
			try {
				
				
				
				System.exit(0);// ���� ����
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
			
			
			
		}
	}

	public void saveProfile() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸� > ");
		String name = sc.next();
		System.out.println("������ > ");
		int weight = sc.nextInt();
		System.out.println("��й�ȣ > ");
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
