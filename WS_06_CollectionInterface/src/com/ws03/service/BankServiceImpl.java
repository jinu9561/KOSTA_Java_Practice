package com.ws03.service;
/**
 * 고객과 계좌에 관련된 서비스
 * (Business Logic 을 처리하는 객체)
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.InstallAccountDto;
import com.ws03.dto.LoanAccountDto;
import com.ws03.dto.SavingAccountDto;
import com.ws03.dto.UserDto;

public class BankServiceImpl implements Bankservice {

	List<UserDto> userList;
	List<AccountDto> accountList;
	
	public BankServiceImpl() {
		userList = new ArrayList<UserDto>();
		accountList = new ArrayList<AccountDto>();
		
		userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		
		accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		
		accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		
		accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		
		accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
		
		accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
	}
	
    /**
	  특정 사용자의 계좌 목록을 배열로 리턴 하는 메소드를 작성한다
	*/

	 @Override
	public List<AccountDto> getAccountList(int userSeq) { // 100 200  ... 
		
		List<AccountDto> searchAccountDtoList = new ArrayList<AccountDto>();
		
		// 개선된 for문
		for(AccountDto a : accountList) {
			if( a.getUserSeq()  == userSeq) {
				searchAccountDtoList.add(a);
			}
		}
		
		return searchAccountDtoList;
	}
	
	
	/**
	   특정 사용자의 고객 정보를 리턴 하는 메소드를 작성한다
	   
	   @param : 고객의 sequence
	   @return : null이면 고객의정보없다 
	**/
	public UserDto getUserDetail(int userSeq) {
		for(UserDto u : userList) {
			if(u.getUserSeq() == userSeq) {
				//찾았다.
				return u;
			}
		}
		
		return null;
	}
	
/////////////////////////////////////////////////////
	
	public List<AccountDto> getAccountList() {
		return accountList;
	}
	
	public List<AccountDto> getAccountListSortByBalance() {
		List<AccountDto> sortByBalanceList = new ArrayList<AccountDto>(accountList);
		
		Collections.sort(sortByBalanceList);
		
		return sortByBalanceList;
	}
	
	// compare는 이미 써서 또 못쓰므로 comparator interface를 사용
	
	public List<AccountDto> getAccountListSortByUserSeq() {
		List<AccountDto> sortByUserSeqList = new ArrayList<AccountDto>(accountList);
		
		Collections.sort(sortByUserSeqList, new Comparator<AccountDto>() {
			
			@Override
			public int compare(AccountDto o1, AccountDto o2) {
				return (o1.getUserSeq() - o2.getUserSeq()) == 0 ? (o2.getBalance() - o1.getBalance()) : (o1.getUserSeq() - o2.getUserSeq());
			}
			
		});
		
		return sortByUserSeqList;
	}
	
	

}










