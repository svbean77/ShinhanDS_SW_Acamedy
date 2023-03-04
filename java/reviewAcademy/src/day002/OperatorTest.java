// 연산자
package day002;

public class OperatorTest {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();
		f5();
		f6();
		f7();
	}

	private static void f7() {
		System.out.println("** 함수 f7 실행 **");

//		삼항 연산자, 연산자 우선 순위
		int a = 70;
		System.out.println(a >= 70 ? "합격!" : "불합격..");

		String result = a >= 80 ? "80 이상이다" : "80 미만이다";
		System.out.println(result);

		System.out.println(a + 20 > 10 && a <= 20);
	}

	private static void f6() {
		System.out.println("** 함수 f6 실행 **");

//		대입 연산자
		int a = 10;
		a += 1; // a = a + 1;
		System.out.println(a);
	}

	private static void f5() {
		System.out.println("** 함수 f5 실행 **");

//		비교 연산자
		int a = 10;
		int b = 20;
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(!(a == b));
	}

	private static void f4() {
		System.out.println("** 함수 f4 실행 **");

//		논리 연산자: |, ||
		int a = 10;
		int b = 20;
		boolean result1 = a >= 10 || ++b == 20;
		System.out.println("result1: " + result1);
		System.out.println("b = " + b); // ++b 연산이 수행되지 않음

		int c = 10;
		int d = 20;
		boolean result2 = c >= 10 | ++d == 20;
		System.out.println("result2: " + result2);
		System.out.println("d = " + d); // ++d 연산이 수행됨
	}

	private static void f3() {
		System.out.println("** 함수 f3 실행 **");

//		논리 연산자: &, &&
		int a = 10;
		int b = 20;
		boolean result1 = a > 10 && ++b == 20;
		System.out.println("result1: " + result1);
		System.out.println("b = " + b); // ++b 연산이 수행되지 않음

		int c = 10;
		int d = 20;
		boolean result2 = c > 10 & ++d == 20;
		System.out.println("result2: " + result2);
		System.out.println("d = " + d); // ++d 연산이 수행됨
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		NaN과 Infinity
		int a = 10;
		double b = 0.0; // 정수 0으로는 나눌 수 없다.

		if (Double.isInfinite(a / b))
			System.out.println("무한대..");
		else
			System.out.println(a / b);

		if (Double.isNaN(a % b))
			System.out.println("NaN이야..");
		else
			System.out.println(a % b);

	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

//		증감 연산자, 산술 연산자
		int a = 10;
		int b = 5;

		System.out.println(++a); // 증가 후 사용: 11
		System.out.println(a++); // 사용 후 증가: 11
		System.out.println(a); // 12

		System.out.println("덧셈: " + (a + b));
		System.out.println("뺄셈: " + (a - b));
		System.out.println("곱셈: " + (a * b));
		System.out.println("몫: " + (a / b));
		System.out.println("나머지: " + (a % b));
	}

}
