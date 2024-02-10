package ex0129.array;

/*
 * 학생의 속성을 관리하는 객체
 *  : Value Object = DTO(Data Transfer Object) = Domain
*/

public class Student {
	// private이라 다른 클래스에서 수정 불가
	private String name;
	private int age;
	private String addr;
	
	/* setter getter를 제공해야 한다. */
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age>18)
			this.age = age;
		else System.out.println("애들은 가라!");
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getAddr() {
		return this.addr;
	}
	
	public void getAll() {
		
	}

}
