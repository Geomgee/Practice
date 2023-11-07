package selfExam;

public class AbstractExample {
	public static void main(String[] args) {
		Book comBook = new ComputerBook();

		comBook.info();
		comBook.setCode(1111);
		System.out.println(comBook.getCode());
		comBook.setTitle("java");
		System.out.println(comBook.getCode());
		comBook.stock(10);
		System.out.println();

		Book engBook = new EnglishBook();

		engBook.info();
		engBook.setCode(3333);
		System.out.println(engBook.getCode());
		engBook.setTitle("토플");
		engBook.publishedYear(2022);

	}
}
