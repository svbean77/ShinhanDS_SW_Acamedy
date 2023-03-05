package ch05;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		int[][] scores = { { 80, 90, 96 }, { 76, 88 } };

		System.out.println("1차원 배열 길이: " + scores.length);
		System.out.println("2차원 배열 길이 - 1: " + scores[0].length);
		System.out.println("2차원 배열 길이 - 2: " + scores[1].length);

		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length;
			for (int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}

		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균: " + totalAvg);
	}

}
