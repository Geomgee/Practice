package classes;

public class Member {

	String name;
	String id;
	String password;
	int age;

	Member() {
	}

	Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	void explain() {
		System.out.println("이름 : " + name + " id : " + id + " password : " + password + " age :" + age);
	}

}
