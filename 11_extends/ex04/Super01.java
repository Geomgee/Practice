package ex04;

class Parent {
	String data = "부모";

	void print() {
		System.out.println("나는 부모이다.");
	}
}

class child extends Parent {
	String data = "자식";
	String data2 = super.data; // 부모에게 상속받은 데이터를 data2에 덮어 씌움 (필드 이름이 중복되어서 부모 필드명을 바꾸는 것)

	void call() {
		super.print(); // 생성자 인스턴스로는 접근을 못 한다. 호출만 가능. 실제로 많이 사용하는 것은 이 방법 T"자식이 부모를 상속받고 자신이 같은 메소드명을 가지고 있는 경우 부모의 메소드를 가져오려면  super.메소드명 사용
		System.out.println("나는 call 메소드이다");
	}

	@Override // 누군가가 갖고 있는 메소드인데 너가 갖고 있는 거 구나!
	void print() {
		System.out.println("나는 자식이 오버라이드한 print 메소드이다.");
	}
}

public class Super01 {
	public static void main(String[] args) {
		child c = new child();
		System.out.println(c.data); // 부모를 상속 받아서 데이터를 덮어 씌움
		System.out.println(c.data2); // 부모에게 상속받은 데이터를 덮어 씌움
		c.print();
		c.call();
		System.out.println("----------------");

		// Parent 인스턴스 객체를 접근할 수 있다
		Parent p = new Parent();
		p.print();
	}
}
