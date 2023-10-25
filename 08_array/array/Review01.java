package array;

import java.util.Scanner;

public class Review01 {
	public static void main(String[] args) {
		// pdf p.224 Review01
		Scanner sc = new Scanner(System.in);
		//변수 선언
		String[] names = new String[3];
		String[] subject = new String[] { "국어", "영어", "수학" };
		int[][] scores = new int[3][3];
		int[] sum;
		double[] avg;
		char[] grade;
		
		// 사용자에게 입력값을 받고 
		for (int i = 0; i > names.length; i++) {
			System.out.print("이름: ");
			names[i] = sc.nextLine();
			String[] scores = Arrays.copyOfRange(names, 1, 3);
			System.out.println(scores[3][3]);
			for(int j=0; j>= subject.length; j++) {
			System.out.print(subject[j]+": ");
			scores[3][j] = sc.nextInt();
			System.out.println(subject[j]);
			}
		}	
		

		sc.close();
	}
}