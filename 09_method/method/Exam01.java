package method;

import java.util.Scanner;

public class Exam01 {
	// 메소드의 시그니처 : (접근제한자) (static의 유무) 리턴타입 메소드이름(매개변수의 유무){실행문}
	// static이 붙은 메소드를 '클래스 메소드' 라고 부른다. 자바에서 static키워드를 사용한다는 것은 메모리의 메소드 영역에 한 번
	// 할당되어 프로그램이 동작하는 동안 즉, 프로그램이 종료될 때 해제 되는 것을 의미하며 클래스의 인스턴스(객체)를 생성하지 않고도 다른
	// 클래스에서 해당 클래스의 메소드를 사용할 수 있다.

	// 1. 매개변수, 리턴값 모두 없는 메소드
	public static void show() {
		System.out.println("나는 show 메소드 이다.");
	}

	// 2. 매개변수 O, 리턴값 X 메소드
	public static void findPower(int x, int y) {
		int result = 1;
		for (int a = 1; a <= y; a++) {
			result *= x;
		}
		System.out.println(x + "의 " + y + "제곱은 " + result + "입니다.");
	}

	// 3. 매개변수 X, 반환값 O 메소드
	public static int doSomething() {
		int result;
		result = 10 * 100;
		return result;
	}

	// 4. 매개변수 반환값 모두 O 메소드
	public static int add(int x, int y) {
		int result = x + y;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==1. 메소드 기본 연습 : 매개변수, 리턴값이 모두 없는 메소드==");
		show();
		
		System.out.println("==2. 메소드 기본 연습 : 매개변수 O, 리턴값 X 메소드==");
		findPower(5, 2);
		
		System.out.println("==3. 메소드 기본 연습 : 매개변수 X, 리턴값 O 메소드==");
		int num;
		num = doSomething();
		System.out.println(num);
		
		System.out.println("==4. 메소드 기본 연습 : 매개변수 반환값 모두 O 메소드==");
		num = add(10, 5);
		System.out.println(num);
		
		System.out.println("==4-1. 메소드 기본 연습 : 매개변수 반환값 모두 O + 메소드에 사용자에게 입력받은 값을 인수로 넣는 경우==");
		System.out.println("두 개의 정수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + "+" + b + "=" + add(a, b));
		
		sc.close();
	}
}
