package ex12;

class Car {
	private String color;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String color) {
		super();
		this.color = color;
	}

	void drive() {
		System.out.println(color + "색 차를 운전중이다.");
	}

}

class Sedan extends Car {
	private int seats;

	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sedan(String color, int seats) {
		super(color);
		this.seats = seats;
		// TODO Auto-generated constructor stub
	}

	void showSeats() {
		System.out.println("이 차는 " + seats + "개의 좌석이 있다.\n");
	}

}

class Truck extends Car {
	private int wheels;

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Truck(String color, int wheels) {
		super(color);
		this.wheels = wheels;
		// TODO Auto-generated constructor stub
	}

	void showWheels() {
		System.out.println("이 차는 " + wheels + "개의 바퀴가 있다.\n");
	}

}

public class InstanceOF {
	public static void main(String[] args) {
		Car myCar = new Sedan("흰", 4);
		Car yourCar = new Truck("핑크", 8);
		Car herCar = new Sedan("빨간", 4);

		myCar.drive();
		yourCar.drive();
		herCar.drive();

		/*
		 * myCar.showSeats(); yourCar.showWheels(); 다형성 시에는 자식만이 가지고 있는 메소드는 사용 불가
		 */

//		 ((Sedan) myCar).showSeats(); // 강제 형변환을 해서 다시 본인의 타입으로 돌아오면 ((Truck)
//		 ((Truck) yourCar).showWheels(); // 자식만이 가지고 있는 메소드 사용 가능
		System.out.println("=========================");
		if (myCar instanceof Sedan) {
//			boolean bool = myCar instanceof Sedan;
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (myCar instanceof Sedan) {
			((Sedan) myCar).drive();
			((Sedan) myCar).showSeats();
		} else {
			System.out.println("myCar는 Sedan클래스의 인스턴스가 아니다");
		}

		if (yourCar instanceof Truck) {
			((Truck) yourCar).drive();
			((Truck) yourCar).showWheels();
		} else {
			System.out.println("yourCar는 Truck클래스의 인스턴스가 아니다");
		}

		if (yourCar instanceof Sedan) {
			((Truck) yourCar).drive();
			((Truck) yourCar).showWheels();
		} else {
			System.out.println("yourCar는 Truck클래스의 인스턴스가 아니다");
		}
	}
}
