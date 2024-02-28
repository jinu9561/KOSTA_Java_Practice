package com.ws03.dto;

public class SavingAccountDto extends AccountDto {
	
	private int transferFree;

	public SavingAccountDto() {
		super();
	}

	public SavingAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, int transferFree) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.transferFree = transferFree;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", transferFree=");
		builder.append(transferFree);
		builder.append("]");
		return builder.toString();
	}

	public int getTransferFree() {
		return transferFree;
	}

	public void setTransferFree(int transferFree) {
		this.transferFree = transferFree;
	}
	
	
}
