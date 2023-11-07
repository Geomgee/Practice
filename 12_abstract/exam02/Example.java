package exam02;

public class Example {
	public static void main(String[] args) {
		Child c = new Child();
		c.show(); // 부모가 가지고 있는 메소드
		c.call(); // 부모가 오버라이드 한 메소드
		c.print(); // 자식만 가지고 있는 메소드
	}
}
