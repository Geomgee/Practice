package ex14_polyTire;

public class Car { // OOP (oriented object programming)
	// 필드의 다형성
	Tire tire1 = new Hankook();
	Tire tire2 = new Kumho();

	void run() {
		tire1.roll();
		tire2.roll();
	}

}
