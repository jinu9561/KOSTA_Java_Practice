package ex0206.exam;

public class Exam02Main {
	
	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<Tv, String>();
		
		p1.setKind(new Tv());
		p1.setModel("½º¸¶Æ® TV");
		
		System.out.println(p1.getModel());
		
		Tv tv = p1.getKind();
		
		System.out.println("-------------------------------");
		Product<Audio, String> p2 = new Product<>();
		
		p2.setKind(new Audio());
		
	}
	
}
