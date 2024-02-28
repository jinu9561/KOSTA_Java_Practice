package ex0131.practiceEx.sample02;

public abstract class Employee {
	
	private int empNo, mgr;
	private String eName, job, hiredate, deptName;
	
	public Employee() {}
	
	public Employee(int empNo, String eName, String job, int mgr, String hiredate, String deptName) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(empNo);
		sb.append(" | ");
		sb.append(eName);
		sb.append(" | ");
		sb.append(job);
		sb.append(" | ");
		sb.append(mgr);
		sb.append(" | ");
		sb.append(hiredate);
		sb.append(" | ");
		sb.append(deptName);
		return sb.toString();
	}
	
	public abstract void message();

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	
}
