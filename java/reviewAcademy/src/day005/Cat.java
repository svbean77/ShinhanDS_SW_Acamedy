package day005;

// sealed로 상속받은 자식은 final, non-sealed or sealed로 다른 클래스 봉인
public non-sealed class Cat extends Animal {
	int b = 20;

	void method2() {
		System.out.println("Cat의 method2");
	}
}
