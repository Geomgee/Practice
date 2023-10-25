package repeat;

import java.util.Scanner;

public class SelfEX_page188_diceRandom {
	public static void main(String[] args) {
		
		while(true) {
		int num1 = 0, num2=0;
		num1 = (int)(Math.random()*6)+1; // 0~1까지의 실수를 랜덤하게 출력해주는 함수
		num2 = (int)(Math.random()*6)+1; // 0~1까지의 실수를 랜덤하게 출력해주는 함수
		
		System.out.println(num1+","+num2);
		
		if(num1+num2==5) break;
		}
	}
}