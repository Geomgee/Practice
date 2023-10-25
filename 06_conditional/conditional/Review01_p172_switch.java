package conditional;

import java.util.Scanner;

public class Review01_p172_switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double mids, finals, report, present, avg;
		char grade = 0;
		String result = "";

		System.out.print("중간고사를 입력하시오 : ");
		mids = sc.nextDouble();
		System.out.print("기말고사를 입력하시오 : ");
		finals = sc.nextDouble();
		System.out.print("과제점수를 입력하시오 : ");
		report = sc.nextDouble();
		System.out.print("출석점수를 입력하시오 : ");
		present = sc.nextDouble();

		avg = (mids + finals + report + present) / 4;
		System.out.printf("성적 = %.2f", avg);

		switch ((int) (avg / 10)) {
		case 9:	grade = 'A'; break;
		case 8:	grade = 'B'; break;
		case 7:	grade = 'C'; break;
		case 6:	grade = 'D'; break;
		default : grade = 'F';
		}

		switch (grade) {
		case 'A':
		case 'B':
			result = "excellent";
			break;
		case 'C':
		case 'D':
			result = "good";
			break;
		default:
			result = "poor";
		}

		System.out.println();
		System.out.printf("학점 = %c\n평가 =%s", grade, result);

		sc.close();
	}
}
