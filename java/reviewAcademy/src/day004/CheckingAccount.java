package day004;

// 자식 class는 부모 class의 private이 아닌 모든 멤버 사용 가능
public class CheckingAccount extends Account {
	String cardNo;

	CheckingAccount(String accNo, String owner, int balance, String cardNo) {
//		명시적으로 부모 생성자 호출 (명시적으로 호출하지 않으면 default 생성자 super() 호출
		super(accNo, owner, balance);
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) {
		if (this.cardNo.equals(cardNo)) {
			return withdraw(amount);
		} else {
			System.out.println("카드 번호가 옳지 않습니다.");
			return 0;
		}
	}

	void test() {
//		부모의 메소드 호출
		System.out.println(getAccNo());
		System.out.println(getOwner());
		System.out.println(getBalance());

		setAccNo("777");
		System.out.println(getAccNo());

		deposit(1);
		withdraw(2);
	}
}
