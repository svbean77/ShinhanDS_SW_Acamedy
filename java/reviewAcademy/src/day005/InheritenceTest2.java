package day005;

public class InheritenceTest2 {

	public static void main(String[] args) {
//		f1();
//		f2();
//		f3();
//		f4();
		f5();
	}

	private static void f5() {
//		7장 확인문제 9번
		D v1 = new D();
		B v2 = new D();
		A v3 = new D();

		System.out.println(v1.max);
//		부모에서 자식 멤버에게 접근할 수 없음 -> 강제 형 변환 필요
//		System.out.println(v2.max);
		System.out.println("B의 강제 형 변환: " + ((D) v2).max);
//		System.out.println(v3.max);
		System.out.println("A의 강제 형 변환: " + ((D) v3).max);

//		실행시 에러 -> 잘못된 캐스팅 (원래의 자식으로 변환이 가능한 것)
//		E v4 = (E) v2;
		B v5 = (B) v3;

		System.out.println(v3 instanceof D);
//		false이기 때문에 형 변환 불가
		System.out.println(v3 instanceof E);
		System.out.println(v3 instanceof B);

		if (v3 instanceof D d) {
			System.out.println(d.max);
		}
	}

	private static void f4() {
		CarTest car = new CarTest();

		car.go(new HankookTire());
		car.go(new KumhoTire());
	}

	private static void f3() {
		Cat c = new Cat();
		Dog d = new Dog();

//		자식을 부모 타입에 담는 이유 -> 공통 모듈을 생성하기 위해 매개변수를 부모 타입으로 사용
		call(c);
		call(d);
	}

	private static void call(Animal animal) {
		animal.method1();

//		다형성: 실행 방법은 같지만 결과가 다름
		if (animal instanceof Cat) {
			Cat c = (Cat) animal;
			c.method2();
			System.out.println(c.b);
		} else if (animal instanceof Dog d) {
			d.method3();
			System.out.println(d.c);
		}
	}

	private static void f2() {
		Animal c = new Cat();

//		field, method는 타입을 따름 -> 부모의 멤버만 사용 가능
		System.out.println(c.a);
//		System.out.println(c.b);
		c.method1();
//		c.method2();
	}

	private static void f1() {
		Cat c = new Cat();

//		자신의 멤버, 부모의 멤버 사용 가능
		System.out.println(c.a);
		System.out.println(c.b);
		c.method1();
		c.method2();
	}

}

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
	int max = 100;
}

class E extends B {
}

class F extends C {
}
