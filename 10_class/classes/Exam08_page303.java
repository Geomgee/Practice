package classes;

public class Exam08_page303 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setTriangle(5, 12);
		System.out.println("삼각형의 넓이 : " + t1.getArea());

		Triangle t2 = new Triangle();
		t2.setTriangle(45, 7);
		System.out.println("삼각형의 넓이 : " + t2.getArea());
	}
}
