package ex0131.practiceEx.sample02;

public class FullTime extends Employee {
	private int salary, bonus;
	
	public FullTime() {}
	
	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
		
		super(empNo, eName, job, mgr, hiredate, deptName);
		
		this.salary = salary;
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" | ");
		sb.append(bonus);
		return sb.toString();
	}

	@Override
	public void message() {
		System.out.println(geteName() + "����� �������Դϴ�.");
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}
