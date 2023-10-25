package repeat;

import java.util.Scanner;

public class Prac02 {
	public static void main(String[] args) {
		//사용자에게 1~100의 수 중에서 원하는 수를 입력 받고, 배수의 개수를 구해서 출력
		
		//변수 선언
		int sum=0;
		
		
		//연산
		for(int i=1; i<=100; i++) {
			sum +=i; 
			if(i%10==0) {
				System.out.println(i-9+"~"+i+" = "+sum);
				sum=0;
			}
		}
	}
}
