package array;

import java.util.Arrays;
import java.util.Scanner;

public class Prac02_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		System.out.println(Arrays.toString(scores));

		int[] rank = null;
		System.out.println(Arrays.toString(rank));
		
		rank = new int[5];
		System.out.println(Arrays.toString(rank));
		
		//각 학생의 점수를 입력
		for(int i=0; i<scores.length; i++) {
			System.out.print((i+1)+"번 점수 입력: ");
			scores[i] = sc.nextInt();
			rank[i]=1;
		}
		System.out.println(Arrays.toString(scores));
		
		System.out.println("*** 결과 ***");
		//등수 구하기
		for(int i = 0; i < scores.length; i++) { //기준값
			for(int j = 0; j < scores.length; j++) {//비교값
				if(scores[i] < scores[j]) rank[i] += 1; 
				}
				System.out.println(scores[i]+"점: "+rank[i]+"등");
			}
		sc.close();
	}
}
