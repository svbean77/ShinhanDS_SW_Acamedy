package ch05;

public class ArrayCreateByValueListExample {

	public static void main(String[] args) {
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		
		season[1] = "여름";
		System.out.println(season[1]);
		
	}

}
