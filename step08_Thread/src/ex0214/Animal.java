package ex0214;

//AnimalŬ���� �߻�ȭ
abstract class Animal {
	abstract void speak();
}
///////////////////////////////////////////////////////////////
class Cat extends Animal { // ���
	 void speak() {
	     System.out.println("�Ŀ�");
	 }
}
////////////////////////////////////////////////////////
class Dog extends Animal { // ���
	 void speak() {
	     System.out.println("�۸�");
	 }
}
////////////////////////////////////////////////////
class HelloAnimal {
	 void hello(Animal animal) {
	     animal.speak();
	 }
}

class Lion extends Animal {
    void speak() {
        System.out.println("����");
    }
}


