package com.ws03.exceptionDto;

public class UserAccountNotFoundException extends Exception {
	
	public UserAccountNotFoundException() {
		super("일치하는 사용자 또는 계좌가 없습니다!");
	}
	
	public UserAccountNotFoundException(String message) {
		super(message);
	}
}
