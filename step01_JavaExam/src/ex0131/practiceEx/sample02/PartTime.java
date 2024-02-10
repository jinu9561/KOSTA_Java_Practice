package ex0131.practiceEx.sample02;

public class PartTime extends Employee{
	private int timePay; // 나머지는 FullTime 클래스에서 상속받아서 사용
	
	public PartTime() {}
	
	public PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
		
		super(empNo, eName, job, mgr, hiredate, deptName);
		
		this.timePay = timePay;
	}
	
	@Override
	public String toString() {;
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" | ");
		sb.append(timePay);
		return sb.toString();
	}
	
	
	@Override
	public void message() {
		System.out.println(geteName() + "사원은 비정규직입니다.");
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	
	
}
