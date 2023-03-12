package day004;

public class MyServlet {
	private static MyServlet my;

	private MyServlet() {
		System.out.println("MyServlet 생성!");
	}

//	static인 이유: 객체 생성 없이도 접근할 수 있어야 함 + 함수를 통해서만 my에 접근
	public static MyServlet getInstance() {
		if (my == null) {
			my = new MyServlet();
		}
		return my;
	}

	public void print() {
		System.out.println("싱글톤 연습");
	}
}
