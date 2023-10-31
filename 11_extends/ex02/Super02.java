package ex02;

class Parent1 {
	protected int dataA;

	Parent1() {
		super();
	}

	Parent1(int dataA) {
		this.dataA = dataA;
	}

	void printA() {
		System.out.println("dataA: " + dataA);
	}
}

class Child1 extends Parent1 {
	private int dataB;

	Child1() {
	}

	Child1(int dataB) {
		this.dataB = dataB;
	}

	Child1(int dataA, int dataB) {
		this.dataA = dataA;
		this.dataB = dataB;
	}

	void printB() {
		System.out.println("dataB: " + dataB);
	}
}

public class Super02 {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.printA();
		c1.printB();

		System.out.println("=================");
		Child1 c2 = new Child1(10);
		c2.printA();
		c2.printB();

		System.out.println("=================");
		Child1 c3 = new Child1(10, 5);
		c3.printA();
		c3.printB();
	}
}
