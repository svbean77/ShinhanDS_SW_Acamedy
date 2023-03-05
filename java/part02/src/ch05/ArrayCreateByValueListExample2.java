package ch05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		scores = new int[] { 83, 90, 87 };

		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}

		printItem(new int[] { 83, 90, 87 });
	}

	public static void printItem(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}

}
