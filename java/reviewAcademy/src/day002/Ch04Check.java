package day002;

import java.util.Scanner;

public class Ch04Check {

	public static void main(String[] args) {
//		num1();
//		num2();
//		num3();
//		num4();
//		num5();
//		num6();
		num7();
	}

	private static void num7() {
//		7번
		Scanner sc = new Scanner(System.in);
		int select;
		int balance = 0;
		boolean loop = true;

		while (loop) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");

			System.out.print("선택 >> ");
			select = sc.nextInt();

			int money;
			switch (select) {
			case 1:
				System.out.print("예금액 >> ");
				money = sc.nextInt();
				if (money < 1) {
					System.out.println("1 이상의 금액을 예금해주세요.");
				} else {
					balance += money;
				}
				break;
			case 2:
				System.out.print("출금액 >> ");
				money = sc.nextInt();
				if (money < 1) {
					System.out.println("1 이상의 금액을 출금해주세요.");
				} else if (money > balance) {
					System.out.println("잔고 부족으로 출금할 수 없습니다.");
				} else {
					balance -= money;
				}
				break;
			case 3:
				System.out.println("잔고 >> " + balance);
				break;
			case 4:
				loop = false;
				break;
			default:
				System.out.println("번호를 다시 선택해주세요.");
			}
		}

		System.out.println("프로그램 종료");
	}

	private static void num6() {
//		6번
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void num5() {
//		5번
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}

	private static void num4() {
//		4번
		while (true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;

			System.out.println("주사위 눈: " + num1 + ", " + num2);
			if (num1 + num2 == 5) {
				System.out.println("종료!");
				break;
			}
		}
	}

	private static void num3() {
//		3번
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}

		System.out.println("3의 배수 총합 = " + sum);
	}

	private static void num2() {
//		2번
		String grade = "B";
		int score1 = switch (grade) {
		case "A" -> 100;
		case "B" -> {
			int result = 100 - 20;
			yield result;
		}
		default -> 60;
		};

		System.out.println(grade + "등급의 점수는 " + score1);
	}

	private static void num1() {
//		1번
//		2. switch 문에서 사용할 수 있는 변수의 타입은 int, double이 될 수 있다.
	}

}
