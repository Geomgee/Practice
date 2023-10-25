package geomji_java;

public class Exam04 {

	public static void main(String[] args) {
		// 단항 연산자 (++,--)를 포함한 증감 연산자

		// 값을 1씩 증가시키는 이항 연산자
		int num = 1;
		System.out.println(num);
		num = num + 1;
		System.out.println(num);
		num += 1;
		System.out.println(num);

		// 값을 1씩 증가시키는 단항 연산자
		num++; // 후치형
		System.out.println(num);
		++num; // 전치형
		System.out.println(num);

		// 값을 1씩 증가시키는 이항 연산자
		num = num - 1;
		System.out.println(num);
		num -= 1;
		System.out.println(num);

		// 값을 1씩 감소시키는 이항 연산자
		num--; // 후치형(후위 연산)
		System.out.println(num);
		--num; // 전치형(전위 연산)
		System.out.println(num);

		// 후치형
		int a1 = 100;
		int x1 = 1;
		int y1 = a1 + x1++;
		System.out.println("x1=" + x1);
		System.out.println("y1=" + y1);

		// 전치형
		int a2 = 100;
		int x2 = 1;
		int y2 = a2 + ++x2;
		System.out.println("x2=" + x2);
		System.out.println("y2=" + y2);

	}

}
