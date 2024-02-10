package ex0206.exam06;

public class Applicant<T> {
	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}
	
}
