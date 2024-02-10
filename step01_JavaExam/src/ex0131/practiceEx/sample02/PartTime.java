package ex0131.practiceEx.sample02;

public class PartTime extends Employee{
	private int timePay; // �������� FullTime Ŭ�������� ��ӹ޾Ƽ� ���
	
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
		System.out.println(geteName() + "����� ���������Դϴ�.");
	}

	public int getTimePay() {
		return timePay;
	}

	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	
	
}
