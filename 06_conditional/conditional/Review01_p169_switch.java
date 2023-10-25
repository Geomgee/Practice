package conditional;

import java.util.Scanner;

public class Review01_p169_switch {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
		String operator;
		double num1, num2, addResult, subResult, divResult, multiply, remainder, result=0;
		
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
		
		switch(operator) {
		case "+" : result = addResult; break;
		case "-" : result = subResult; break;
		case "/" : result = divResult; break;
		case "*" : result = multiply; break;
		case "%" : result = remainder; break;
		}
		
		System.out.printf("%.1f + %.1f = %.1f",num1,num2,result);
		
			
	sc.close();
	}
}
