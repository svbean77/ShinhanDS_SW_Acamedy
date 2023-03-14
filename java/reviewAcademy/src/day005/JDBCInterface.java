package day005;

// interface: 규격서 (정의만 있고 구현은 없음) 
public interface JDBCInterface {
//	1. 상수
	public static final String JDBC = "JAVA Database Connection!";
	String JDBC2 = "Java database connection!"; // 상수만 가능하기 때문에 modifier 생략 가능

//	2. 추상 메소드
	public abstract void dbConnect(String dbName);

	void dbConnect2(String dbName); // 추상 메소드만 가능하기 때문에 modifier 생략 가능
}
