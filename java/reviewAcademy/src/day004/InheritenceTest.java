package day004;

public class InheritenceTest {

	public static void main(String[] args) {
		Child ch = new Child();

		System.out.println(ch.a);
		System.out.println(ch.b);

		ch.f1();
		ch.f2();
	}

}

class Parent {
	int a = 10;

	Parent() {
		System.out.println("Parent 생성자 실행");
	}

	void f1() {
		System.out.println("부모의 f1");
	}

	void f2() {
		System.out.println("부모의 f2");
	}
}

class Child extends Parent {
//	자신과 부모에게 같은 이름의 변수 존재 -> 자신의 변수로 사용 (없으면 부모에게 올라가는 것)
	String a = "Java";
	int b = 20;

	Child() {
		System.out.println("Child 생성자 실행");
	}

	void f1() {
		super.f1();
		System.out.println("자식의 f1");
	}

	void f2() {
		System.out.println("자식의 f2");
	}
}