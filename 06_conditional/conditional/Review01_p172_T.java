package conditional;

import java.util.Scanner;

public class Review01_p172_T {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
		double mids=0, finals=0, report=0, present=0, avg=0;
		char grade = 0;
		String result = ""; 
		
		System.out.print("중간고사를 입력하시오 : "); //30%
		mids = sc.nextDouble();
		System.out.print("기말고사를 입력하시오 : "); //30%
		finals = sc.nextDouble();
		System.out.print("과제점수를 입력하시오 : "); //20%
		report = sc.nextDouble();
		System.out.print("출석점수를 입력하시오 : "); //20%
		present = sc.nextDouble();
		
		//연산
		avg = (mids + finals)/2*0.6+(report+present)/2*0.4;
				
				
		//if 구문으로 학점 구하기
		if ((avg>=90) || (avg<100)) grade = 'A';
		else if(avg>=80) grade = 'B';
		else if(avg>=70) grade = 'C';
		else if(avg>=60) grade = 'D';
		else if((avg>0)||(avg>=50))
			grade = 'F';
		else System.out.println("다시 입력하세요!");
		
		
		
		//result 평가 구하기
		if(grade == 'A' || grade == 'B') result = "excellent";
		}else if (grade == 'C' || grade == 'D') result = "good";
		}else (grade == 'F') result = "Poor";
		
		
		System.out.println("성적 = "+avg);
		System.out.println("학점 = "+grade);
		System.out.println("평가 = "+result);
//		System.out.printf("학점 = %c\n평가 =%s", grade, result);
		
	sc.close();
	}
}
