package Scanner;

public class Shape {
	void draw() {
		System.out.println("draw the shape:");
	}
}

class Traingle extends Shape{

	@Override
	void draw() {
		System.out.println("draw the shape of traingle");
	}
	
}

class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("draw the shape of Rectangle");
	}
}

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("draw the shape of Circle");
	}
}