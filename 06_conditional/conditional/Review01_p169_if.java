package conditional;

import java.util.Scanner;

public class Review01_p169_if {

	public static void main(String[] args) {
		// 1. if문 (if, if+else if, if+else if+else, if+else), 
//			switch문(조건문 안에는 byte, char, short, int 타입의 정수만 넣을 수 있다.
	Scanner sc = new Scanner (System.in);
		
		String operator;
		double num1, num2, addResult, subResult, divResult, multiply, remainder;
		
		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 : ");
		operator = sc.next();
		
		addResult = num1 + num2;
		subResult = num1 - num2;
		divResult = num1 / num2;
		multiply = num1 * num2;
		remainder = num1 % num2;
		
		if(operator.equals("+")) {
			System.out.printf("%.1f + %.1f = %.1f",num1,num2,addResult);
		
		}else if(operator.equals("-")){
			System.out.printf("%.1f - %.1f = %.1f",num1,num2,subResult);
			
		}else if(operator.equals("/")){
			System.out.printf("%.1f / %.1f = %.1f",num1,num2,divResult);
			
		}else if(operator.equals("*")){
			System.out.printf("%.1f * %.1f = %.1f",num1,num2,multiply);
			
		}else if(operator.equals("%")){
			System.out.printf("%.1f %% %.1f = %.1f",num1,num2,remainder);
			
		}else {
			System.out.println("아직 제가 모르는 연산이예요.");
		}
			
	sc.close();
	}
}
