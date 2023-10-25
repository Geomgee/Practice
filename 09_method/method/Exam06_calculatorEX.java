package method;

public class Exam06_calculatorEX {
	public static void main(String[] args) {
		Exam06_calculator myCal = new Exam06_calculator();

		double result1 = myCal.areaRectangle(10);
		System.out.println("정사각형의 넓이: " + result1);

		double result2 = myCal.areaRectangle(10, 20);
		System.out.println("직사각형의 넓이: " + result2);
	}

}
