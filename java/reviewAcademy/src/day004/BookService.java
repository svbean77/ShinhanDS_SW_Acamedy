package day004;

// Service: business logic 구현 (업무 로직이 구현된 곳)
public class BookService {
	BookVO[] booklist;

	public BookService(BookVO[] booklist) {
		this.booklist = booklist;
	}

	public void printBookList() {
		System.out.println("** 책 목록 **");
		for (BookVO book : booklist) {
			System.out.println(book.getTitle());
			System.out.println(book);
		}
	}

	public void printTotalPrice() {
		int total = 0;
		for (BookVO book : booklist) {
			total += book.getPrice();
		}

		System.out.println("전체 책 가격의 합: " + total);
	}
}
