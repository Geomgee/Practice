package array;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] score;
		int high = 0;
		score = new int[5];
		String rank[] = {"1등","2등","3등","4등","5등"};
		
		
//		System.out.print("1번 점수 입력: ");
//		score[0] = sc.nextInt();
//		System.out.print("2번 점수 입력: ");
//		score[1] = sc.nextInt();
//		System.out.print("3번 점수 입력: ");
//		score[2] = sc.nextInt();
//		System.out.print("4번 점수 입력: ");
//		score[3] = sc.nextInt();
//		System.out.print("5번 점수 입력: ");
//		score[4] = sc.nextInt();
		
		for(int i = 0; i<score.length; i++) {
			System.out.print((i+1)+"번 점수 입력: ");
			score[i] = sc.nextInt();
		}
		
		System.out.println("*** 결과 ***");
	
		for(int i = 0; i<score.length; i++) {
			for(int j = i+1; j<score.length; j++) {
				if(score[i]<score[j]) {
					high=score[i];
					score[i]=score[j];
					score[j]=high;
				}
			}
		}
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]+": "+(i+1)+"등");
		}
		
		sc.close();
	}
}
