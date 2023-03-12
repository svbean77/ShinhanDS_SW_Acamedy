package day003;

public class Computer {
//	JavaBeans 기술 규격서: 데이터는 외부에서 접근할 수 없도록 정보 은닉을 한다. -> field는 private으로 선언
//	instance field: 객체마다 생성되는 데이터
	private String model;
	private String os;
	private int price;
//	static field: 클래스가 공유하는 데이터
	static int count;

//	생성자 오버로딩시 같은 기능의 코드를 반복 작성하게 됨 -> 기능이 작은 쪽에서 큰 쪽의 생성자를 호출
//	생성자는 여러 개 존재하지만 로직은 매개 변수가 가장 많은 생성자에만 존재 -> 코드 수정이 용이
	public Computer() {
		this("기본생성자", "os1", 10000);
	}

	public Computer(String model) {
		this(model, null, 0);
	}

	public Computer(String os, int price) {
		this("arg2생성자", os, price);
	}

	public Computer(String model, String os, int price) {
		count++;
		System.out.println("** " + count + "번째 컴퓨터 생성 **");
		this.model = model;
		this.os = os;
		this.price = price;
	}

	public void computerInfoPrint() {
		System.out.println("model: " + model);
		System.out.println("os: " + os);
		System.out.println("price: " + price);
	}

//	private으로 정보를 은닉했기 때문에 데이터를 다룰 수 있는 함수 제공 = Getter, Setter
	public String getModel() {
		return model;
	}

	public String getOs() {
		return os;
	}

	public int getPrice() {
		return price;
	}
}
