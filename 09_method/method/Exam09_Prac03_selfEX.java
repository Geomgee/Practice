package method;

import java.util.Scanner;

public class Exam09_Prac03_selfEX {
	static Scanner sc = new Scanner(System.in);
	// 점수를 입력 받는 함수
	static int input, sum;
	static int[] score = new int[3];
	static double avg;
	static String[] subject = { "국어", "영어", "수학" };

	public static void input() {
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + " 점수 : ");
			score[i] = sc.nextInt();
		}
	}

	// 평균를 입력 받는 함수 getAvg()
	public static void getAvg() {
		for (int j = 0; j >= subject.length; j++) {
			sum += j;
		}
		avg = sum / subject.length;
	}

	// 합격을 입력받는 함수 getPass()
	public static void getPass(double avg) {
		for (int i = 0; i < subject.length; i++) {
			if ((score[i] > 40) && (avg > 60)) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
	}

	// 평균에 대한 합격 불합격 여부를 받는 함수 (평균 60점 이상 합격 / 과목 중 40점 미만인 과락이 없는)

	public static void main(String[] args) {
		// 과목별 점수 입력받고
		input();
		getAvg();
		getPass(avg);
		// 평균 구하는 함수 호출

		// 합격 여부 출력하기
	}
}