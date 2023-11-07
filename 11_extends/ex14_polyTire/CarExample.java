package ex14_polyTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); // 자동차 객체 생성
		myCar.run();

		System.out.println("=======================");
		myCar.tire1 = new Kumho();
		myCar.tire2 = new Kumho();
		myCar.run();
		System.out.println("=======================");
		myCar.tire1 = new Hankook();
		myCar.tire2 = new Hankook();
		myCar.run(); // 다형성으로 구현한 코드 덕분에 실행결과가 다르게 나온다!
	}
}
