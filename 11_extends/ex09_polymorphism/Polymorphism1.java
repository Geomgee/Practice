package ex09_polymorphism;

class Parent {
	void eat() {
		System.out.println("부모 - 손님들이 부모님의 전통 음식을 먹습니다");
	}

	void pay() {
		System.out.println("부모 - 손님들이 계산을 해드립니다.");
	}

	void drink() {
		System.out.println("부모 - 손님들이 부모님이 만드신 전통차를 마십니다.");
	}
}

class Child extends Parent {
	String child = "자식";

	@Override
	void eat() {
		System.out.println(child + " - 손님들이 " + child + "이 전수 받은 음식을 먹습니다.");
	}

	void newSkill() {
		System.out.println("자식 - 자식이 새로운 기술을  사용하여 기존과는 다른 메뉴를 개발하고 판매합니다.");
	}

	@Override
	void drink() {
		System.out.println("자식 - 손님들이 자식이 전수 받은 전통차를 마십니다.");
	}
}

public class Polymorphism1 {
	public static void main(String[] args) {
		System.out.println("==================");
		Parent p = new Parent();
		p.eat();
		p.drink();
		p.pay();

		System.out.println("==================");
		Child c = new Child();
		c.eat();
		c.newSkill();
		c.drink();
		c.pay();

		System.out.println("==================");
//		Child c1 = new Child();
//		Parent p1 = c1;
		Parent x = new Child(); // 객체의 다형성 위 두가지를 축약
		x.eat(); // 오버라이딩 한 자식 메소드를 호출
		x.drink(); // 오버라이딩 한 자식 메소드를 호출
//		x.newSkill(); 자식에게만 있는 메소드는 못 씀 
		x.pay();
	}
}
