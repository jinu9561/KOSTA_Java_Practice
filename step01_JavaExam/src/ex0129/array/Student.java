package ex0129.array;

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
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age>18)
			this.age = age;
		else System.out.println("�ֵ��� ����!");
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
