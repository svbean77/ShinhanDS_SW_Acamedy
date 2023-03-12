package day004;

public class SingletonTest {

	public static void main(String[] args) {
		MyServlet a = MyServlet.getInstance();
		MyServlet b = MyServlet.getInstance();
//		생성자의 접근 제한자가 private이기 때문에 new로 생성 불가능
//		MyServlet c = new MyServlet();

		System.out.println(a == b); // 하나의 객체만 생성하기 때문에 동일 객체
		a.print();
	}

}
