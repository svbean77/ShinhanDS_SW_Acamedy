package day004;

public class BookExample {

	public static void main(String[] args) {
		System.out.println("책 생성 전 개수: " + BookVO.count);

		BookVO[] books = new BookVO[5];

		books[0] = new BookVO("Java Program", 30000);
		books[1] = new BookVO("JSP Program", 25000);
		books[2] = new BookVO("SQL", 20000);
		books[3] = new BookVO("JDBC Program", 32000);
		books[4] = new BookVO("EJB Program", 25000);

		System.out.println("책 생성 후 개수: " + BookVO.count);

//		final 값은 초기화 이후 변경 불가능
//		books[0].isbn = "123";
//		books[3].PUBLISHER = "한빛";

		System.out.println(books[0].isbn);
		System.out.println(BookVO.PUBLISHER);
	}

}
