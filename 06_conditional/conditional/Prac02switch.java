package conditional;

import java.util.Scanner;

public class Prac02switch {

	public static void main(String[] args) {
		// switch
		Scanner sc = new Scanner(System.in);

		int kor, eng, sum;
		double avg;
		char grade;

		System.out.print("국어점수 입력 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();

		System.out.println();
		sum = kor + eng;
		System.out.println("총점 = " + sum);
		avg = sum / 2;
		System.out.printf("평균 = %.1f", avg);

		System.out.println();

		switch ((int) avg / 10) {
		case 10:
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default : grade = 'F';
		}
		System.out.print("학점 = "+grade);
		
		sc.close();
	}
}
