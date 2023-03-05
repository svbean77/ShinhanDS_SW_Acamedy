package day002;

public class 반복문 {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();
	}

	private static void f4() {
		System.out.println("** 함수 f2 실행 **");

//		제어문 흐름 제어 - continue
		int num = 1;
		int total = 0;

		for (; num <= 10; num++) {
			if (num % 2 != 0)
				continue;
			total += num;

			System.out.print(num);
			System.out.print(num == 10 ? " = " : " + ");
		}
		System.out.println(total);
	}

	private static void f3() {
		System.out.println("** 함수 f2 실행 **");

//		반복문 do-while
		int i = 100;
		do {
			System.out.println(i);
			i++;
		} while (i < 20);

		System.out.println("do while 문을 빠져나간 시점은 " + i);

		int j = 100;
		while (j < 20) {
			System.out.println(j);
		}
		System.out.println("while 문을 빠져나간 시점은 " + j);
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		반복문 while
		int i = 1;
		while (true) {
			if (i > 10)
				break;
			System.out.println(i);
			i++;
		}

		System.out.println("while 문을 빠져나간 시점은 " + i);
	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

//		반복문 for
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
