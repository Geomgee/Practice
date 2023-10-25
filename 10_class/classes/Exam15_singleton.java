package classes;

public class Exam15_singleton {
	// 싱글톤 : 프로그램에서 단 하나의 객체만 생성할 수 있도록 만드는 방법

	/*
	 * 1)자신의 타입인 정적 필드를 하나 선언하고 자신의 객체를 생성해 초기화한다. 클래스 내부에서는 new 연산자로 생성자 호출이 가능하나
	 * 정적 필드를 외부에서 값을 변경하지 못하도록 private 접근 제한자를 붙인다
	 */
	private static Exam15_singleton singleton = new Exam15_singleton();

	/* 2)외부에서는 생성자를 사용할 수 없도록 private 접근 제한자를 붙인다 */
	private Exam15_singleton() {
	}

	/*
	 * 3)외부에서 객체를 얻는 유일한 방법으로 외부에서 호출할 수 있는 정적메소드인 getInstance()를 선언하고, 정적 필드에서 참조하고
	 * 있는 자신의 객체를 리턴
	 */
	static Exam15_singleton getInstance() {
		return singleton;
	}
}
