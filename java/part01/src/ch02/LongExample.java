package ch02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		// long var3 = 100000000000000; // int로 간주하기 때문에 컴파일 에러 발생
		long var4 = 100000000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);

	}

}
