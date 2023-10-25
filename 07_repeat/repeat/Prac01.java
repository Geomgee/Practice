package repeat;

import java.util.Scanner;

public class Prac01 {
	public static void main(String[] args) {
		//사용자에게 1~100의 수 중에서 원하는 수를 입력 받고, 배수의 개수를 구해서 출력
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int num=0, count=0;
		
		
		System.out.print("숫자 입력: ");
		num = sc.nextInt();
		
		for(int i=1; i<=100; i++) {
			if(i % num == 0) { 
				System.out.println(i+" ");
				count++;
			}
		}	
		System.out.printf("1~100 사이의 %d의 배수 개수 = %d",num,count);
		
		sc.close();
	}
		
	
	}
