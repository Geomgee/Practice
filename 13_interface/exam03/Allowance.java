package exam03;

public interface Allowance {
	int MONTHLY_ALLOWANCE = 50000; // 상수를 필드로 선언

	void in(int value, String name); // 추상메소드

	void out(int value, String name); // 추상메소드
}
