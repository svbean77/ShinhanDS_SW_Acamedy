package day002;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
	}

	private static void f3() {
		System.out.println("** 함수 f3 실행 **");

//		조건문 switch
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력 >> ");
		int month = sc.nextInt();
		String message = "";

		if (month == 12 || month == 1 || month == 2) {
			message = "겨울이다";
		} else if (month == 3 || month == 4 || month == 5) {
			message = "봄이다";
		} else if (month == 6 || month == 7 || month == 8) {
			message = "여름이다";
		} else if (month == 9 || month == 10 || month == 11) {
			message = "가을이다";
		} else {
			message = "존재하지 않는 월입니다.";
		}

		System.out.println("if의 " + message);

		switch (month) {
		case 12, 1, 2: // 17 버전부터 case 묶기 가능
			message = "겨울이다";
			break;
		case 3, 4, 5:
			message = "봄이다";
			break;
		case 6, 7, 8:
			message = "여름이다";
			break;
		case 9, 10, 11:
			message = "가을이다";
			break;
		default:
			message = "존재하지 않는 월";
			break;
		}

		System.out.println("switch의 " + message);
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		조건문 switch
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = sc.nextInt();
		String grade;

		switch (score / 10) {
		case 10: // case 9와 결과가 같기 때문에 break를 넣지 않음
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		default:
			grade = "C";
			break;

		}
		System.out.println("결과는 " + score + " -> " + grade);
	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

//		조건문 if
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = sc.nextInt();
		String grade;

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("결과는 " + score + "점 -> " + grade);
	}

}
