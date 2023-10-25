package conditional;

import java.util.Scanner;

public class Prac01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor, eng, math;

		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();

		int evg = (kor + eng + math) / 3;

		System.out.println();

		if ((evg >= 60) && (kor > 40) && (eng > 40) && (math > 40)) {
			System.out.println("합격 입니다! 🎉🎉🎉🎉");
		} else {
			System.out.println("불합격😥");
		}

		sc.close();
	}
}
