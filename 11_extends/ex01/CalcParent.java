package ex01;

public class CalcParent {

	public CalcParent() {
		super();
	}

	public CalcParent(int a) {
		System.out.println("부모 생성자 함수가 호출 되었습니다");
	}

	public int plus(int x, int y) {
		return x + y;
	}

	public int minus(int x, int y) {
		return x - y;
	}

}
