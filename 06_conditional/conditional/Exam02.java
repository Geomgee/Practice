package conditional;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("요리 점수 입력(100점 만점 기준으로 정수만 입력해주세요) : ");
		int score = sc.nextInt();

		if (score >= 90 && score <= 100) {
			System.out.println("A등급 입니다.");
			// if 조건식을 만족할 때 실행 될 구문
		} else if (score >= 80 && score < 90) {
			System.out.println("B등급 입니다.");
			// 그밖의 if 조건식을 만족할 때 실행 될 구문
		} else if (score >= 70 && score < 80) {
			System.out.println("C등급 입니다.");
		} else if (score >= 60 && score < 70) {
			System.out.println("D등급 입니다.");
		} else if (score >= 0 && score < 60) {
			System.out.println("F등급 입니다.");
		} else {
			System.out.println("다시 입력해주세요.");
		} // 위의 if조건식들을 모두 만족하지 않았을 때 실행될 구문

		sc.close();
	}

}
