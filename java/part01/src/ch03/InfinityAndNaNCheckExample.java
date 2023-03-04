package ch03;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0;
		double z1 = x / y;
		double z2 = x % y;

		System.out.println("x / y = " + z1);
		System.out.println("x % y = " + z2);

		if (Double.isInfinite(z1) || Double.isNaN(z2))
			System.out.println("값 산출 불가");
		else {
			System.out.println(z1 + 10);
			System.out.println(z2 + 10);
		}
	}

}
