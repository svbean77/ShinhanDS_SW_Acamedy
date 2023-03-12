package day003;

public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student("홍길동", "1234", "자바", 70);

		student1.name = "김철수";
		student1.stdId = "5678";
		student1.subject = "WEB";
		student1.score = 90;

		display(student1);
		display(student2);
	}

	private static void display(Student std) {
		System.out.println("-----------------");
		System.out.println(std.name);
		System.out.println(std.stdId);
		System.out.println(std.subject);
		System.out.println(std.score);
	}

}
