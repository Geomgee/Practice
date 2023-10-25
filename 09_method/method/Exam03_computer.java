package method;

public class Exam03_computer {
	// 매개변수의 개수를 알 수 없는 경우
	// 1. 매개변수를 배열 타입으로 선언해서 해결
	public int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	//2. 매개변수를 ...을 이용해서 값의 목록만 넘겨주는 방법으로 해결
	public int sum2(int...values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}
