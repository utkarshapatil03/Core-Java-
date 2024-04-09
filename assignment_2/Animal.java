package Scanner;


public class Animal {
	void makeSound() {
		System.out.println("Animal Sound");
	}

}

class Cat extends Animal {


	@Override
	void makeSound() {
		System.out.println("meow");
	}
    
}

class Dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("woof");
	}
}
	 
	