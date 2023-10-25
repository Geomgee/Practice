package repeat;

import java.util.Scanner;

public class Prac03_T {
	public static void main(String[] args) {
		//사용자에게 1~100의 수 중에서 원하는 수를 입력 받고, 배수의 개수를 구해서 출력
		Scanner sc = new Scanner(System.in);
		
		//변수 선언
		int want=0;
		char answer = null;
		
		//사용자의 값 받기
		do{
			System.out.print("몇 단을 출력할 지 입력하세요: ");
			want = sc.nextInt();
		
		//연산
			for(int a=2 ; a<=99; a++) {
				for(int b=1; b<=9; b++) {
					a = want;
					System.out.println(a+"x"+b+"="+a*b);
				} 
			}		
		} while(answer = 'y');
		sc.close();
	}

}
