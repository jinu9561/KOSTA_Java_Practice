package ex0131.instanceofEx;

//�������ºκ��� �ּ�ó���ϰ� ������ �Ẹ����!
class Car{} 
class EfSonata extends Car{}
class Excel extends Car{}
class Canival extends Car{}
class People{}

public class InstanceofExam{
	public static void main(String args []){
		
		Car car = new Car();
		EfSonata ef = new EfSonata();
		Excel ex = new Excel();
		Canival ca = new Canival();
		People p = new People();		
		
		if(car instanceof Car){ // car �� Car Ÿ���� �ɼ��ֳ� -> true
			System.out.println("car instanceof Car is true"); 
		}else{
			System.out.println("car instanceof Car is false"); 
		}

		
		if(car instanceof EfSonata){ // car�� EfSonata Ÿ���� �ɼ��ֳ� -> false
			System.out.println("car instanceof EfSonata is true");
		}else{
			System.out.println("car instanceof EfSonata is false");
		}
		
		if(ef instanceof Car){ // true
			System.out.println("ef instanceof Car is true");
		}else{
			System.out.println("ef instanceof Car is false");
		}
		
		if(ex instanceof Car){ // true
			System.out.println("ex instanceof Car is true");
		}else{
			System.out.println("ex instanceof Car is false");
		}
		
		if(ca instanceof Car){ // true
			System.out.println("ca instanceof Car is true");
		}else{
			System.out.println("ca instanceof Car is false");
		}
		
		/*
		 * if(p instanceof Car){  // instanceof �����ڴ� ��Ӱ����϶� ����Ҽ� �ִ�. -> �ƿ� ���Ұ�
			System.out.println("p instanceof Car is true");
		} */
	}
}	
