package day004;

public class CustomerShopping {

	public static void main(String[] args) {
		BookVO[] books = new BookVO[5];

		books[0] = new BookVO("Java Program", 30000);
		books[1] = new BookVO("JSP Program", 25000);
		books[2] = new BookVO("SQL", 20000);
		books[3] = new BookVO("JDBC Program", 32000);
		books[4] = new BookVO("EJB Program", 25000);

		BookService bm = new BookService(books);
		bm.printBookList();
		bm.printTotalPrice();
	}

}
