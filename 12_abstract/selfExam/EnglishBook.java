package selfExam;

public class EnglishBook extends Book {
	private int publishedYear; // 발행연도

	public EnglishBook() {
		super();
	}

	public EnglishBook(int code, String title, int publishedYear) {
		super(code, title);
		this.publishedYear = publishedYear;
	}

	@Override
	void info() {
		System.out.println("영어 관련 서적 정보");
		System.out.println("==============");
		System.out.println("code : " + getCode() + "\ntitle : " + getTitle() + "\nstock : " + this.publishedYear);
	}
}