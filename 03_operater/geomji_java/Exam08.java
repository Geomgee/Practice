package geomji_java;

import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1, num2, result;
		System.out.print("정수 1개 입력 : ");
		num1 = sc.nextInt();
		System.out.print("크기로 비교하기 위한 정수 1개 입력 : ");
		num2 = sc.nextInt();
//
//		if (num1 > num2) {
//			System.out.println("첫번째 입력값이 두번째 입력값이 더 큽니다.");
//		}else {
//			System.out.println("첫번째 입력값이 두번째 입력값과 같거나 작습니다.");
//
//		}
		//////
		// 삼황 연산자
		result = (num1 > num2) ? num1 : num2;
		System.out.println("둘 중에 큰 수는 " + result + "입니다.");
		
	}
}
