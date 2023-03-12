package day003;

public class PersonTest {

	public static void main(String[] args) {
//		static method는 클래스가 공유하기 때문에 클래스명.메소드로 작성
//		static은 클래스 load시 메모리에 올라가기 때문에 객체 생성 전 사용 가능
		System.out.println("인구: " + Person.getPopulation());

		Person person1 = new Person();
		Person person2 = new Person(3, "철수");

		person1.selfIntroduce();
		person2.selfIntroduce();

//		객체.정적멤버로 사용할 수 있지만 클래스명.정적멤버로 사용하라는 경고 뜸
		int population = person1.getPopulation();
		System.out.println("전체 인구는 " + population + "명");

//		배열을 사용하면 객체 관리가 편함
		Person[] persons = new Person[3];
		persons[0] = new Person();
		persons[1] = new Person(30, "길동");
		persons[2] = new Person(20, "영희");

		for (Person person : persons) {
			person.selfIntroduce();
		}
	}

}
