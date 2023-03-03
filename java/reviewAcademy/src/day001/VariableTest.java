// 변수
package day001;

// .java 파일(소스 파일)을 컴파일하면 .class 파일(바이트코드 파일)이 생성
public class VariableTest {
	int score;

	public static void main(String[] args) {
//		1. 변수 선언
		int a; // 지역 변수
//		System.out.println(a); // 지역 변수는 초기화하지 않으면 사용 불가
//		System.out.println(score); // 변수 생성 시기가 다름 (static은 non-static 그냥은 사용 불가)

//		2. 변수 사용
		a = 10; // 할당
		System.out.println(a); // 읽기
		System.out.println(a + 20);

//		3. 선언 + 사용
		int b = 30;
		System.out.println(b);
	}

}
