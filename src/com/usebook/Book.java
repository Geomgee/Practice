package com.usebook;

public class Book {
	int num = 0;
	String bookName = "";
	int price = 0;

	public Book() {
		System.out.println("생성자 함수 호출됨");
	}

	public void printBookInfo(String bookName, int price) {
		System.out.println("책의 이름은 " + bookName + "이고 가격은" + price + "원입니다.");
	}
}
