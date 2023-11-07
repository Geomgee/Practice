package exam01;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone();
		// 추상 클래스는 new 연산자로 인스턴스화 할 수 없다
		// 객체도 못 만드는데 왜 만들었냥? -> 자식을 위해서

		DmbPhone dmbPhone = new DmbPhone();
		dmbPhone.turnOn("뚱딴지");
		dmbPhone.watchTV();
		dmbPhone.turnOff("뚱딴지");

		SmartPhone smartPhone = new SmartPhone();
		smartPhone.turnOn("박간식");
		smartPhone.internetSearch();
		smartPhone.turnOff("박간식");

	}
}
