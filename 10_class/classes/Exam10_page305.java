package classes;

class Member2 {
	String name, id;

	Member2() {
	}

	Member2(String name, String id) {
		this.name = name;
		this.id = id;
		System.out.println("name:" + name + " id:" + id);
	}
}

public class Exam10_page305 {
	public static void main(String[] args) {
		Member2 user1 = new Member2("홍길동", "hong");
	}
}