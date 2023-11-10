package exam04;

interface WithPrivate {
	default int getData() {
		print(); // 3
		return get() + 100; // 4
	}

	private void print() {
		System.out.println(get()); // 2
	}

	private int get() {
		return 100; // 1
	}
}

class Test implements WithPrivate {
	void test() {
		int x = getData(); // 5
		System.out.println("x: " + x); // 6
	}
}

public class interface03 {
	public static void main(String[] args) {
		Test t = new Test();
		t.test();
		// 1) Test 객체를 만들고 test()를 호출하면 =>
		// getData() 호출 => print() 호출 => get() 호출 =>
		// get()에 100이 담김 => print() 출력 => get()+100 을 더함 => 다시 test()로 돌아가서 출력구문 출력
	}

}
