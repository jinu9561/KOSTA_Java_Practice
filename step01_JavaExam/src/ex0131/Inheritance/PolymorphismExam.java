package ex0131.Inheritance;

class CarCenter{
	public void engineer(Car cd){
		System.out.print(cd.carname+" �����Ϸ�!\t");
		System.out.println("û�����"+cd.cost+" ��");
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {
		
		CarCenter cc = new CarCenter();
		EfSonata ef = new EfSonata();
		Carnival ca = new Carnival();
		Excel ex = new Excel();
		
		Car c = new Car();
		
		cc.engineer(c);//
		cc.engineer(ef);//
		cc.engineer(ca);//
		cc.engineer(ex);//
		
		
	
	}
}