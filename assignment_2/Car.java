package Scanner;

public class Car {
	void speed() {
		System.out.println("The speed of the car are: ");
	}
}	

class Maruti extends Car{
	@Override
	void speed() {
		System.out.println("the speed of maruti car is: 60km/h ");
	}
	
}

class Alto extends Car{
	@Override
	void speed() {
		System.out.println("the speed of Alto car is: 70km/h ");
	}
}

class Brezza extends Car{
	@Override
	void speed() {
		System.out.println("the speed of Alto car is: 80km/h ");
	}
}

