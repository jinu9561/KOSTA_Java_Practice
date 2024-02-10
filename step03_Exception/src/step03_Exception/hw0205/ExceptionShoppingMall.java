package step03_Exception.hw0205;

public class ExceptionShoppingMall extends Exception {
	
	public static int cnt;
	
	public ExceptionShoppingMall() {
		super("애들은 가라!");
		cnt++;
	}
	
	public ExceptionShoppingMall(String message) {
		super(message);
		cnt++;
	}

}
