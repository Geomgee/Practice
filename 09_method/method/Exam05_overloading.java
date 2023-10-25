package method;

public class Exam05_overloading {
	// 자바 스타일로 오버로딩 함수 만들기

	public static int plus(int a, int b) {
		return a + b;
	}

	public static double plus(double a, double b) {
		return a + b;
	}

	public static double plus(int a, double b) {
		return a + b;
	}

	public static double plus(double b, int a) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(plus(5, 7));
		System.out.println(plus(5.5, 7.7));
		System.out.println(plus(5.5, 7));
		System.out.println(plus(5, 7.7));
		System.out.println("자바에서는 하나의 클래스 안에 같은 이름의 함수를 여러개 만들었을 때 매개변수의 타입이나 순서나 개수가 다르다면 메소드 오버로딩이 성립하여 서로 다르게 동작한다!");
	}

}
