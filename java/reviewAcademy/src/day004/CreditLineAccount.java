package day004;

public class CreditLineAccount extends Account {
	int creditLine;

	CreditLineAccount() {
		super();
	}

	public CreditLineAccount(String accNo, String owner, int balance, int creditLine) {
		super(accNo, owner, balance);
		this.creditLine = creditLine;
	}

//	overriding: 부모의 메소드를 재정의
//	이름, 매개변수, 리턴 타입 등 모든 signature가 같아야 함
//	@Override 어노테이션으로 오버라이드인지 확인 가능
	@Override
	public int withdraw(int amount) {
		int total = getBalance() + creditLine;

		if (amount > total) {
			System.out.println("잔고 부족");
			return 0;
		}
		setBalance(getBalance() - amount);
		return amount;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("입금.. override test");
//		부모의 원본 메소드 호출
		super.deposit(amount);
	}

	void test() {
		System.out.println(getAccNo());
		System.out.println(getBalance());
		System.out.println(getOwner());
		
		deposit(100);
		withdraw(100);
	}
}
