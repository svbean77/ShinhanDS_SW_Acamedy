package ch05;

public class GarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		hobby = null; // "여행" 객체를 쓰레기로 만듦

		String kind1 = "자동차";
		String kind2 = kind1;
		kind1 = null; // "자동차" 객체는 kind2가 참조하기 때문에 쓰레기가 아님
		System.out.println("kind2: " + kind2);
	}

}
