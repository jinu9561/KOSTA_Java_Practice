package ex0214;


public class Main {
	 public static void main(String[] args) {
	     HelloAnimal hello = new HelloAnimal();
	
	     Animal cat = new Cat();
	     Animal dog = new Dog();
	
	     hello.hello(cat); // �Ŀ�
	     hello.hello(dog); // �۸�
	 }
}