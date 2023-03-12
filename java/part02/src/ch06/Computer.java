package ch06;

public class Computer {
	int sum(int... values) {
		int sum = 0;

		for (int num : values) {
			sum += num;
		}

		return sum;
	}
}
