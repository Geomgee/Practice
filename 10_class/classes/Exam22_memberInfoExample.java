package classes;

public class Exam22_memberInfoExample {
	public static void main(String[] args) {
		Exam22_memberInfo member = new Exam22_memberInfo();

		// 1)setter를 이용해서 원하는 데이터로 멤버 변수의 값을 초기화
		member.setAge(30);
		member.setName("김삼순");
		member.setId("삼순이");

//		System.out.println("이름 : " + member.getName());
//		System.out.println("아이디 : " + member.getId());
//		System.out.println("나이 : " + member.getAge());

		System.out.println("===============");
		// 2)매개변수가 있는 생성자 함수로 멤버변수의 값을 초기화
		Exam22_memberInfo member2 = new Exam22_memberInfo("감자바", 20, "potato");
		System.out.println(member2.toString());
//		System.out.println("이름 : " + member2.getName());
//		System.out.println("아이디 : " + member2.getId());
//		System.out.println("나이 : " + member2.getAge());

	}

}
