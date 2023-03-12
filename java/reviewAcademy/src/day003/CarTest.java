package day003;

public class CarTest {
	public static void main(String[] args) {
//		1. 객체 참조 변수 선언: stack 영역에 변수 선언
		Car car1;
		Car car2;

//		2. 객체 생성: heap 영역에 객체 생성, 주소를 변수가 참조
//		객체가 생성되면 멤버 변수들은 자동으로 초기화
//		정수: 0, 실수: 0.0, 논리: false, 참조: null
		car1 = new Car();
		car2 = new Car();

//		3. 객체 사용
		car1.model = "A모델";
		car1.color = "black";
		car1.price = 10000;

		System.out.println("** 값을 변경한 객체 car1 **");
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.price);
		System.out.println("** 기본 초기화 값인 객체 car2 **");
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.price);
		
		car1.go();
	}
}
