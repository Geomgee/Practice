package conditional;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("자바 점수 입력:");
		int score = sc.nextInt();
		String result = "" ;
			
//		if(score>=90) result = "A학점";
//		else if(score>=80) result = "B학점";
//		else if(score>=70) result = "C학점";
//		else if(score>=60) result = "D학점";
//		else result = "F학점";
		
		//삼항 연산자의 활용
		result=(score>100)? "제대로 입력하세요." :(score>=90)? "A학점" : (score>=80)? "B학점" : (score>=70)? "C학점" : (score>=60)? "D학점" :  "F학점" ;
		
		
		System.out.println("학점 = "+result);
		
		
		sc.close();
	}

}
