package day003;

public class EnumTest {
	static final double PI = 3.141592;
	static final int MONDAY = 1;
	static final int SUNDAY = 2;
	static final int SUCCESS = 2;
	
	public static void main(String[] args) {
		f1();
		f2(LoginEnum.SUCCESS);
		f3();
	}
	private static void f3() {
		System.out.println("** 함수 f3 실행 **");

//		Enum 예제 - WeekEnum
		WeekEnum[] weeks = WeekEnum.values();

		for (WeekEnum week : weeks) {
			System.out.println(week.ordinal() + "번째 요일: " + week.name());
			String weekName1 = f4(week);
			String weekName2 = f5(week);
			System.out.print("if - " + weekName1 + ", ");
			System.out.println("switch - " + weekName2);
		}
	}

	private static String f5(WeekEnum week) {
		String name;

//		switch 문은 타입이 정해졌기 때문에 열거타입.열거상수 형태로 작성하지 않는다.
		switch (week) { 
		case MONDAY:
			name = "월요일";
			break;
		case TUESDAY:
			name = "화요일";
			break;
		case WEDNESDAY:
			name = "수요일";
			break;
		case THURSDAY:
			name = "목요일";
			break;
		case FRIDAY:
			name = "금요일";
			break;
		case SATURDAY:
			name = "토요일";
			break;
		case SUNDAY:
			name = "일요일";
			break;
		default:
			name = "존재하지 않는 요일..";
			break;
		}
		return name;
	}

	private static String f4(WeekEnum week) {
		String name;

		if (week == WeekEnum.MONDAY)
			name = "월요일";
		else if (week == WeekEnum.TUESDAY)
			name = "화요일";
		else if (week == WeekEnum.WEDNESDAY)
			name = "수요일";
		else if (week == WeekEnum.THURSDAY)
			name = "목요일";
		else if (week == WeekEnum.FRIDAY)
			name = "금요일";
		else if (week == WeekEnum.SATURDAY)
			name = "토요일";
		else if (week == WeekEnum.SUNDAY)
			name = "일요일";
		else
			name = "존재하지 않는 요일..";
		return name;
	}

	private static void f2(LoginEnum login) {
		System.out.println("** 함수 f2 실행 **");

//		Enum 예제 - LoginEnum
		System.out.println(login == LoginEnum.SUCCESS);
		System.out.println(login == LoginEnum.FAIL);

		System.out.println("LoginEnum의 값들");
		LoginEnum[] arr = LoginEnum.values();
		for (LoginEnum item : arr) {
			System.out.println(item.ordinal() + ": " + item.name());
		}
	}

	private static void f1() {
		System.out.println("** 함수 f1 실행 **");

//		Enum을 사용하지 않은 경우
		System.out.println(PI);
//		상수는 고정값이기 때문에 임의로 변경할 수 없다.
//		PI = 3.14;

		int input = 2;
		System.out.println(input == SUNDAY); // 관련 있는 변수끼리 묶지 않아 전혀 다른 상수와 비교
	}
}
