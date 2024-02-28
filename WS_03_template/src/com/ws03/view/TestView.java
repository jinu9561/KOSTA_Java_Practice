package com.ws03.view;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;
import com.ws03.service.BankService;

public class TestView {

	public static void main(String[] args) {
		System.out.println("***1. 고객seq에 해당하는 계좌정보 검색하기 *****");
		BankService service = new BankService();
		
		System.out.println("고객 일련번호가 100인 회원의 계좌정보 검색");
		AccountDto[] accountList = service.getAccountList(100);
		
		if(accountList==null) System.out.println("회원의 계좌정보가 없습니다. ");
		else {
			System.out.println("고객 일련번호가 100인 회원의 계좌개수 : " + accountList.length);
			for(AccountDto dto : accountList) 
				System.out.println("계좌 일련번호: " + dto.accountSeq +" / 계좌번호: " + dto.accountNumber + " / 잔고: " 
						+ dto.balance + " / 고객 일련번호: " + dto.userSeq);
		}
		
		System.out.println("\n***2. userSeq에 해당하는 고객의 정보 *************");
		System.out.println("고객 일련번호가 200인 회원의 고객정보 검색");
		UserDto userDto = service.getUserDetail(200);
		if(userDto!= null) {
		  System.out.print("고객 일련번호: " + userDto.userSeq + " , 고객이름: " + userDto.name + " , 이메일: " 
				  + userDto.email + " , 전화번호: " + userDto.phone +  " , ");
		  if(userDto.isSleep) System.out.println("휴면상태");
		  else System.out.println("휴면상태 아님");
			
		}else {
			System.out.println("회원의 정보가 없습니다.");
		}

	}//메인끝

}// 클래스 끝





