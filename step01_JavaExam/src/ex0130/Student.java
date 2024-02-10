package ex0130;

/*
 * �л��� �Ӽ��� �����ϴ� ��ü
 *  : Value Object = DTO(Data Transfer Object) = Domain
*/

public class Student {
	// private�̶� �ٸ� Ŭ�������� ���� �Ұ�
	private String name;
	private int age;
	private String addr;
	
	/* setter getter�� �����ؾ� �Ѵ�. */
	
//-----------------������------------------------------------------------------------------
	
	public Student() {
		
	}
	
	public Student(String name, int age, String addr) {
		this(name, addr);
		this.age = age;
		
	}
	
	public Student(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	
//----------------------------------------------------------------------------------------	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
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
