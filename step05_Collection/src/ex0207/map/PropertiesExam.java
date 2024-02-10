package ex0207.map;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class PropertiesExam {
	Properties pro = new Properties();
	
	public PropertiesExam() {
		// 저장
		pro.setProperty("id", "jang");
		pro.setProperty("name", "희정");
		pro.setProperty("age", "20");
		
		// 저장된 정보 검색
		for(String key : pro.stringPropertyNames()) {
			String value = pro.getProperty(key);
			System.out.println(key + " : " + value);
		}
	}
	
	// 외부의 ~.properties 파일을 로딩하는 방법 2가지
	// 1) IO를 이용하는 방법
	// 2) ResourceBundle 이용하는 방법
	
	// 1) IO를 이용하는 방법 -> 사용한 정보를 유지하면서 수정하거나 할 수 있음
	public void test01() {
		try {
			pro.load(new FileInputStream("src/ex0207/map/practice.properties"));
			System.out.println("\n=============================\n");
			
			for(String key : pro.stringPropertyNames()) {
				String value = pro.getProperty(key);
				System.out.println(key + " : " + value );
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 2) ResourceBundle 이용하는 방법 -> 일회성임 (번들을 한번 읽고 다시 안씀)
	// 확장자가 properties 파일을 읽어들이는 전용 클래스
	public void test02() {
		System.out.println("\n========== ResourceBundle 이용하는 방법 ==========\n");
		ResourceBundle rb = ResourceBundle.getBundle("ex0207/map/practice"); // 확장자 안넣어줌 , src도 빼야함
		
		for(String key : rb.keySet()) {
			String value = rb.getString(key);
			System.out.println(key + " = " + value);
		}
	}
	
	
	
	public static void main(String[] args) {
		PropertiesExam p = new PropertiesExam();
		p.test02();
		
		
	}
	
}
