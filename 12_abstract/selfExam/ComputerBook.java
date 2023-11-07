package selfExam;

public class ComputerBook extends Book {
	String name = "컴퓨터";

	@Override
	void info() {
		System.out.println(name + " 서적 정보");
		System.out.println("===============");
	}

	@Override
	void stock(int stock) {
		System.out.println("stock : " + stock);
	}

	@Override
	void publishedYear(int year) {
	};
}
