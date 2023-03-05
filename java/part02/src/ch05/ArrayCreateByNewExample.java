package ch05;

import java.util.Arrays;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		System.out.println(Arrays.toString(arr1));

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		System.out.println(Arrays.toString(arr1));
		System.out.println();

		double[] arr2 = new double[3];
		System.out.println(Arrays.toString(arr2));

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;

		System.out.println(Arrays.toString(arr2));
		System.out.println();

		String[] arr3 = new String[3];
		System.out.println(Arrays.toString(arr3));

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";

		System.out.println(Arrays.toString(arr3));
	}

}
