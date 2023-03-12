package day003;

public class Student {
	String name;
	String stdId;
	String subject;
	int score;

//	기본 생성자를 사용하는 경우 값을 사용자가 넣어야 하기 때문에 정보 은닉 측면에서 좋지 않음 -> 매개변수 있는 생성자 사용
	Student() {
		System.out.println("기본 생성자에 의해 만들어진 Student 객체");
	}

//	생성자 오버로딩
	Student(String name, String stdId, String subject, int score) {
//		멤버 변수와 매개 변수의 이름이 충돌 -> 현재 객체를 this로 표현함으로써 구분
		this.name = name;
		this.stdId = stdId;
		this.subject = subject;
		this.score = score;
		System.out.println("매개변수 있는 생성자에 의해 만들어진 Student 객체");
	}

	void study() {
		System.out.println("학생이 공부한다!");
	}

	{
		System.out.println("instance 학생 생성!");
	}

	static {
		System.out.println("static 클래스 로드 완료!");
	}

//	inner class
	class Phone {

	}
}
