package day002;

public class ReviewDay001 {

	public static void main(String[] args) {
		System.out.println("main 함수 시작!");

		f1();

		System.out.println("main 함수 끝!");
	}

	private static void f1() {
		System.out.println("** 함수 f1 시작 **");

//		기본 데이터 타입: byte, short, char, int, long (정수), float, double (실수), boolean (논리)
//		목적: 값의 저장, 연산, 비교 -> Wrapper class를 이용하면 추가로 기능 사용 가능
//		1. 자동 형 변환
		byte v1 = 100;
		int v2 = v1;

//		2. 강제 형 변환
		v1 = (byte) v2;

//		3. 문자열 변환
		String str = "100";
		int v3 = Integer.parseInt(str);
		System.out.println(v3 + 300);

	}

}
