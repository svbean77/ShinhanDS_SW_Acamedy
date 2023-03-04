package ch04;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("점수가 90점보다 높다.");
			System.out.println("등급은 A이다.");
		}

		if (score < 90)
			System.out.println("점수가 90점보다 낮다.");
		System.out.println("등급은 B이다."); // 중괄호로 묶지 않았기 때문에 항상 실행

	}

}
