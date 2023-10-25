package classes;

import com.usebook.Book2;

public class Exam20_accessModifier {
	public static void main(String[] args) {
		Book2 bk = new Book2(); // public 접근 제한자를 가진 생성자 함수
		// Book2 bk1 = new Book2(1588); // private 접근 제한자를 가진 생성자 함수
		// Book2 bk2 = new Book2(1588, "자바정복"); // protected 접근 제한자를 가진 생성자 함수
		// Book2 bk3 = new Book2(1588, "자바정복", 30000); // default 접근 제한자를 가진 생성자 함수

		System.out.println(
				"다른 패키지 안에 있는 객체의 생성자 함수를 호출할 때 생성자 함수의 접근 제한자가 public인 경우에만 객체 생성이 가능하고 \n같은 클래스 안의 다양한 접근 제한자를 가진 생성자 함수는 private 를 포함하여 모두 객체 생성이 가능하다.");
	}
}
