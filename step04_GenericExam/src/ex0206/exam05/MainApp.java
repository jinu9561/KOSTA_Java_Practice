package ex0206.exam05;

public class MainApp {
	public static void main(String[] args) {
		MainApp ma = new MainApp();
		
		Box<Integer> box1 = ma.boxing(100);
		System.out.println(box1.getT());
		
		Box<String> box2 = ma.boxing("����");
		System.out.println(box2.getT());

		
		
	}
	
	// �޼ҵ� �߰� - ���ʸ��޼ҵ�
	public <T> Box<T> boxing(T t) { // ������ �߾˾ƵѰ�!!!
		Box<T> box = new Box<T>();
		box.setT(t);		
		
		return box;
	}
	
	public <T> Box<T> boxing2() { // ������ �߾˾ƵѰ�!!!
		
		return null;
	}
	
	public <T> void boxing3() { // ������ �߾˾ƵѰ�!!!
		
	}
	
	
}
