package classes;

public class Exam16_person {
	final String nation = "대한민국";// final 필드
	final String personalId;
	String name;
	static final String KIND = "사람"; // static final : 상수는 선언하면서 바로 초기화 해야 함

	public Exam16_person(String personalId, String name) {
		this.personalId = personalId;
		this.name = name;
	}

	public Exam16_person(String personalId, String name, String KIND) {
		this.personalId = personalId;
		this.name = name;
		// this.KIND = KIND 상수는 생성자 함수의 매개변수로 값을 초기화 할 수 없다.
	}
}
