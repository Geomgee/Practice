package conditional;

import java.util.Scanner;

public class Review01_p172_if {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
		double mids, finals, report, present, avg;
		char grade = 0;
		String result=""; 
		
		System.out.print("중간고사를 입력하시오 : ");
		mids = sc.nextDouble();
		System.out.print("기말고사를 입력하시오 : ");
		finals = sc.nextDouble();
		System.out.print("과제점수를 입력하시오 : ");
		report = sc.nextDouble();
		System.out.print("출석점수를 입력하시오 : ");
		present = sc.nextDouble();
		
		avg = (mids+finals+report+present)/4;
		System.out.printf("성적 = %.2f",avg);
		
		if ((avg>=90) || (avg<100)){
			grade = 'A';
		}else if(avg>=80){
			grade = 'B';
		}else if(avg>=70){
			grade = 'C';
		}else if(avg>=60){
			grade = 'D';
		}else if((avg>0)||(avg>=50)){
			grade = 'F';
		}else{
			System.out.println("다시 입력하세요!");
		}
		
		if(grade == 'A'){
			result = "excellent";
		}else if (grade == 'B') {
			result = "excellent";
		}else if (grade == 'C') {
			result = "good";
		}else if (grade == 'D') {
			result = "good";
		}else {
			result = "Poor";
		}
		System.out.println();
		System.out.printf("학점 = %c\n평가 =%s",grade,result);
		
	sc.close();
	}
}
