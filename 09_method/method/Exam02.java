package method;

import java.util.Scanner;

public class Exam02 {
	static int tot, tot2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==1. 더하기, 빼기 연산==");
		System.out.println(plus(5, 7));
		System.out.println(minus(100, 200));

		System.out.println("==2. 총합 메소드==");
		System.out.println(sum(5, 7));
		System.out.println(sum(1, 100));

		System.out.println("==3. 사용자에게 정수 2개를 입력받아 총합을 구하는 메소드==");
		System.out.println("몇부터 더하기를 시작할까요? 정수로만 입력해주세요.");
		int from = sc.nextInt();
		System.out.println();
		System.out.println("몇까지 더할까요? 정수로만 입력해주세요.");
		int to = sc.nextInt();
		result(from, to);

	}

	public static double plus(int i, int j) {
		return i + j;
	}

	public static double minus(double i, double j) {
		return i - j;
	}

	// static 변수에 접근하기 위한 메소드는 반드시 static 메소드여야 하고 static 메소드 안에서 사용하는 변수는 반드시
	// static 변수여야 한다.
	public static int sum(int from, int to) {
		for (int i = from; i <= to; i++) {
			tot += i;
		}
		return tot;
	}

	public static void result(int from, int to) {
		tot2 = 0;
		if (from > to) {
			System.out.println("작은 정수부터 다시 입력해주세요.");
		} else {
			for (int i = from; i <= to; i++) {
				tot2 += i;
			}
			System.out.println(from + "부터 " + to + "까지의 합은" + tot2 + "입니다.");
		}
	}
}
