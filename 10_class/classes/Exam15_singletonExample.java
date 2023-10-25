package classes;

public class Exam15_singletonExample {
	public static void main(String[] args) {
//		Exam15_singleton singleton2 = new Exam15_singleton(); 사용 불가
		Exam15_singleton obj1 = Exam15_singleton.getInstance();
		System.out.println(obj1);
		Exam15_singleton obj2 = Exam15_singleton.getInstance();
		System.out.println(obj2);

		if (obj1 == obj2) {
			System.out.println("같은 싱글톤 객체이다.");
		} else {
			System.out.println("서로 다른 객체이다.");
		}
	}
}