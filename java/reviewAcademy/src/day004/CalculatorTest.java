package day004;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator.powerOn();

		Calculator[] calculators = new Calculator[3];
		calculators[0] = new Calculator("red");
		calculators[1] = new Calculator("A모델", "orange");
		calculators[2] = new Calculator("B모델", "green", 10000);

		for (Calculator calc : calculators) {
			print(calc);
		}
	}

	private static void print(Calculator calc) {
		System.out.println("** 계산기 정보 **");
		System.out.println("model: " + calc.getModel());
		System.out.println("color: " + calc.getColor());
		System.out.println("price: " + calc.getPrice());

		System.out.println("add: " + calc.add(1, 3));
		System.out.println("sub: " + calc.sub(1, 3));
		calc.powerOff();
	}

}
