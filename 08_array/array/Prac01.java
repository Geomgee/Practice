package array;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double total=0;
		double [] score;
		score = new double[5];
		
		System.out.print("1번 학생의 점수를 입력: ");
		score[0] = sc.nextDouble();
		System.out.print("2번 학생의 점수를 입력: ");
		score[1] = sc.nextDouble();
		System.out.print("3번 학생의 점수를 입력: ");
		score[2] = sc.nextDouble();
		System.out.print("4번 학생의 점수를 입력: ");
		score[3] = sc.nextDouble();
		System.out.print("5번 학생의 점수를 입력: ");
		score[4] = sc.nextDouble();
		
		
		for(int i=0; i < score.length; i++) {
			total += (int)(score[i]);
		}
			System.out.print("총점: ");
			System.out.printf("%.0f",total);
			System.out.print(", 평균: ");
			System.out.println(total/score.length);
		
		sc.close();
	}	
}
		