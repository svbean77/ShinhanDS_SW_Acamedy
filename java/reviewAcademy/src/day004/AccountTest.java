package day004;

public class AccountTest {

	public static void main(String[] args) {
//		f1();
		f2();
	}

	private static void f2() {
		CreditLineAccount acc = new CreditLineAccount("123-456", "김철수", 1000, 800);

		acc.deposit(2000);
		int amount = acc.withdraw(100);

		System.out.println(amount + "원이 출금");
		System.out.println("잔액은 " + acc.getBalance());
	}

	private static void f1() {
		CheckingAccount acc = new CheckingAccount("123-123", "김철수", 1000, "12345");

		acc.deposit(200);
		int amount = acc.pay("12345", 100);
		int amount2 = acc.pay("1234567", 100);

		System.out.println(amount + "원이 출금");
		System.out.println(amount2 + "원이 출금");
		System.out.println("잔액은 " + acc.getBalance());

		acc.test();
	}

}
