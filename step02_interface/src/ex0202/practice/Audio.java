package ex0202.practice;

public class Audio extends Elec implements ElecFunction {

	private int volumn;
	
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
	
	Audio() {}

	Audio(int volumn) {
		this.volumn = volumn;
	}

	Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getCode());
		builder.append("의 Audio를 ");
		builder.append(volumn);
		builder.append("으로 듣는다.");
		return builder.toString();
	}
	
	public int getVolumn() {
		return volumn;
	}

	public void setVolumn(int volumn) {
		this.volumn = volumn;
	}
	

}
