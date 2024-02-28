package ex0214;

//AnimalÅ¬·¡½º Ãß»óÈ­
abstract class Animal {
	abstract void speak();
}
///////////////////////////////////////////////////////////////
class Cat extends Animal { // »ó¼Ó
	 void speak() {
	     System.out.println("³Ä¿Ë");
	 }
}
////////////////////////////////////////////////////////
class Dog extends Animal { // »ó¼Ó
	 void speak() {
	     System.out.println("¸Û¸Û");
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
        System.out.println("¾îÈï");
    }
}


