package day002;

import java.util.Scanner;

public class Ch04LAB1 {

	public static void main(String[] args) {
//		num1();
//		num2();
//		num3();
//		num4();
		num5();
	}

	private static void num5() {
//		5번
		Scanner sc = new Scanner(System.in);

		System.out.print("줄 수 >> ");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void num4() {
//		4번
		hokeyGraphics('$', 4, true);
		hokeyGraphics('*', 3, false);
	}

	public static void hokeyGraphics(char cell, int size, boolean isRect) {
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= (isRect ? size : i); j++) {
				System.out.print((char) cell);
			}
			System.out.println();
		}
	}

	private static void num3() {
//		3번
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력 >> ");
		int num = sc.nextInt();
		int sum = 0;

		if (num % 2 == 0) {
			for (int i = 0; i <= num; i += 2) {
				sum += i;
			}
		} else {
			for (int i = 1; i <= num; i += 2) {
				sum += i;
			}
		}
		System.out.println("결과값: " + sum);
	}

	private static void num2() {
//		2번
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열을 입력 >> ");
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(0, i + 1).toUpperCase());
		}

		sc.close();
	}

	private static void num1() {
//		1번
		Scanner sc = new Scanner(System.in);

		System.out.print("초기값을 정수로 입력 >> ");
		int start = sc.nextInt();
		System.out.print("마지막 값을 정수로 입력 >> ");
		int end = sc.nextInt();
		System.out.print("증가분을 정수로 입력 >> ");
		int add = sc.nextInt();
		int sum = 0;

		for (int i = start; i <= end; i += add) {
			sum += i;
		}

		if (sum > 1000) {
			sum += 2000;
		}
		System.out.println("총합은 " + sum + "입니다");
	}

}
