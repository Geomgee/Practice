package com.usebook;

public class Book2 {
	int num = 0;
	String bookName = "";
	int price = 0;

	public Book2() {
		System.out.println("생성자 함수 호출됨");
	}

	private Book2(int num) {
		System.out.println("책번호 : " + num);
	}

	protected Book2(int num, String bookName) {
		System.out.println("책번호 : " + num + "번이고, 책이름은 " + bookName + " 입니다.");
	}

	Book2(int num, String bookName, int price) {
		System.out.println("책번호 : " + num + "번이고, 책이름은 " + bookName + " 이고, 책 가격은" + price + "원 입니다.");
	}

	public void printBookInfo(String bookName, int price) {
		System.out.println("책의 이름은 " + bookName + "이고 가격은" + price + "원입니다.");
	}

	public static void main(String[] args) {
		Book2 bk = new Book2(); // public 접근 제한자를 가진 생성자 함수
		Book2 bk1 = new Book2(1588); // private 접근 제한자를 가진 생성자 함수
		Book2 bk2 = new Book2(1588, "자바정복"); // protected 접근 제한자를 가진 생성자 함수
		Book2 bk3 = new Book2(1588, "자바정복", 30000); // default 접근 제한자를 가진 생성자 함수
	}
}
