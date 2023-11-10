package selfExam;

public class AbstractExample {
	public static void main(String[] args) {

		Book bookList[] = { new ComputerBook(1111, "java", 10), new ComputerBook(2222, "jsp", 20),
				new EnglishBook(3333, "토플", 2002), new ComputerBook(4444, "python", 20),
				new EnglishBook(5555, "토익", 2022), };

		for (Book bk : bookList) {
			bk.info();
			System.out.println();
		}

	}
}
