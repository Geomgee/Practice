package conditional;

import java.util.Scanner;

public class Review01_p169_if_T {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	//메소드 안의 변수는 개발자가 초기화 시켜주어야 한다!
		
		char operator;
		double num1=0, num2=0,result=0;
		
		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		System.out.print("연산자 : ");
		operator = sc.next().charAt(0);
		
		//연산
		if(operator == '+') result = num1+num2;
		else if(operator == '-') result = num1-num2;
		else if(operator == '/') result = num1/num2;
		else if(operator == '*') result = num1*num2;
		else if(operator == '%') result = num1%num2;
		else System.out.println("연산자를 정확히 입력해주세요");
		
		sc.close();

	
		//출력
		System.out.println(num1 +""+ operator +""+ num2 +"="+ result);
			
	}
}
