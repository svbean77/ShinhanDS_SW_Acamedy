package day005;

import java.util.Arrays;

public class ExchangeStudent extends Student {
	String[] language;

	public ExchangeStudent(String stdId, String name, String[] language) {
//		부모의 default 생성자가 없을 때 해결법
//		1. 부모가 default 생성자를 만든다.
//		2. 자식이 명시적으로 생성자를 호출한다.
		super(stdId, name);

//		default 생성자를 호출한 경우
//		this.setStdId(stdId); // private이기 때문에 setter로 접근
//		this.name = name; // public이기 때문에 직접 접근
		this.language = language;
	}

	void display() {
		System.out.println(getClass().getSimpleName() + "에서 추가된 method");
	}

	@Override
	public String toString() {
		return "ExchangeStudent [language=" + Arrays.toString(language) + ", name=" + name + ", major=" + major
				+ ", score=" + score + ", schoolName=" + schoolName + "]";
	}

}
