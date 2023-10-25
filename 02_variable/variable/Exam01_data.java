package variable;

public class Exam01_data {

	public static void main(String[] args) {
		// 다양한 변수 선언하기
		// 1) int형 정수를 선언하고 변수에 저장
		int num1; // 선언
		num1 = 1000000000;
		System.out.println("num1이 가지고 있는 값 : " + num1);

		// 2) byte형 정수를 선언하고 변수에 저장
		byte num2 = 127; // 선언과 동시에 변수에 값 저장
		System.out.println("num2이 가지고 있는 값 : " + num2);

		// 3) long형 정수를 선언하고 변수에 저장할 때에는 숫자 뒤 '문자L' 접미사를 붙인다.
		long num3 = 1234567890123456789L; // 선언과 동시에 변수에 값 저장
		System.out.println("num3이 가지고 있는 값 : " + num3);

		// 4) short형 정수를 선언하고 변수
		short num4 = -32000; // 선언과 동시에 변수에 값 저장
		System.out.println("num4이 가지고 있는 값 : " + num4);

		// 5) double형 실수를 선언하고 변수
		double n1 = 1234.4d; // 자바에서의 실수의 기본 데이터 형, d 접미사 생략 가능
		System.out.println("n1이 가지고 있는 값 : " + n1);

		// 6) float형 실수를 선언하고 변수
		float n2 = 1234.4f; // f 접미사 생략 불가
		float n3 = 123.4f; // f 접미사 생략 불가
		System.out.println("n2이 가지고 있는 값 : " + n2);
		System.out.println("n3이 가지고 있는 값 : " + n3);

		// 7) char 문자형 저장
		char ch1 = 'a'; // 외따옴표 안에 하나의 문자를 넣으면 문자형
		char ch2 = 'B';
		char ch3 = 'ㄱ';
		char ch4 = '가';
		String st1 = "ABCD"; // 쌍따옴표 안에 문자를 넣으면 문자형이 아닌 문자열을 의미
		String st2 = "A"; // 쌍따옴표 안에 문자를 넣으면 문자형이 아닌 문자열을 의미
		System.out.println(ch1 + "," + ch2 + "," + ch3);
		System.out.printf("ch1:%s, ch2:%s, ch3:%s, ch4:%s, st1:%s, st2:%s\n", ch1, ch2, ch3, ch4, st1, st2);

		// 8) boolean 논리형 저장
		boolean b1 = true;
		boolean b2 = false;
		boolean b5 = 5 > 10;
		/*
		 * boolean b3 = 0; boolean b4 = 1;
		 */
		System.out.println();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b5); // 논리형 변수에는 계산식을 담을 수도 있다.

	}
}
