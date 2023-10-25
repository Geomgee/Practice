package classes;

class Block2 {
	String name;

	void method1() {
		System.out.println(staticName);
		System.out.println("함수 1이 동작한다.");
	}

	static String staticName;

	static void method2() {
		System.out.println("함수 2가 동작한다.");
	}

	Block2() {
		System.out.println("나는 생성자 함수이다");
	}

	{
		System.out.println("나는 non-static 블록이다");
	}
	static {
		System.out.println("*나는 static 블록이다*");
		System.out.println("static 블록의 특징은 자동으로 호출이 되면서 첫번째 인스턴스를 생성하기 바로 전에 딱 한번만 수행되는 블록이다!!!");
	}

	static void method3() {
		/* this.name = "김희선"; => 인스턴스멤버는 static 메소드 안에서 사용할 수 없다. */
		staticName = "김희선";
		method2();
		System.out.println(staticName + "은 배우이다.");
	}
}

public class Exam14_static {
	public static void main(String[] args) {
		Block2 b1 = new Block2();
		Block2 b2 = new Block2();

		System.out.println("==============================");
		b1.method1();
		Block2.method2(); // static키워드를 가진 메소드는 클래스명.메소드명으로 사용
		Block2.method3();
		// b1.method3(); // 위와 같은 방법으로 사용은 되지만, 권장하지 않고 경고 문구가 뜬다
		System.out.println("==============================");
		System.out.println(b1.staticName);
		System.out.println(b2.staticName);
		b1.method1();
		// static 필드는 어떤 메소드에서든지 공유가 가능하다
	}
}