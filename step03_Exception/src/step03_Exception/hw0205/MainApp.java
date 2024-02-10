package step03_Exception.hw0205;

public class MainApp {

	public static void main(String[] args) {
		
		ShoppingMall s = new ShoppingMall();
		
		for(int i = 0; i < 10; i++) {
			int a = (int)(Math.random()*55)+1;
//			System.out.println(a);
			try {
				s.filter(a);
			} catch (ExceptionShoppingMall e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(ExceptionShoppingMall.cnt);
		
	}
	
}
