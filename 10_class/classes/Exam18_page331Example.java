package classes;

// pdf 330, 331p 과제

public class Exam18_page331Example {
	public static void main(String[] args) {
		Exam18_page331 obj1 = Exam18_page331.getInstance();
		Exam18_page331 obj2 = Exam18_page331.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 ShopService 객체 입니다");
		} else {
			System.out.println("다른 ShopService 객체 입니다");
		}
	}
}