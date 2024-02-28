package ex0213;

import java.io.File;

import javax.swing.JOptionPane;

public class FileExam {
	
	public FileExam() throws Exception {
		// 파일 객체 생성
		String fileName = JOptionPane.showInputDialog("파일 이름은?");
		//System.out.println("fileName = " + fileName);
		File file = new File(fileName);
		
		if(file.exists()) {
			System.out.println(fileName + " 존재합니다. ");
			
			if(file.isDirectory()) { // 폴더니?
				System.out.println("--- 폴더안에 파일이나 폴더 이름 가져오기 ---");
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
				
				System.out.println("삭제하겠슴다~^^");
				file.delete();
			}
			
		} else {
			System.out.println(fileName + " 없으므로 생성합니다. ");
			file.createNewFile(); // 파일생성
			//file.mkdir(); // 폴더 생성
			
		} 
		
	}
	
	public static void main(String[] args) throws Exception {
		
		new FileExam();
		
		
	}

}
