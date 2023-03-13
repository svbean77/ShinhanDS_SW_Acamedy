package day005;

// 다른 패키지의 클래스를 사용하기 때문에 import
import day005.protectedClass.Machine;

public class ProtectedTest extends Machine {
	public ProtectedTest(int a) {
		super(a);
	}

	void test() {
//		추상 클래스는 객체 생성 불가능 (new Machine())
//		Machine m = new Machine();
	}

	void test2() {
		System.out.println(a); // public
		System.out.println(b); // protected
//		System.out.println(c); // default
//		System.out.println(d); // private

		f1(); // public
		f2(); // protected
//		f3(); // default
//		f4(); // private
	}

	protected void f2() {
		System.out.println("재정의!");
	}

	public void work() {
	}
}
