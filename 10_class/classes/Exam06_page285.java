package classes;

public class Exam06_page285 {
	public static void main(String[] args) {

		Member member = new Member();
		member.name = "박검지";
		member.id = "pafiejwoaws";
		member.password = "12d2d2";
		member.age = 15;

		member.explain();

		System.out.println("===========");
		Member member1 = new Member("박궁디", "pp", "q1w1e1", 542);

		member1.explain();
	}
}
