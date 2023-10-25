package classes;

class Person {
	static int count = 10;
	String name;

	Person() { // 기본생성자 함수에 데이터를 덮어쓰기 => 메소드의 오버라이딩
		System.out.println(count);
		count++;
		System.out.println(count);
		System.out.println("--------------------");
	}

	static void printCount() {
		System.out.println("count : " + count);
	}
}

public class Exam12_static {
	public static void main(String[] args) {
		System.out.println(Person.count); // 클래스명.클래스변수명으로 사용
		System.out.println("====================");
		Person.printCount();

		System.out.println("********************");
		Person p1 = new Person();
		p1.printCount();
		Person p2 = new Person();
		p2.printCount();
	}
}