// 변수의 형변환, 변수의 범위
package day001;

public class VariableTest3 {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();
		f5();
		f6();

	}

	private static void f6() {
		System.out.println("** 함수 f6 실행 **");
		
//		형식 문자열
		int a = 10;
		float b = 20.123f;
		System.out.println("a = " + a + ", b = " + b);
		System.out.printf("a = %-10d, b = %.5f", a, b);

	}

	private static void f5() {
		System.out.println("** 함수 f5 실행 **");

//		변수의 scope
		int a = 100;
		{
			int b = 200;
			System.out.println(a + b);
		}
//		b는 블록을 벗어났기 때문에 사용 불가
//		System.out.println(a + b);
	}

	private static void f4() {
		System.out.println("** 함수 f4 실행 **");

//		Wrapper class: 가본 타입에 기능을 추가
//		Byte, Short, Character, Integer, Long, Float, Double, Boolean
		String score = "90";
		System.out.println(score + 10); // 문자열 + 숫자 = 문자열
		System.out.println(Integer.parseInt(score) + 10); // 문자열을 기본 타입으로 변환

		int num = 1000;
		System.out.println(String.valueOf(num) + 10); // 기본 타입을 문자열로 변환
	}

	private static void f3() {
		System.out.println("** 함수 f3 실행 **");

//		연산식에서의 자동 형변환
		byte v1 = 100;
		byte v2 = 100;
//		byte v3 = v1 + v2; // 연산식에서 byte는 자동으로 int로 변환된다.
		byte v3 = (byte) (v1 + v2); // 허용 범위를 넘어 값 손실
		int v4 = v1 + v2;

		System.out.println(v3);
		System.out.println(v4);
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		강제 형변환: 작은 방 = 큰 방 -> 데이터 손실 가능성
		byte v1;
		int v3 = 128;
		v1 = (byte) v3;
		System.out.println("원본 v3: " + v3);
//		byte의 범위는 -128~127, 범위를 넘어 데이터 손실 발생
		System.out.println("형변환 v1: " + v1);

	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

//		자동 형변환: 큰 방 = 작은 방
//		byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		byte v1 = 127;
		short v2 = v1;
//		char v3 = v1; // char는 음수가 존재하지 않기 때문에 자동 형변환 불가
		int v3 = v1;
		long v4 = v1;
		float v5 = v1;
		double v6 = v1;

		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		System.out.println(v6);
	}

}
