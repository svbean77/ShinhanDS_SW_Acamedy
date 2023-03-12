package day003;

public class Person {
	private static int numberOfPersons;
	private int age;
	private String name;

	Person() {
		this(12, "Anonumous");
	}

	Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPersons++;
	}

	public void selfIntroduce() {
		System.out.println("내 이름은 " + name + "이고 나이는 " + age + "살 입니다.");
	}

	public static int getPopulation() {
		return numberOfPersons;
	}
}
