package conditional;

import java.util.Scanner;

public class Review01_p169_switch2_T {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
		
		char operator;
		double num1, num2, result=0;
		
		System.out.print("첫번째 수 : ");
		num1 = sc.nextDouble();
		System.out.print("두번째 수 : ");
		num2 = sc.nextDouble();
		System.out.print("연산자 : ");
		operator = sc.next().charAt(0);
		
		sc.close();
		
		switch(operator) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '/' : result = num1 / num2; break;
		case '*' : result = num1 * num2; break;
		case '%' : result = num1 % num2; break;
		default : System.out.println("연산자를 정확히 입력해주세요");
		}
		
		System.out.println(num1 +""+ operator +""+ num2 +"="+ result);
		
			
	}
}
