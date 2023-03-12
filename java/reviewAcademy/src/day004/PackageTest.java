package day004;

public class PackageTest {

	public static void main(String[] args) {
//		같은 이름의 클래스를 사용하고 싶다면 패키지 이름을 명시해야 함
		java.util.Date d1 = new java.util.Date();
		System.out.println(d1);
		
		java.sql.Date d2 = new java.sql.Date(d1.getTime());
		System.out.println(d2);
	}

}
