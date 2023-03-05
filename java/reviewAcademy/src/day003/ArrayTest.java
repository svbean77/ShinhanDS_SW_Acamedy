// 배열, 명령행 매개변수
package day003;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();
		f5();
		f6();

//		명령행 매개변수
		System.out.println(Arrays.toString(args));
		if (args.length < 2) {
//			방법1: main 함수 빠져나가기
//			return;

//			방법2: 프로그램 강제 종료
			System.exit(0);
		}

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a + " + " + b + " = " + (a + b));
	}

	private static void f6() {
		System.out.println("** 함수 f6 실행 **");

//		배열 복사
		int[] arr1 = new int[] { 100, 90, 80, 70, 60 };
		int[] arr2 = new int[10];
		int[] arr3 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		System.arraycopy(arr1, 0, arr3, 3, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

	private static void f5() {
		System.out.println("** 함수 f5 실행 **");

//		배열 선언 + 생성
		int[] arr1 = new int[5]; // 기본값으로 초기화
		int[] arr2 = new int[] { 10, 20, 30, 40, 50 };
		int[] arr3 = { 10, 20, 30, 40, 50 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println("--------------------");

		int[][] arr4 = new int[][] { { 10, 20, 30 }, { 40, 50, 60, 70, 80 } };
		for (int[] row : arr4) {
			System.out.println(Arrays.toString(row));
		}
	}

	private static void f4() {
		System.out.println("** 함수 f4 실행 **");

//		열이 초기화되지 않은 2차원 배열
		int[][] arr;
		arr = new int[3][]; // 열의 길이가 다를 수 있기 때문에 미리 초기화하지 않는 경우도 있음

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d행%d열 = %d, ", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}

	private static void f3() {
		System.out.println("** 함수 f3 실행 **");

//		다차원 배열
		int[][] arr1;
		int[] arr2[];
		int arr3[][];

		arr1 = new int[3][4];
		arr2 = new int[3][];

		System.out.println(arr1[0][0]);
		System.out.println(arr2[0]);

		for (int[] row : arr1) {
			for (int num : row) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		향상된 for 문
		int[] scores;
		scores = new int[20];
		scores[0] = 100;
		scores[1] = 90;
		scores[2] = 80;

		int total = 0;

		for (int score : scores) {
			System.out.print(score + " ");
			total += score;
		}
		System.out.println();
		System.out.println("점수 합은 " + total);
	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

//		일반 배열
//		1. 배열 변수 선언
		int[] arr1 = null;
		double[] arr2;
		boolean[] arr3;
		String[] arr4;

//		2. 배열 생성: 배열의 길이가 필수
//		배열 생성시 자동으로 초기화 (정수: 0, 실수: 0.0, 논리: false, 객체: null)
		arr1 = new int[5];
		arr2 = new double[6];
		arr3 = new boolean[6];
		arr4 = new String[4];

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}

}
