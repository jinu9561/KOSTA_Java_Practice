package ex0202.practice;

public class Tv extends Elec implements ElecFunction{
	
	private int chnnel;

	@Override
	public void start() {
		System.out.println(this.toString());
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void display() {
		
	}

	Tv(){}
	
	Tv(int chnnel) {
		this.chnnel = chnnel;
	}
	
	Tv(String code, int cost, int chnnel){
		super(code, cost);
		this.chnnel = chnnel;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getCode());
		builder.append("제품 TV를 ");
		builder.append(chnnel);
		builder.append("을 본다");
		return builder.toString();
	}
	
	public int getChnnel() {
		return chnnel;
	}
	
	public void setChnnel(int chnnel) {
		this.chnnel = chnnel;
	}

	
}
