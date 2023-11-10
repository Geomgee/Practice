package exam03;

public class interfaceExample {
	public static void main(String[] args) {
		Student s = new Student();
		s.in(5000, "엄마");
		s.out(2000, "피시방 ");
		s.in(Student.MONTHLY_ALLOWANCE, "엄마");
		s.pay(300000, "수학 학원");

		System.out.println(Allowance.MONTHLY_ALLOWANCE);

	}
}
