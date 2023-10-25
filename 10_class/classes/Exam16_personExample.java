package classes;

public class Exam16_personExample {
	public static void main(String[] args) {
		Exam16_person p1 = new Exam16_person("980922-213242", "박검지");
		Exam16_person p2 = new Exam16_person("091217-203242", "뚱딴지");

		System.out.println(p1.nation);
		System.out.println(p1.personalId);
		System.out.println(p1.name);

		System.out.println(p2.nation);
		System.out.println(p2.personalId);
		System.out.println(p2.name);

		System.out.println("============");

		// p1.nation = "미국"; =>final 필드는 값 변경 안 됨
		// p1.personalId = "미국"; =>final 필드는 값 변경 안 됨
		p1.name = "손흥민";
		System.out.println(p1.name);
		// Exam16_person.KIND = "식물"; => static final 필드도 값 변경 금지

	}
}
