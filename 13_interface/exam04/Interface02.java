package exam04;

interface WithStatic {
	int get();

	static int getData() { // static 메소드
		// 인터페이스는 자기 자신의 객체를 만들 수 없지만 static 메소드를 사용할 수 있게 되면서
		// 인터페이스명.static메소드()를 사용하면 자식 객체를 만들지 않고도 원하는 기능을 구현할 수 있다
		// Test1 x = new Test1();
		return 100;
	}
}

public class Interface02 {
	public static void main(String[] args) {
		System.out.println(WithStatic.getData());
	}
}
