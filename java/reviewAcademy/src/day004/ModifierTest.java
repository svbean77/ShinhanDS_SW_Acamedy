package day004;

public class ModifierTest {

	public static void main(String[] args) {
		Phone phone = new Phone();
		System.out.println(phone);

		phone.model = "갤럭시S23";

		phone.f1();
		phone.f2();
		phone.f3();
//		phone.f4();
	}

}
