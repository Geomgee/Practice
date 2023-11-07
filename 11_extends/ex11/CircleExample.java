package ex11;

class CircleVO {
	private int r; // 반지름
	private double size; // 넓이
	private final double PI = 3.141592;

	public CircleVO() {
		super();
	}

	public CircleVO(int r) {
		super();
		this.r = r;
	}

	// 오버라이드용 메소드
	public void compute() {
	}

	public void output() {
	}

	// getter setter
	public int getR() {
		return r;
	}

	public double getSize() {
		return size;
	}

	public double getPI() {
		return PI;
	}

	public void setR(int r) {
		this.r = r;
	}

	public void setSize(double size) {
		this.size = size;
	}
}

class CircleRound extends CircleVO {

	public CircleRound() {
		super();
	}

	public CircleRound(int r) {
		super(r);
	}

	@Override
	public void compute() {
		super.compute();
		setSize(getR() * 2 * getPI());
	}

	@Override
	public void output() {
		super.output();
		System.out.println("반지름 " + getR() + "인 원의 둘레 : " + getSize());
	}

}

class CircleArea extends CircleVO {

	public CircleArea() {
		super();
	}

	public CircleArea(int r) {
		super(r);
	}

	@Override
	public void compute() {
		// 원의 넓이 = 반지름 * 반지름 * PI
		super.compute();
		setSize(getR() * getR() * getPI());
	}

	@Override
	public void output() {
		super.output();
		System.out.println("반지름 " + getR() + "인 원의 넓이 : " + getSize());
	}

}

public class CircleExample {
	public static void main(String[] args) {
		CircleVO[] circles = new CircleVO[4];
		circles[0] = new CircleArea(10);
		circles[1] = new CircleArea(20);
		circles[2] = new CircleRound(10);
		circles[3] = new CircleRound(20);

		for (int i = 0; i < circles.length; i++) {
			circles[i].compute();
			circles[i].output();
		}

//		CircleVO ca1 = new CircleArea(10);
//		ca1.compute();
//		ca1.output();
//
//		CircleVO ca2 = new CircleArea(20);
//		ca2.compute();
//		ca2.output();
//
//		CircleVO cr1 = new CircleRound(10);
//		cr1.compute();
//		cr1.output();
//
//		CircleVO cr2 = new CircleRound(20);
//		cr2.compute();
//		cr2.output();
	}
}
