package classes;

class Book {
	String title; // 책제목
	static String author; // 저자
	int ISBN; // 책의 고유번호

	public Book(String title, String author, int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.printf("첫번째 생성자 호출! %s, %s, %d\n", title, author, ISBN);
	}

	public Book(String title, int ISBN) {
		this.title = title;
		this.ISBN = ISBN;
		System.out.printf("두번째 생성자 호출! %s, %d\n", title, ISBN);
	}

	public Book() {
		this("자바탈출", 5555); // 객체 자신의 또 다른 생성자를 호출할 때 사용한다
		// this("자바탈출", "더 잘지음", 5555); =>생성자 함수 안에서 또 다른 생성자 함수를 호출하려면 this 생성자 함수를
		// 사용하여야 하고 this 생성자 함수는 생성자 함수 안에서 맨 앞에 한 번만 호출 가능하다
		System.out.printf("세번째 생성자 호출! %s, %s, %d\n", title, author, ISBN);

	}
}

public class Exam09_this {
	public static void main(String[] args) {
		Book javaBook = new Book("자바책", "잘지음", 1111);
		System.out.println("==================================");

		Book theBible = new Book("성경책", 2222);
		System.out.println("==================================");

		Book emptyBook = new Book();
	}
}
