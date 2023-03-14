package ch07;

public class childExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // 자동 타입 변환

		parent.method1();
//		오버라이딩된 메소드 호출
		parent.method2();
//		자식의 메소드 접근 불가
//		parent.method3();
	}

}
