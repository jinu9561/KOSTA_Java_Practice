package com.ws03.service;

import java.util.List;

import com.ws03.dto.AccountDto;
import com.ws03.dto.UserDto;

public interface Bankservice {
	
	public List<AccountDto> getAccountList(int userSeq);
	
	public UserDto getUserDetail(int userSeq);
	
	public List<AccountDto> getAccountList();
	
	public List<AccountDto> getAccountListSortByBalance();
	
	public List<AccountDto> getAccountListSortByUserSeq();
}
