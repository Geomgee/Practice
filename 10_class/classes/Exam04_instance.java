package classes;

class Character {
	String name;
	int age;

}

public class Exam04_instance {
	public static void main(String[] args) {
		Character d = new Character();
		d.name = "둘리";
		d.age = 10;

		Character h = new Character();
		h.name = "희동이";
		h.age = 3;

		System.out.println("이름 : " + d.name + ", 나이 : " + d.age);
		System.out.println("이름 : " + h.name + ", 나이 : " + h.age);
	}
}
