package classes;

import com.usebook.Book;

public class Exam19_package {
	public static void main(String[] args) {
		// com.usebook.Book book = new com.usebook.Book();
		Book book = new Book();
		book.printBookInfo("코딩은 반복이다", 20000);
		book.printBookInfo("메롱", 20000);
	}

}
