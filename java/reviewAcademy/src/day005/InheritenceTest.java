package day005;

public class InheritenceTest {

	public static void main(String[] args) {
		f1();
//		f2();
		f3();
	}

	private static void f3() {
//		상속 형 변환: 부모를 통해 자식을 본다 -> 부모의 멤버만 호출 가능
		Parent ch = new Child();
//		b는 자식의 필드이기 때문에 부모 타입에서 접근 불가
		System.out.println(ch.a);
		ch.method1();
//		method2는 자식의 메소드이기 때문에 부모 타입에서 접근 불가
//		ch.method2();
		ch.method3();
	}

	private static void f2() {
		Child ch = new Child();
		System.out.println(ch.a + " " + ch.b);
		ch.method1();
		ch.method2();
		ch.method3();
	}

	private static void f1() {

	}

}

class Parent {
//	자식 객체에 a가 없으면 부모의 a를 사용
	int a = 10;

	Parent() {
		System.out.println("부모의 생성자");
	}

	void method1() {
		System.out.println("부모의 method1");
	}

	void method3() {
		System.out.println("부모의 method3");
	}
}

class Child extends Parent {
	int b = 20;

	Child() {
		System.out.println("자식의 생성자");
	}

	void method3() {
		System.out.println("자식의 method3");
	}

	void method3(String str) {
		System.out.println(str + ": 자식의 method3");
	}

	void method2() {
		System.out.println("자식의 method2");
	}
}