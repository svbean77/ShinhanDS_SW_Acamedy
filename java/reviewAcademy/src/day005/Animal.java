package day005;

// sealed를 이용해 상속받을 자식을 제한
public sealed class Animal permits Cat, Dog {
	int a = 10;

	void method1() {
		System.out.println("Animal의 method1");
	}
}
