package ex0214;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSaveExam {
	public ObjectSaveExam() {
		Student st1 = new Student("진우", 20, "서울");
		Student st2 = new Student("철수", 22, "대구");
		// 객체를 파일에 저장하는 클래스 - ObjectOutputStream 이용
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(st1); // 객체 저장
		list.add(st2);
		
		list.add(new Student("나영", 21, "울산")); // 객체가 담긴 리스트 저장하기
		list.add(new Student("진수", 24, "서울"));
		list.add(new Student("영수", 54, "부산"));
		list.add(new Student("민지", 12, "서울"));
		list.add(new Student("미래", 65, "광주"));
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/ex0214/objSave.txt"))) {
			// 저장하자
			
//			oos.writeObject(st1); // 객체 저장
//			oos.writeObject(st2);
//			System.out.println("---- 저장완료! ----");
			
			oos.writeObject(list); // 객체가 담긴 리스트 저장
			
			System.out.println("---- 저장완료! ----");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ObjectSaveExam();
		
		
	}
}
