package com.ws03.dto;
/**
 *  고객의 정보를 관리할 객체 
 * */
public class UserDto {
   public int userSeq;
   public String  name, email, phone;
   public boolean isSleep;
   
   public UserDto() {}
   
   public UserDto(int userSeq, String name, String email, String phone, boolean isSleep) {
	   this.userSeq = userSeq;
	   this.name = name;
	   this.email = email;
	   this.phone = phone;
	   this.isSleep = isSleep;
   }
   
}
