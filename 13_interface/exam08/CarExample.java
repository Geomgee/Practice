package exam08;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.run();

		System.out.println("=====================");
		myCar.flt = new GumhoTire();
		myCar.frt = new GumhoTire();
		myCar.run();
	}
}
