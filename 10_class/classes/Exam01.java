package classes;

class Student { // 클래스 앞에 붙는 접근제한자는 default, public 두가지만 가능
	String name = "홍길동";
	static String id = "hong";
	int age = 25;

}

public class Exam01 { // public 접근제한자는 하나의 클래스에만 붙일 수 있고
						// 자기자신 파일명과 같은 이름을 가진 클래스에 public 접근 제한자를 붙일 수 있다.
						// public을 둘 다 가지지 않을 수도 있다.
	public static void main(String[] args) {
		// student 객체 생성을 하는데, student1 인스턴스를 하나 생성한다.
		Student student1 = new Student();
		System.out.println(student1.name);
		System.out.println(student1.id);
		// System.out.println(student.id); // static이 붙은 클래스 필드(전역 변수)는 클래스명.필드명으로 접근하는
		// 것을 권장한다.
		System.out.println(student1.age);

		student1.name = "happy";
		student1.age = 5;
		student1.id = "해피";

		System.out.println("==student1==");
		System.out.println(student1.name);
		System.out.println(student1.id);
		System.out.println(student1.age);

		Student student2 = new Student();
		System.out.println("============");
		System.out.println(student2.name);
		System.out.println(student2.id + ": static 키워드를 붙였기 때문에 이전에 변경한 부분이 reset되지 않고 덮어씌워진다");
		System.out.println(student2.age);

		student2.name = "funny";
		student2.age = 3;
		student2.id = "잼이";

		System.out.println("==student2==");
		System.out.println(student2.name);
		System.out.println(student2.id);
		System.out.println(student2.age);

		System.out.println(student1.name);
		System.out.println(student1.id + ": 마찬가지로 student1 을 불러왔지만 student2에서 덮어씌운 값 나옴");
		System.out.println(student1.age);

	}
}
