package ch06;

public class Car3 {
	int speed;

	void run() {
		System.out.println(speed + "의 속도로 달리기");
	}

	static void simulate() {
//		static에서 non-static을 사용하기 위해 객체 생성
		Car3 myCar = new Car3();
		myCar.speed = 200;
		myCar.run();
	}

	public static void main(String[] args) {
		simulate();

		Car3 myCar = new Car3();
		myCar.speed = 60;
		myCar.run();
	}
}
