package classes;

class Car {
	String kind; // 차종
	String color; // 색상
	int year; // 연식

	void run() {
		System.out.println(kind + " 자동차가 질주한다.");
	}

	void speedUp() {
		System.out.println(color + "의 " + year + "년식 " + kind + " 자동차가 스피드를 올리고 있다.");
	}

}

public class Exam03_car {
	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println(myCar);
		System.out.println(myCar.kind);
		System.out.println(myCar.color);
		System.out.println(myCar.year);
		myCar.run();
		myCar.speedUp();

		myCar.kind = "테슬라";
		myCar.color = "빨간색";
		myCar.year = 2023;

		System.out.println();
		System.out.println("===myCar===");
		System.out.println(myCar.kind);
		System.out.println(myCar.color);
		System.out.println(myCar.year);
		myCar.run();
		myCar.speedUp();

		Car yourCar = new Car();
		yourCar.kind = "캐스퍼";
		yourCar.color = "카키색";
		yourCar.year = 2023;

		System.out.println();
		System.out.println("===yourCar===");
		System.out.println(yourCar.kind);
		System.out.println(yourCar.color);
		System.out.println(yourCar.year);
		yourCar.run();
		yourCar.speedUp();

		Car hisCar = new Car();
		System.out.println(hisCar);
		hisCar = myCar; // 인스턴스 변수(참조변수)에 다른 인스턴스를 담는다
		System.out.println();
		System.out.println("************");
		System.out.println(hisCar);
		System.out.println(myCar);
		hisCar.run();
		hisCar.speedUp();

		hisCar.color = "파란색";
		hisCar.kind = "우루스";
		hisCar.year = 2024;
		System.out.println();
		System.out.println("==hisCar의 field를 변경 후 메소드를 다시 호출 시 ==");
		hisCar.run();
		hisCar.speedUp();
		myCar.run();
		myCar.speedUp();

	}

}