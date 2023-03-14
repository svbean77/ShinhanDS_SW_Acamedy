package day005;

public class KumhoTire extends Tire {
	String intro = "최고~~";

//	부모의 추상 메소드는 반드시 재정의해야 함!
//	나 또한 누군가의 부모이면 자신을 추상으로 만들고 구현을 미룰 수 있음
	public void roll() {
		System.out.println("금호 타이어가 굴러간다");
	}

	void method2() {
		System.out.println("금호 타이어만 가지고 있는 method2");
	}
}
