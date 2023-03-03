// 데이터 타입
package day001;

public class VariableTest2 {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
	}

	private static void f3() {
		System.out.println("** 함수 f3 실행 **");

//		정수
		short v1 = 32767;
		char v2 = 'a';
		int ve = Integer.MAX_VALUE;
		long v4 = 2147483648L; // long 타입임을 알리기 위해 l or L을 적어야 함

//		실수
		float v5 = 3.14f; // float 타입임을 알리기 위해 f or F를 적어야 함
		double v6 = 3.14;

		char v7 = 65; // 10진수
		char v8 = 0x0031; // 16진수
		System.out.println(++v7);
		System.out.println(v8);

//		논리
		boolean result;
		result = 10 > 20; // false
		System.out.println(result);
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		자바의 데이터 타입
//		정수 (byte(1), short(2), char(2), int(4), long(8))
//		실수 (float(4), double(8))
//		논리 (boolean(1)): true, false

	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

		int a;
		System.out.println(a = 10);
		System.out.println(a == 10);
	}

}
