package exam02;

public class Child extends Parent {

	@Override
	void call() {
		System.out.println("나는 부모 추상 메소드를 오버라이딩한 자식 메소드 :D");
	}
	// -> 추상 메소드를 상속받는 자식 메소드는 오버라이딩 하거나 아니면 본인도 추상 클래스가 되어야 한다.

	void print() {
		System.out.println("이것은 자식인 나만 가진 메소드 XP");
	}
}
