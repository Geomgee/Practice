package exam04;

interface WithDefault {
	int get();

	// java8 이상부터 인터페이스도 default, static
	// java9 이성부터 private 메소드를 가질 수 있게 되었다
	public default int getNext() { // default 사용하고 싶을 때 public default 기재
		return get() + 10;
	}
}

class Test1 implements WithDefault {
	@Override
	public int get() {
		return 100;
	}
}

class Test2 implements WithDefault {
	@Override
	public int get() {
		return 500;
	}
}

public class Interface01 {
	public static void main(String[] args) {
//		System.out.println(withDefault.getNext()); -> static 메소드가 아니기 때문에 X
		Test1 x = new Test1();
		System.out.println(x.getNext());
		Test2 y = new Test2();
		System.out.println(y.getNext());
	}
}
