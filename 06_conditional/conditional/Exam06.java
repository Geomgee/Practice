package conditional;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		// switch 구문연습
		Scanner sc = new Scanner(System.in);

		// 1. 변수 선언
		int midExam = 0; // 중간고사 30%
		int finalExam = 0; // 기말고사 30%
		int report = 0; // 레포트 20%
		int present = 0; // 출석 20%
		double avg = 0; // 평균
		char grade = 0; // 학점 (A,B,C,D,F)
		String result = "";// 최종 평가 (Excellent[A,B], good[C,D], poor[F]

		// 입력
		System.out.println("중간고사 점수: ");
		midExam = sc.nextInt();
		System.out.println("기말고사 점수: ");
		finalExam = sc.nextInt();
		System.out.println("레포트 점수: ");
		report = sc.nextInt();
		System.out.println("출석 점수: ");
		present = sc.nextInt();

		// 연산
		avg = ((midExam + finalExam) / 2 * 0.6 + (report + present) / 2 * 0.4);

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}

		// 최종 평가 점수를 switch 조건문으로 구하기
		switch (grade) {
		case 'A':
		case 'B':
			result = "Excellent🎉🎉";
			break;
		case 'C':
		case 'D':
			result = "Good";
			break;
		case 'F':
			result = "Poor😣";
			break;
		}

		// 결과 출력
//		System.out.println(grade);
//		System.out.println(result);
		System.out.printf("학점은 %s학점이고 최종평가는 %s입니다", grade, result);

		sc.close();
	}

}
