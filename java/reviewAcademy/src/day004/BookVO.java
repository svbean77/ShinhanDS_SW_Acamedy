package day004;

// VO(Value Object): 데이터를 저장하는 가방 (데이터에 대한 정보만 존재)
// DTO(Data Transfer Object): 데이터를 저장해서 전송하는 목적
public class BookVO {
	private String title;
	private int price;
//	final: 수정 불가 -> 생성할 때 초기화(선언 or 생성자)
	final String isbn = "12345";

	static int count;
//	상수는 선언 시 초기화, 관례상 대문자로 작성
	static final String PUBLISHER = "신한DS";

	BookVO(String title, int price) {
		this.title = title;
		this.price = price;
		count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + ", isbn=" + isbn + "]";
	}

}
