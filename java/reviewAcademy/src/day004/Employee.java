package day004;

public class Employee {
	private String name;
	private String title;
	private int baseSalary;
	private int totalSalary;

	public Employee(String name, String title, int baseSalary) {
		super();
		this.name = name;
//		리터럴로 작성한 문자열을 수정했기 때문에 같은 문자열이였어도 주소가 달라짐 -> equals로 문자열의 내용을 비교해야 함
		this.title = title + "님";
		this.baseSalary = baseSalary;

		getTotalSalary();
	}

	public void getTotalSalary() {
		if (title.equals("부장님")) {
			totalSalary = (int) (baseSalary * 1.25);
		} else if (title.equals("과장님")) {
			totalSalary = (int) (baseSalary * 1.15);
		} else {
			totalSalary = (int) (baseSalary * 1.05);
		}
	}

	public void print() {
		System.out.println(title + "직급의 " + name + "씨의 본봉은 " + baseSalary + "원, 총 급여는 " + totalSalary);
	}
}
