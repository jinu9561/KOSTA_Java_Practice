package ex0214;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSaveExam {
	public ObjectSaveExam() {
		Student st1 = new Student("����", 20, "����");
		Student st2 = new Student("ö��", 22, "�뱸");
		// ��ü�� ���Ͽ� �����ϴ� Ŭ���� - ObjectOutputStream �̿�
		
		List<Student> list = new ArrayList<Student>();
		
		list.add(st1); // ��ü ����
		list.add(st2);
		
		list.add(new Student("����", 21, "���")); // ��ü�� ��� ����Ʈ �����ϱ�
		list.add(new Student("����", 24, "����"));
		list.add(new Student("����", 54, "�λ�"));
		list.add(new Student("����", 12, "����"));
		list.add(new Student("�̷�", 65, "����"));
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/ex0214/objSave.txt"))) {
			// ��������
			
//			oos.writeObject(st1); // ��ü ����
//			oos.writeObject(st2);
//			System.out.println("---- ����Ϸ�! ----");
			
			oos.writeObject(list); // ��ü�� ��� ����Ʈ ����
			
			System.out.println("---- ����Ϸ�! ----");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new ObjectSaveExam();
		
		
	}
}
