package step03_Exception.hw0205;

import java.io.IOException;

public class ShoppingMall {
	public void filter(int age) throws ExceptionShoppingMall {
		if(age < 18) {
			throw new ExceptionShoppingMall("��� �Ǿ ���Ŷ�");
		} else {
			System.out.println("ȯ���մϴ�~");
		}
	}
}
