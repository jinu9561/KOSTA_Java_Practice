package ex0206.exam05;

public class MainApp {
	public static void main(String[] args) {
		MainApp ma = new MainApp();
		
		Box<Integer> box1 = ma.boxing(100);
		System.out.println(box1.getT());
		
		Box<String> box2 = ma.boxing("진우");
		System.out.println(box2.getT());

		
		
	}
	
	// 메소드 추가 - 제너릭메소드
	public <T> Box<T> boxing(T t) { // 문법임 잘알아둘것!!!
		Box<T> box = new Box<T>();
		box.setT(t);		
		
		return box;
	}
	
	public <T> Box<T> boxing2() { // 문법임 잘알아둘것!!!
		
		return null;
	}
	
	public <T> void boxing3() { // 문법임 잘알아둘것!!!
		
	}
	
	
}
