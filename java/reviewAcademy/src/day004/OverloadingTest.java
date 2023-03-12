package day004;

public class OverloadingTest {

	public static void main(String[] args) {
//		매개변수가 int인 함수가 없기 때문에 자동으로 double로 형 변환
		sum(1, 2);
		sum(1.0, 2.0);

//		main()은 static이지만 해당 sum()은 non-static -> 자신 객체 생성 후 메소드 호출해야 함
		new OverloadingTest().sum(1, 2, 3);

//		일치하는 유형이 없으면 가변길이 함수로 이동
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		sum(1, 3, 5, 7, 9);
		sum();
	}

//	가변길이 매개변수
	static void sum(int... arr) {
		int total = 0;

		for (int num : arr) {
			total += num;
		}

		if (total == 0) {
			System.out.println("숫자의 합이 0입니다.");
//			return;은 값을 반환한 것이 아닌 함수를 중단하고 호출한 곳으로 돌아간다는 의미
			return;
		}

		System.out.println("가변길이 매개변수 함수의 합: " + total);
	}

	void sum(int a, int b, int c) {
		System.out.println("int 매개변수 3개 함수의 합: " + (a + b + c));
	}

	static void sum(double a, double b) {
		System.out.println("double 매개변수 2개 함수의 합: " + (a + b));
	}

}
