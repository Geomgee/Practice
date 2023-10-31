package ex02;

class Parent {
	private int dataA;

	public Parent() {
		super();
		System.out.println("부모 기본생성자 호출");
	}

	Parent(int dataA) {
		System.out.println("부모 매개변수 생성자 호출");
		this.dataA = dataA;
	}

	void printA() {
		System.out.println("dataA: " + dataA);
	}
}

class Child extends Parent {
	private int dataB;

	Child() {
		System.out.println("자식 생성자 호출");
	}

	Child(int dataA, int dataB) {
		super(dataA); // 부모의 값에 매개변수를 넣기 위함
		this.dataB = dataB;
		System.out.println("자식 매개변수 생성자 함수 호출");
		System.out.println("dataA: " + dataA + " dataB: " + dataB);
	}

	void printB() {
		System.out.println("dataB: " + dataB);
	}
}

public class Super01 {
	public static void main(String[] args) {
		Child c = new Child(1, 5);
		c.printA();
		c.printB();
	}

}
