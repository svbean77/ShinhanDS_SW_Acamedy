package ch06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();

		double result1 = myCalc.area(10);
		double result2 = myCalc.area(10, 20);

		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}

}
