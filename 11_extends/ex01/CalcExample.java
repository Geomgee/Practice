package ex01;

public class CalcExample {

	public static void main(String[] args) {
		CalcParent parent = new CalcParent();
		System.out.println(parent.plus(5, 4));
		System.out.println(parent.minus(5, 4));

		System.out.println("====================");
		CalcChild child = new CalcChild();
		System.out.println(child.multifly(5, 4));
		System.out.println(child.divide(5, 4));
		// 자식 클래스는 본인에게 없는 메소드이지만 부모가 가지고 있는 메소드 기능을 사용할 수 있다
		System.out.println(child.plus(5, 4)); // 자식에는 plus 메소드가 없지만 부모를 상속받 았으니 plus가 실행이 된다
		System.out.println(child.plus(5, 4)); // " minus

		// 자식 클래스가 생성이 될 때 부모 객체가 먼저 생성되고 자식 객체가 나중에 생성된다.
	}

}
