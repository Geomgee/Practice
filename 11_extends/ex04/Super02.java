package ex04;

class Parent2 {
	void print() {
		System.out.println("부모를 출력");
	}

	void test(int x) {
		System.out.println("부모 : " + x + "번 시험을 보았다.");

	}
}

class Child2 extends Parent2 {
	@Override
	void print() {
		System.out.println("자식에서 부모를 출력");
		super.print();
	}

	@Override
	void test(int x) {
		super.test(10);
		System.out.println("자식 : " + x + "번 시험을 보았다.");
	}
}

public class Super02 {
	public static void main(String[] args) {
		Parent2 p = new Parent2();
		p.print();
		p.test(10);

		System.out.println("====================");
		Child2 c = new Child2();
		c.print();
		c.test(20);
	}
}
