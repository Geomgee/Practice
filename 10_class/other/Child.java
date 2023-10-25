package other;

import classes.Exam00;

public class Child extends Exam00{
	//오른쪽의 클래스를 상속받는 클래스를 의미
	public static void main(String[] args) {
		Exam00 exam00 = new Exam00();
		System.out.println(exam00.getY());
		exam00.setY(0);
		System.out.println(exam00.getY());
	}
}