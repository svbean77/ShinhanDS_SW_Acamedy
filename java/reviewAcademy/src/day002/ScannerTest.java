// 키보드 입력 -> Scanner
package day002;

// java.lang을 제외한 패키지는 import 해야 함
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		f1();
		f2();
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 >> ");
		int score = sc.nextInt();
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.print("메모 >> ");
//		sc.next()의 Enter에 대한 입력 날리기		
		sc.nextLine();
		String memo = sc.nextLine();

		System.out.println(name + " -> " + score);
		System.out.println("memo: " + memo);
	}

	private static void f1() throws IOException {
		System.out.println("** 함수 f1 실행 **");

//		InputStream 
		System.out.print("정수를 입력 >> ");
		InputStream is = System.in; // 1byte씩 읽음

		int i;
		while ((i = is.read()) != 13) {
//			종료코드(13)가 들어올 때 까지 반복			
			System.out.println((char) i);
		}
	}

}
