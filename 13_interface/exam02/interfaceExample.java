package exam02;

interface Things {
//	public abstract void printInfo();
	void printInfo(); // 컴파일 시 자동으로 위 키워드(public abstract)가 붙는다
}

//1. 클래스가 인터페이스를 상속받는 방법
class ChildrenBook implements Things {
	// ChildrenBook 은 Things 인터페이스를 상속받는 구현 클래스
	private String title;
	private String author;

	public ChildrenBook() {
		super();
	}

	public ChildrenBook(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	@Override
	public void printInfo() {
		System.out.println("> 어린이 책 정보 <");
		System.out.println(title);
		System.out.println(author);
	}
}

//2. 인터페이스가 인터페이스를 상속받는 방법
interface Book extends Things {
// 인터페이스를 상속받는 클래스도 인터페이스가 되려면 
// implements가 아닌 extends 키워드로 상속 받는다
	void showTitle(); // abstract 가 붙어있는 건데 안 보이는 것
}

// Things 인터페이스를 상속받는 Book 인터페이스를 다시 상속받은 Book 클래스
class Books implements Book {
	// 인터페이스를 상속받은 인터페이스를 상속받은 클래스 (인터페이스>인터페이스>클래스)
	// 결국 부모와 조부모가 가지고 있는 추상메소드를 모두 구현하거나 혹은 본인도 추상클래스, 인터페이스가 되어야 한다
	@Override
	public void printInfo() {
		System.out.println("> 책 정보 <");
	}

	@Override
	public void showTitle() {
		System.out.println("> 책 제목 <");
	}

}

public class interfaceExample {
	public static void main(String[] args) {
		ChildrenBook childrenBook = new ChildrenBook("자바책", "이것이 자바다");
		childrenBook.printInfo();

		Books books = new Books();
		books.printInfo();
		books.showTitle();

	}

}
