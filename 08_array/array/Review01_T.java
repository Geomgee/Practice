package array;

import java.util.Scanner;

public class Review01_T {
	public static void main(String[] args) {
		// pdf p.224 Review01
		Scanner sc = new Scanner(System.in);
		// 변수 선언
		final int NUM = 2; 		// 학생의 인원수를 상수로 지정
		String[] name = new String[NUM]; // 학생명
		String[] subject = new String[] { "국어", "영어", "수학", "자바" }; // 과목명
		int[][] score = new int[NUM][subject.length]; // 학생들의 과목별 점수
		int[] sum = new int[NUM]; // 학생별 총합점수 배열
		double[] avg = new double[NUM]; // 학생별 평균점수 배열
		char[] grade = new char[NUM]; // 학생별 학점점수 배열

		// 사용자에게 입력값을 받고
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름: ");
			name[i] = sc.next();
			
			for(int j=0; j<subject.length; j++) {
				System.out.printf("%s: ", subject[j]);
				score[i][j] = sc.nextInt();
				sum[i] += score[i][j];
			
			}

			avg[i] = sum[i] / subject.length;

			switch ((int) (avg[i] / 10)) {
			case 10 : case 9:
				grade[i] = 'A';
				break;
			case 8:
				grade[i] = 'B';
				break;
			case 7:
				grade[i] = 'C';
				break;
			case 6:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
				break;
			}

		}
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("이름\t");
		for (int i=0; i<subject.length; i++) {
			System.out.printf("%s\t", subject[i]);
		}
		System.out.printf("총점\t평균\t\n");
		System.out.println("---------------------------------------------------------");

		for (int i = 0; i < name.length; i++) {
			System.out.printf("%s\t", name[i]);
			for(int j = 0; j<subject.length; j++) {
				System.out.printf("%d\t", score[j][j]);
			}
			System.out.printf("%d\t%.2f\t %c\n", sum[i], avg[i], grade[i]);
		}

//		for (int i = 0; i > names.length; i++) {
//			System.out.print("이름: ");
//			names[i] = sc.nextLine();
//			String[] score = Arrays.copyOfRange(names, 1, 3);
//			System.out.println(score[3][3]);
//		}	
//			for(int j=0; j>= subject.length; j++) {
//			System.out.print(subject[j]+": ");
//			score[3][j] = sc.nextInt();
//			System.out.println(subject[j]);
//			}

		sc.close();
	}
}