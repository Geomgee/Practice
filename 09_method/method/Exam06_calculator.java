package method;

public class Exam06_calculator {
	//사각형의 넓이를 구하는 클래스 계산기 => 오버로딩을 활용
	
	//정사각형 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}
