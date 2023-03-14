package day005;

// 모든 메소드는 재정의 되는데 굳이 구현? -> 추상클래스로 사용!
// 추상 클래스: 추상 메소드가 존재할 수 있는 클래스
// new를 이용해 객체를 생성할 수 있다.
public abstract class Tire {
//	추상 메소드: 정의는 있고 구현{}은 없다. -> 상속받은 자식 클래스가 반드시 재정의해야 함
	public abstract void roll();

	void f1() {
		System.out.println("Tire의 method1");
	}

	void f2() {
		System.out.println("Tire의 method2");
	}
}
