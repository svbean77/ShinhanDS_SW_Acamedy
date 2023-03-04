package ch02;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("x값 입력 >> ");
		String strX = sc.nextLine(); // nextLine()의 결과는 String
		int x = Integer.parseInt(strX);

		System.out.print("y값 입력 >> ");
		String strY = sc.nextLine();
		int y = Integer.parseInt(strY);

		int result = x + y;
		System.out.println("x + y = " + result);
		System.out.println();

		while (true) {
			System.out.print("입력 문자열 >> ");
			String data = sc.nextLine();

			if (data.equals("q"))
				break;
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}

		System.out.println("종료");
	}

}
