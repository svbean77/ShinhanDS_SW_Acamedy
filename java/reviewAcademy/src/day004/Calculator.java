package day004;

public class Calculator {
//	필드
	private String color;
	private String model = "기본모델";
	private int price;
	static String company = "신한DS";

//	생성자
	Calculator(String color) {
		this(null, color, 0);
	}

	Calculator(String model, String color) {
		this(model, color, 0);
	}

	Calculator(String model, String color, int price) {
		this.model = model;
		this.color = color;
		this.price = price;
	}

//	일반 메소드
	static public void powerOn() {
		System.out.println(company + " 회사의 계산기 전원 ON!");
//		System.out.println(model + ", " + color + ", " + price); // static 영역에서 non-static 멤버를 사용할 수 없다.
	}

	public void powerOff() {
		System.out.println("전원 off!");
	}

	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) {
		return x - y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getCompany() {
		return company;
	}

//	블록
	{
		System.out.println("** instance block **");
	}

	static {
		System.out.println("** static block **");
	}

//	중첩 클래스
	class AA {
	}
}
