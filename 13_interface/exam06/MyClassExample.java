package exam06;

public class MyClassExample {
	public static void main(String[] args) {
		System.out.println("---1) 인터페이스가 필드 타입으로 사용될 경우 : 필드에 구현 객체를 대입할 수 있다");
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn(); // 객체명.필드명(객체).메소드명();
		mc1.rc.turnOff();
		mc1.ad.turnOn();
		mc1.ad.turnOff();

		System.out.println("---2) 인터페이스가 생성자의 매개변수 타입으로 사용될 경우 : 필드에 구현 객체를 대입할 수 있다");
		MyClass mc2 = new MyClass(new Audio());

		System.out.println("---3) 인터페이스가 로컬 변수 타입으로 사용될 경우 : 변수에 구현 객체를 대입할 수 있다");
		MyClass mc3 = new MyClass();
		mc3.methodA();

		System.out.println("---4) 인터페이스가 메소드의 매개변수 타입으로 사용될 경우 : 메소드 호출 시 구현 객체를 매개값으로 대입할 수 있다");
		MyClass mc4 = new MyClass();
		mc4.methodB(new Television());
		mc4.methodB(new Audio());
	}
}
