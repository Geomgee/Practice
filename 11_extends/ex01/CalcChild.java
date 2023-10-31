package ex01;

public class CalcChild extends CalcParent {
	public CalcChild() {
		// super();
		// 컴파일러가 자식 생성자 함수를 호출하면서 자동으로 첫번째 줄에서 부모 생성자 함수를 호출하기 위한 super()를 호출한다
		System.out.println("자식");
	}

	public int multifly(int x, int y) {
		return x * y;
	}

	public int divide(int x, int y) {
		return x / y;
	}
}
