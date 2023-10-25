package array;

import java.util.Scanner;

public class Prac01_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total=0;
		int [] score;
		score = new int[5];
		
		for(int i=0; i < score.length; i++) {
			System.out.print(i+1+"번 학생의 점수를 입력: ");
			score[i] = sc.nextInt();
			
			total += score[i];
		}
			System.out.print("총점: "+total+", 평균: "+total/score.length);
		
		sc.close();
	}	
}
		