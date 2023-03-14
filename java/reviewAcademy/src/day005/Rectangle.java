package day005;

public class Rectangle extends Shape {
	double height;
	double length;

	Rectangle(String color, double length, double height) {
		super(color, "Rectangle");
		this.length = length;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return length * height;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (length + height);
	}
}
