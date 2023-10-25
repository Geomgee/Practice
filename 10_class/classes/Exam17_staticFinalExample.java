package classes;

public class Exam17_staticFinalExample {
	public static void main(String[] args) {
		// Exam17_staticFinalEARTH_RADIOUS = 5000;
		System.out.println("지구의 반지름 : " + Exam17_staticFinal.EARTH_RADIOUS + "km^2");
		System.out.println("지구의 표면적 : " + Exam17_staticFinal.EARTH_AREA + "km^2");
		// final static이 붙은 상수는 클래스에서 선언시 처음부터 초기화해야하며 매개변수가 있는
		// 생성자 함수로 상수를 초기화할 수 없다. 즉, 한 번 값이 할당 되면 프로그램 끝날 때까지 값 변경 금지

		Exam17_staticFinal staticFinal = new Exam17_staticFinal();
		// staticFinal.EARTH_AREA = 1000;
		// 인스턴스로 만들어도 값 변경이 되지 않는다

	}
}
