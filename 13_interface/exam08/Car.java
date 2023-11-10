package exam08;

public class Car {
	// 인터페이스를 필드 타입으로 사용
	Tire flt = new HankookTire();
	Tire frt = new HankookTire();
	Tire blt = new HankookTire();
	Tire brt = new HankookTire();

	void run() {
		flt.roll();
		frt.roll();
		blt.roll();
		brt.roll();
	}

}
