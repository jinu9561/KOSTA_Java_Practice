package com.ws03.dto;
/**
 *  고객의 정보를 관리할 객체 
 * */
public class UserDto {
   public int userSeq; // setUserSeq, getUserSeq
   public String name;
   public String email;
   public String phone;
   public boolean isSleep;//기본값 false -> private인 경우는 sleep이름으로 한다. 
   
   @Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("UserDto [userSeq=");
	builder.append(userSeq);
	builder.append(", name=");
	builder.append(name);
	builder.append(", email=");
	builder.append(email);
	builder.append(", phone=");
	builder.append(phone);
	builder.append(", isSleep=");
	builder.append(isSleep);
	builder.append("]");
	return builder.toString();
}
   
public  UserDto() {}
   public UserDto(int userSeq, String name, String email, String phone, boolean isSleep) {
	this.userSeq = userSeq;
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.isSleep = isSleep;
  }
}
