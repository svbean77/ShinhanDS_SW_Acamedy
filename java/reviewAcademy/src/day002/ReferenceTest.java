// 메모리 사용 영역, 문자열 변환
package day002;

import java.util.Arrays;

public class ReferenceTest {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();
	}

	private static void f4() {
		System.out.println("** 함수 f3 실행 **");

//		문자열 분리
		String subjects = "자바,DB,HTML CSS#JavaScript,React,Spring";
		String[] arr = subjects.split(",|#| "); // 분리할 구분자가 여러 개이면 |로 연결
		System.out.println(Arrays.toString(arr));

	}

	private static void f3() {
		System.out.println("** 함수 f3 실행 **");

//		문자열 추출, 대체, 찾기
		String subject = "이것이 자바다";
		for (int i = 0; i < subject.length(); i++) {
			System.out.print(subject.charAt(i) + " ");
			System.out.println(subject.substring(i, i + 1));
		}
		System.out.println();

		System.out.println(subject.replace("이", "@"));

		System.out.println(subject.indexOf("것"));

	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");

//		null
		String name = null; // stack에 변수가 생성되었지만 heap의 어떤 객체를 참조하는지는 없음
//		NullPointerException 발생
//		System.out.println(name.length());
		System.out.println(name);
	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

//		메모리 사용 영역
		int a = 10; // 기본형 -> stack 영역에 값 저장
		String s1 = "자바";
		String s2 = "자바";
		String s3 = new String("자바");
		String s4 = new String("자바");

//		문자열에서 == 연산자는 객체의 번지를 비교
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);

		s1 = s1 + "!";
		s2 = s2 + "!";
		System.out.println(s1 == s2); // 문자열 변경시 주소 달라짐

//		문자열의 내용을 비교하는 방법
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
	}

}
