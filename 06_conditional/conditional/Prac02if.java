package conditional;

import java.util.Scanner;

public class Prac02if {

	public static void main(String[] args) {
		//if
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, sum;
		double avg;
		char grade;
		
		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();
		
		System.out.println();
		sum = kor+eng;
		System.out.println("총점 = "+sum);
		avg = sum/2;
		System.out.printf("평균 = %.1f",avg);
		
		System.out.println();
		
//		if(( 0 > sum ) || (sum > 200)){
//			System.out.println("뭔가 잘못 됐다. 다시 해보자");
//		}
//		else if(avg>=90) {
//			System.out.println("학점 = A");
//		}
//		else if(avg>=80){
//			System.out.println("학점 = B");
//		}
//		else if(avg>=70){
//			System.out.println("학점 = C");
//		}
//		else if(avg>=60){
//			System.out.println("학점 = D");
//		}
//		else if(avg<60){
//			System.out.println("학점 = F");
//		}
//		
		if(( 0 > sum ) || (sum > 200)) grade = 'X';
		else if(avg>=90) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=60) grade = 'D';
		else grade = 'F';
		
		System.out.println("학점 = "+grade);
		
		sc.close();
	}
}
