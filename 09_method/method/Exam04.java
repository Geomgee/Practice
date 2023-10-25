package method;

public class Exam04 {
	public static void main(String[] args) {
		int d = 0;
		System.out.println(plus(1, 2));
		d = plus(1, 2); // 함수의 사용법 : 함수의 이름을 불러준다.
		System.out.println(d);

		output(1000);
		print1();
		//print2(); //static 키워드가 붙지 않은 print2()메소드는 호출하면 에러가 난다!
	}

	static int plus(int a, int b) { // 매개변수 : 전달된 값을 저장하는 변수
		return a + b; // 함수가 호출된 곳으로 되돌아가라는 명령어, return 옆에 데이터가 있으면 그 데이터를 가지고 되돌아가는 것

	}

	static void output(int c) {
		System.out.println(c);
		return; // 함수의 마지막 줄에는 return 명령어가 존재해야 한다. 그러나 마지막 줄의 리턴값이 없는 리턴은 생략 가능
	}

	static String name1 = "김철수";

	static void print1() {
		System.out.println(name1);
	}
	// 클래스 안에서 만든 메소드를 해당 클래스를 객체로 생성하여 객체명.메소드명()으로 호출하여 사용하거나 객체로 생성하지 않고 바로 사용하려면 static 키워드를 붙인 메소드로 만들어야 한다. 또한, static 메소드 안에서 객체로 생성하지 않은 변수를 사용하려면 static 키워드를 붙인 클래스 변수로 만들어야 한다!!
}
