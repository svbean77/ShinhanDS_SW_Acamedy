package day005;

public class Student {
//	1. field (instance, static)
//	public, protected, default, private: 접근 권한 -> 1개 적용
//	static, final: 활용 방법 -> 0개 이상 적용

//	instance field
	private String stdId; // 같은 class 내에서만 접근 가능
	public String name; // 모든 패키지에서 접근 가능
	String major; // 같은 패키지에서 접근 가능
	protected int score; // 같은 패키지와 상속 받은 class에서 접근 가능
	final String schoolName = "신한금융대학교"; // 초기화 1회 (선언시, 생성시)

//	static field
	public static final String NATION = "대한민국"; // static final: 상수
	public static int count;

//	2. 생성자
	Student() {
		this(null, null, null, 0);
	}

	Student(String stdId, String name) {
		this(stdId, name, null, 0);
	}

	Student(String stdId, String name, String major) {
		this(stdId, name, major, 0);
	}

	public Student(String stdId, String name, String major, int score) {
		this.stdId = stdId;
		this.name = name;
		this.major = major;
		this.score = score;
		count++;
	}

//	3. method
	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Student.count = count;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public static String getNation() {
		return NATION;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", major=" + major + ", score=" + score + ", schoolName="
				+ schoolName + "]";
	}

}
