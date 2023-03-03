// 문자열, 이스케이프 문자
package day001;

public class StringTest {

	public static void main(String[] args) {
		f1();
		f2();
	}

	private static void f2() {
		System.out.println("** 함수 f2 실행 **");
		
//		이스케이프 문자
		String str1 = "자바 '프로그램' 완성!";
		String str2 = "자바 \"프로그램\" 완성!";
		String str3 = "{\"name\": \"hong\", \"age\": 20}";
//		큰따옴표 3개를 묶어 사용하면 이스케이프 문자를 그대로 사용할 수 있다!
		String str4 = """
				{"name": "hong", "age": 20}
				""";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");
		
//		String class: java.base 모듈의 java.lang 패키지 내부에 존재
//		참조형
//		Stirng: 고정 문자열 -> 변할 수 없음!
		String s1 = "자바"; // 문자열을 리터럴로 작성하면 컴파일 시점에 heap의 상수풀에 들어감
		String s2 = "자바"; // 상수풀에 같은 문자열이 존재하기 때문에 s1과 주소가 같음
		String s3 = new String("자바"); // new로 생성하면 heap의 상수풀 외부 영역에 저장
		String s4 = new String("자바"); // new로 생성한 것이기 때문에 s3와 주소가 다름

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		s1 = s1 + "프로그램"; // String buffer에서 두 문자열을 합친 후 새로운 문자열로 변환
		s2 = s2 + "프로그램"; // 새로운 문자열이 생기는 것이기 때문에 메모리 낭비
		System.out.println(s1 == s2);
	}

}
