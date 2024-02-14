package ex0213;

import java.io.File;

import javax.swing.JOptionPane;

public class FileExam {
	
	public FileExam() throws Exception {
		// ���� ��ü ����
		String fileName = JOptionPane.showInputDialog("���� �̸���?");
		//System.out.println("fileName = " + fileName);
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println(fileName + " �����մϴ�. ");
			
			if(file.isDirectory()) { // ������?
				System.out.println("--- �����ȿ� �����̳� ���� �̸� �������� ---");
				String fnames[] = file.list();
				for(String name : fnames){
					System.out.println(name);
				}
			} else {
				System.out.println("file.canRead() = " + file.canRead());
				System.out.println("file.canWrite() = " + file.canWrite());
				System.out.println("file.getName() = " + file.getName());
				System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
				System.out.println("file.length() = " + file.length());
				
				System.out.println("�����ϰڽ���~^^");
				file.delete();
			}
			
		} else {
			System.out.println(fileName + " �����Ƿ� �����մϴ�. ");
			file.createNewFile(); // ���ϻ���
			//file.mkdir(); // ���� ����
			
		} 
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new FileExam();
		
		
	}

}
