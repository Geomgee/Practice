package bankRefactoring;

public class Account {
//	Scanner sc = new Scanner(System.in);

	private String acNum; // 계좌번호
	private String name; // 계좌주
	private int balance; // 잔고

	// getter , setter
	public String getAcNum() {
		return acNum;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccountNum(String acNum) {
		this.acNum = acNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// 매개변수가 있는 생성자 함수
	public Account(String acNum, String name, int balance) {
		super();
		this.acNum = acNum;
		this.name = name;
		this.balance = balance;
	}

	// toString
	@Override
	public String toString() {
		return acNum + "\t" + name + "\t" + balance + "\n";
	}

}
