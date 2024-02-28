package com.ws03.view;

import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.exceptionDto.BalanceLackException;
import com.ws03.exceptionDto.UserAccountNotFoundException;
import com.ws03.service.BankService;
import com.ws03.service.BankServiceImpl;

public class Test {
	public static void main(String[] args) {

		BankService bankService = new BankServiceImpl();
		
		System.out.println("1. 모든 계좌정보 조회 ------");
		print(bankService.getAccountList());
		
		System.out.println("2.잔액기준으로 정렬하기 -------------");
		print(bankService.getAccountListSortByBalance());
		
		
		System.out.println("3.UserSeq 기준으로 정렬하기 -------------");
		print(bankService.getAccountListSortByUserSeq());
		
		
		System.out.println("4. 모든 계좌정보 조회 ------");
		print(bankService.getAccountList());
		
		
		////////WS_8 추가된 문제///////////////////////////////////////
		try {
			int withdrawAmount = bankService.withdraw(111, 10, 100);
			System.out.println("111번 고객의 10번 계좌의 100원 출금했을때 남은 금액 : " + withdrawAmount);
			
			System.out.println(bankService.getUserAccount(111, 10));
			
		} catch( BalanceLackException | UserAccountNotFoundException e ) {
			System.out.println( e.getMessage());
		}
		
		
	}
	

	/**
	 * 계좌목록 출력하기
	 * */
	public static void print(List<AccountDto> accountList) {
		for (AccountDto accountDto : accountList) {
			System.out.println(accountDto);
		}
		System.out.println();
	}

}

