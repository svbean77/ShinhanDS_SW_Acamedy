package day003;

public class Car {
//	1. field
	String model;
	String color;
	int price;
	
//	2. constructor
//	정의하지 않으면 컴파일시 자동으로 .class에 default 생성자 만들어짐
//	return에 대한 정의가 없어야 함
	Car() {
		System.out.println("Car의 기본 생성자");
	}
	
//	3. 일반 method
	void go () {
		System.out.println("자동차가 간다.");
	}
	
//	4. block (instance block, static block)
//	instance block: 객체 생성시마다 실행
	{
		System.out.println("instance block.. 객체 생성시마다 실행");
	}
//	static block: 클래스 load시 실행
	static {
		System.out.println("static block.. class load시 실행");
	}
	
//	5. inner class
}
