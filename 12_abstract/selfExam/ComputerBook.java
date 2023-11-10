package selfExam;

public class ComputerBook extends Book {
	private int stock; // 재고

	public ComputerBook() {
		super();
	}

	public ComputerBook(int code, String title, int stock) {
		super(code, title);
		this.stock = stock;
	}

	@Override
	void info() {
		System.out.println("컴퓨터 서적 정보");
		System.out.println("============");
		System.out.println("code : " + getCode() + "\ntitle : " + getTitle() + "\nstock : " + this.stock);
	}

}