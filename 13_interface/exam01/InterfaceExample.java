package exam01;

import java.util.Scanner;

public class InterfaceExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100의 범위 안에서 정수를 입력하세요");

		int num = sc.nextInt();
		if (num < Limit.MIN || num > Limit.MAX) {
			System.out.println("유효 범위를 벗어납니다.");
		} else if (num <= Limit.MAX && num >= Limit.MIN) {
			System.out.println("유효한 숫자임다.");
		}
		sc.close();
	}

}
