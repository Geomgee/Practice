package selfExam;

public abstract class Book {
	public int info;
	private int code;
	private String title;
	public int stock;

	// 기본 메소드
	public Book() {
		super();
	}

	abstract void info();

	abstract void stock(int stock);

	abstract void publishedYear(int year);

	public int getCode() {
		return code;
	}

	public String getTitle() {
		return title;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}