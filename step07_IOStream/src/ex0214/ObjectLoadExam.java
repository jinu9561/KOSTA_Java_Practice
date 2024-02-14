package ex0214;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLoadExam {
	public ObjectLoadExam() {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/ex0214/objSave.txt"))) {
//			Student st1 = (Student)ois.readObject();
//			Student st2 = (Student)ois.readObject();
//			
//			System.out.println("st1 = " + st1);
//			System.out.println("st2 = " + st2);
			
			List<Student> studentList = (List<Student>)ois.readObject();
			
			for(Student st : studentList) {
				System.out.println(st);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		new ObjectLoadExam();
		
		
	}
}
