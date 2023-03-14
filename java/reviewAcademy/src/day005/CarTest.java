package day005;

public class CarTest {
	void go(Tire tire) {
//		금호, 한국 타이어 둘 다 들어올 수 있어야 하기 때문에 부모 타입인 Tire를 사용
//		overriding 했기 때문에 각자의 roll이 호출 -> 다형성
		tire.roll();

		if (tire instanceof KumhoTire) {
			KumhoTire kum = (KumhoTire) tire;
			System.out.println(kum.intro);
			kum.method2();
		} else if (tire instanceof HankookTire han) {
			System.out.println(han.info);
			han.method1();
		}
	}
}
