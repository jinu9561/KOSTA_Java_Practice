package ex0131.practiceEx.sample01;
class FullTime{

	
	private  int empNo, mgr, salary, bonus;
	private  String eName, job, hiredate, deptName;
	
	public FullTime() {}
	
	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int salary, int bonus) {
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.deptName = deptName;
		this.salary = salary;
		this.bonus = bonus;
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
		sb.append(" | ");
		sb.append(salary);
		sb.append(" | ");
		sb.append(bonus);

		
		return sb.toString();
//		String str = empNo + " | ";
//		str += eName + " | ";
//		str += job + " | ";
//		str += mgr + " | ";
//		str += hiredate + " | ";
//		str += deptName + " | ";
//		str += salary + " | ";
//		str += bonus;		
//		
//		return str;
	}
	
//	@Override
//	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("FullTime [empNo=");
//		builder.append(empNo);
//		builder.append(", mgr=");
//		builder.append(mgr);
//		builder.append(", salary=");
//		builder.append(salary);
//		builder.append(", bonus=");
//		builder.append(bonus);
//		builder.append(", eName=");
//		builder.append(eName);
//		builder.append(", job=");
//		builder.append(job);
//		builder.append(", hiredate=");
//		builder.append(hiredate);
//		builder.append(", deptName=");
//		builder.append(deptName);
//		builder.append("]");
//		return builder.toString();
//	}

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
	
	public void message() {
		System.out.println(this.eName + "사원은 정규직입니다.");
	}
	
	
}