package method;

import java.util.Scanner;

public class Exam07_doubleNumEX_T {
	// 배수 여부를 확인하는 클래스
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1=0, num2=0;
		System.out.print("정수 입력 : ");
		num1= sc.nextInt();
		System.out.print("정수 입력 : ");
		num2= sc.nextInt();
		
		
		Exam07_doubleNum_T doubleNum_T = new Exam07_doubleNum_T();
		
		boolean result = doubleNum_T.dNum(num1,num2);
		if(result) {
			System.out.println(num1+"(은)는 "+num2+"의 배수 입니다.");
		} else {
			System.out.println(num1+"(은)는 "+num2+"의 배수가 아닙니다.");
		}
		
		sc.close();
	}
}
