package selfExam;

public abstract class Book {
	// 추상 클래스
	private int code; // 책 코드
	private String title; // 책 코드

	// 추상 메소드
	abstract void info();

	public Book() {
		super();
	}

	public Book(int code, String title) {
		super();
		this.code = code;
		this.title = title;
	}

	// getter
	public int getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

}
