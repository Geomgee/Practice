package selfExam;

public class EnglishBook extends Book {
	String name = "영어관련";

	@Override
	void info() {
		System.out.println(name + " 서적 정보");
	}

	@Override
	void publishedYear(int year) {
		System.out.println("publishedYear : " + year);
	}

	@Override
	void stock(int stock) {
	};
}
