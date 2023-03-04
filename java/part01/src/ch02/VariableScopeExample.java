package ch02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
//		범위를 벗어난 v2는 사용 불가이기 때문에 컴파일 에러
//		int v3 = v1 + v2 + 5;
	}

}
