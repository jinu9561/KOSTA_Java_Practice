package com.ws03.dto;

/**
 *  고객의 계좌정보 관리하는 객체
 * */
public class AccountDto extends UserDto {
	public int accountSeq, balance;
	public String accountNumber; 
	
	public AccountDto() {}
	
	public AccountDto(int accountSeq, String accountNumber, int balance, int userSeq) {
		this.accountSeq = accountSeq;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.userSeq = userSeq;
	}
  
}
