package ch03;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);

		byte b = 100;
		int y = -b; // 연산시 int로 변환되기 때문에 int 타입 변수에 저장
		System.out.println("y: " + y);
	}

}
