package geomji_java;

public class Exam06 {

	public static void main(String[] args) {
		// 논리 연산자 : 집합 기호를 명령어로 만들어 놓은 것
		// =>연산의 결과로는 true, false가 나온다

		int a = 100;
		int b = 200;
		int x = 5, y = 3;
		
		System.out.println((a >= b) && (x >= y)); //and
		// && => A도 참이고 B도 참이다.  아래 식은 A는 참이 아니고 B가 참이라 false
		System.out.println((a >= b) || (x >= y)); //or
		// || => A가 참이거나 B가 참이다.  아래 식은 A는 참이 아니고 B가 참이라 true
		System.out.println(!((a >= b) || (x >= y))); //not
		// ! not연산자 : 조건의 결과가 반대로 나옴
		System.out.println(!(a >= b) || !(x >= y)); //or
		System.out.println(!(a >= b) && !(x >= y)); //and
		System.out.println(!((a >= b) && (x >= y))); //and
	}

}
