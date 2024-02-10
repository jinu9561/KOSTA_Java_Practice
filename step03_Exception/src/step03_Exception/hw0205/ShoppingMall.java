package step03_Exception.hw0205;

import java.io.IOException;

public class ShoppingMall {
	public void filter(int age) throws ExceptionShoppingMall {
		if(age < 18) {
			throw new ExceptionShoppingMall("어른이 되어서 오거라");
		} else {
			System.out.println("환영합니다~");
		}
	}
}
