package day004;

// public: 모든 패키지에서 접근 가능
// protected: 같은 패키지이거나, 자식 객체만 접근 가능
// default: 같은 패키지에서만 접근 가능
// private: 같은 클래스에서만 접근 가능

// 클래스
// public > default
public class Phone {
//	필드
//	public > protected > default > private
	protected String model;

//	생성자
//	public > protected > default > private
	public Phone() {
		System.out.println("public 생성자 정의");
	}

//	메소드
//	public > protected > default > private
	public void f1() {
		System.out.println("public method");
	}

	protected void f2() {
		System.out.println("protected method");
	}

	void f3() {
		System.out.println("default method");
	}

	private void f4() {
		System.out.println("private method");
	}
}
