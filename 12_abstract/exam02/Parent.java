package exam02;

public abstract class Parent {
	void show() {
		System.out.println("나는 부모 클래스인 동시에 추상 클래스이다 부모+추상 클래스");
	}

	abstract void call(); // 추상 메소드는 구현하는 {} 이 없고, abstract 키워드를 사용하며 추상 메소드가 있는 클래스는 꼭 추상 클래스여야 한다. 사용하는
							// 이유는 메소드의 선언만 통일하고 실행 내용은 실체 클래스마다 달라야 하는 경우 추상 메소드를 선언한다

}
