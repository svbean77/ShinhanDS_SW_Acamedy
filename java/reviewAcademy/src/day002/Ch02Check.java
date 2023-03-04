// 2장 확인문제
package day002;

public class Ch02Check {

	public static void main(String[] args) {
		multipleChoice();
		num11();
	}

	private static void num11() {
		// 11번
		int v1 = 1;
		System.out.println("v1: " + v1);
		if (true) {
			int v2 = 2;
			if (true) {
				int v3 = 2;
				System.out.println("v1: " + v1);
				System.out.println("v2: " + v2);
				System.out.println("v3: " + v3);
			}
			System.out.println("v1: " + v1);
			System.out.println("v2: " + v2);
//			System.out.println("v3: " + v3);
		}
		System.out.println("v1: " + v1);
//		System.out.println("v2: " + v2);
	}

	private static void multipleChoice() {
//		1번
//		4. 변수는 초기값이 저장되지 않은 상태에서 읽을 수 있다.

//		2번
//		2, 3, 6, 7

//		3번
//		byte, short, char, int, long / float, double / boolean

//		4번
//		int, age, 10 / double, price, 3.14

//		5번
//		3. short shortValue = charValue;

//		6번
//		4. char var = (char) strValue;

//		7번
//		3. char var3 = '';

//		8번
//		3. System.out.printf("형식", 변수)는 주어진 형식대로 변수값을 바꾼다.

//		9번
//		1. byte result = byteValue + byteValue;

//		10번
//		2. int var2 = Int.parseInt(str);
	}

}
