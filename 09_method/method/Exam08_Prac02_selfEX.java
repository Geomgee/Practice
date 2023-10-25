package method;

import java.util.Scanner;

public class Exam08_Prac02_selfEX {
	// 배열을 활용
	// score subject sum avg 점수를 입력받고 총합, 평균을 구해서 등급을 출력
	static Scanner sc = new Scanner(System.in);
	
	static int[] score = new int[2];
	static String[] subject = { "국어", "영어" };
	static double sum, avg;

	// 점수를 입력 받으면서 총합을 구하는 함수
	static double getSum() {
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i]+"점수 입력 : ");
			score[i] = sc.nextInt();
			sum+= score[i];
		}
		return sum;
	}
	
	//평균을 구하는 함수
	static double getAvg(double sum) {
		avg = sum / subject.length;
		return avg;
	}
	//등급을 구하는 함수
	static void getGrade(double avg) {
		switch((int)(avg/10)) {
		case 10 :
		case 9 :
			System.out.println("A학점 입니다.");
			break;
		case 8 :
			System.out.println("B학점 입니다.");
			break;
		case 7 :
			System.out.println("C학점 입니다.");
			break;
		case 6 :
			System.out.println("D학점 입니다.");
			break;
		default :
			System.out.println("F학점입니다.");
			break;
		}
	}
	
	// 실행 구문
	public static void main(String[] args) {
		sum = getSum();
		avg = getAvg(sum);
		getGrade(avg);
	}
}
