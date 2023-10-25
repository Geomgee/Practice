package geomji_java;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		//사용자에게 값을 입력받아서 활용하는 예제
		Scanner sc = new Scanner(System.in); //scanner 객체 생성
		
		//1.변수 선언
		int num1, num2;
		double num3;
		
		//2.사용자에게 값을 입력받음
		System.out.println("정수를 하나 입력하세요.");
		num1=sc.nextInt();
		System.out.println("정수를 하나 더 입력하세요.");
		num2=sc.nextInt();
		System.out.println("실수를 하나 입력하세요.");
		num3=sc.nextDouble();
		
		//3.연산 후 출력
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		System.out.println("--------");
		
		System.out.println(num1+num3);
		System.out.println(num1-num3);
		System.out.println(num1*num3);
		System.out.println(num1/num3);
		System.out.println(num1%num3);
		System.out.println("--------");
		System.out.println(7.7/2.555);
		System.out.println(7.7%2.555); //나머지 계산은 정수만 사용한다! => 데이터 값이 오차로 인하여 틀린 값이 나온
		
		sc.close();
	}

}
