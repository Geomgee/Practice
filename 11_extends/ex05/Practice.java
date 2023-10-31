package ex05;

public class Practice {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();

		r.setArea(10, 5);
		t.setArea(10, 5);

		System.out.print("사각형의 넓이: " + r.getArea());
		System.out.print("삼각형의 넓이: " + t.getArea());
	}
}
