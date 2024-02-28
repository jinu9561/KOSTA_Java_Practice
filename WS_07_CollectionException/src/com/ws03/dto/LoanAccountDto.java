package com.ws03.dto;

public class LoanAccountDto extends AccountDto {
	private String mortgage;

	public LoanAccountDto() {
		super();
	}

	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage) {
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortgage = mortgage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", mortgage=");
		builder.append(mortgage);
		builder.append("]");
		return builder.toString();
	}

	public String getMortgage() {
		return mortgage;
	}

	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}
	
	
}
