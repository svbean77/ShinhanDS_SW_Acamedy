package ch06;

public class Car2Example {

	public static void main(String[] args) {
		Car2 car1 = new Car2("자가용");
		System.out.println("회사: " + car1.company);
		System.out.println("모델: " + car1.model);
		System.out.println();

		Car2 car2 = new Car2("자가용", "빨강");
		System.out.println("회사: " + car2.company);
		System.out.println("모델: " + car2.model);
		System.out.println("색상: " + car2.color);
		System.out.println();

		Car2 car3 = new Car2("택시", "검정", 200);
		System.out.println("회사: " + car3.company);
		System.out.println("모델: " + car3.model);
		System.out.println("색상: " + car3.color);
		System.out.println("속도: " + car3.maxSpeed);
	}

}
