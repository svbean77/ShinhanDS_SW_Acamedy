package day003;

public class ComputerTest {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		System.out.println(com1.getModel());
		com1.computerInfoPrint();

		Computer com2 = new Computer("멋진모델");
		com2.computerInfoPrint();

		Computer com3 = new Computer("윈도우", 100000);
		com3.computerInfoPrint();

		Computer com4 = new Computer("좋은모델", "Windows", 500000);
		com4.computerInfoPrint();

//		static 변수는 클래스가 공유하는 변수이기 때문에 클래스명.변수로 사용
		System.out.println("지금까지 생성된 컴퓨터의 개수는 " + Computer.count);

		display(com1);
		display(com2);
		display(com3);
		display(com4);
	}

	private static void display(Computer com) {
		System.out.println("-------------------------");
		System.out.println(com.getModel() + "의 정보");
		com.computerInfoPrint();
		System.out.println("-------------------------");
	}
}
