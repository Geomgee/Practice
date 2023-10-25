package classes;

// pdf 330, 331p 과제

//정적 필드
public class Exam18_page331 {
	// 정적 필드
	private static Exam18_page331 singleton = new Exam18_page331();

	// 생성자
	private Exam18_page331() {
	}

	// 정적 메소드
	static Exam18_page331 getInstance() {
		return singleton;
	}
}
