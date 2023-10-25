package variable;

public class Exam02_char {
	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'a';
		char c3 = 'B', c4 = 'b', c5 = 'C', c6 = 'c';

		System.out.println(c1);
		System.out.println((int) c1); // (int)문자형=>강제로 형변환을 할 수 있다.
		System.out.println((int) c2); // (int)문자형=>강제로 형변환을 할 수 있다.
		System.out.println((int) c3); // (int)문자형=>강제로 형변환을 할 수 있다.
		System.out.println((int) c4); // (int)문자형=>강제로 형변환을 할 수 있다.
		System.out.println((int) c5); // (int)문자형=>강제로 형변환을 할 수 있다.
		System.out.println((int) c6); // (int)문자형=>강제로 형변환을 할 수 있다.

		System.out.println(1);
		System.out.println((char) 3);

		char han1 = '가';
		System.out.println(han1);
		System.out.println((int) han1);

		char x = ' ';
		System.out.printf("공백출력 %s", x);
		// char y = ' A '; 공백때문에 에러 발생 => 문자형에는 공백 SSF사용 불가!
		String z = "A ";
		System.out.print(z);
		System.out.print("공백을 확인하기 위한 문자열");

		char d1 = 'A';
		System.out.println(d1);
		d1 = 'B'; // 변수에 데이터를 덮어쓰기 가능하다!
		System.out.println(d1);
		// d1=d1+1;
		d1++; // 후치 연산자 문자형도 숫자가 매칭되어 있기 때문에 연산이 가능하다 => 98+1=>99=>C
		System.out.println(d1);
		//d1 = 
		++d1;// 전치 연산자
		System.out.print(d1);
		System.out.print("dsdf1");
	}
}
