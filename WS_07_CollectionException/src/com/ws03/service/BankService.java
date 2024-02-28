package com.ws03.service;

import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;
import com.ws03.exceptionDto.BalanceLackException;
import com.ws03.exceptionDto.UserAccountNotFoundException;

public interface BankService {
	
	public List<AccountDto> getAccountList(int userSeq);
	
	public UserDto getUserDetail(int userSeq);
	
	public List<AccountDto> getAccountList();
	
	public List<AccountDto> getAccountListSortByBalance();
	
	public List<AccountDto> getAccountListSortByUserSeq();
	
	public int withdraw(int userSeq, int accountSeq, int withdraw) throws BalanceLackException, UserAccountNotFoundException;

	public AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;
}
