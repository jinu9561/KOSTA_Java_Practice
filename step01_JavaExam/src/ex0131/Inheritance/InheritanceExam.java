package ex0131.Inheritance;

class Car {
		public String carname;
		public int cost;
		
		protected void printAttributes(){
			System.out.println("carname="+carname+"\tcost="+cost);
		}
}

//Car�� ��ӹ޴� EfSonata, Excel, Carnival 3�� Ŭ���� �ۼ�	
	//�� Ŭ������ �μ��� �����ʴ� ������ �ۼ�
	//�� Ŭ������ �������� �����ο��� carname�� cost�� ������ �� �Ҵ�
	
class EfSonata extends Car{
	public EfSonata() {
		this.carname = "ef�ҳ�Ÿ";
		this.cost = 5000;
	}
	
}
class Excel extends Car{
	public Excel() {
		this.carname = "����";
		this.cost = 3000;
	}
	
}
class Carnival extends Car{
	public Carnival() {
		this.carname = "ī�Ϲ�";
		this.cost = 6000;
	}
}
	

public class InheritanceExam{
	//���θ޼ҵ忡�� 
	public static void main(String[] args) {
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Carnival ca = new Carnival();
		
		car.printAttributes();
		ef.printAttributes();
		ex.printAttributes();
		ca.printAttributes();
		
		
	}
	
		//Car, EfSonata, Excel, Canival �װ��� ��ü�� ����
		// �� Ŭ�������� Car calss���ִ� printAttributes()�޼ҵ带 ȣ���Ҽ��ִ�.
		
	
}

