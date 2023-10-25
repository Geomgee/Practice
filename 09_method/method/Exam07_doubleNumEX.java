package method;

import java.util.Scanner;

public class Exam07_doubleNumEX {
	//배수 여부를 확인하는 클래스
	Exam07_doubleNum multiple = new Exam07_doubleNum();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		if(multiple == 0) {
			System.out.println(a+"(은)는 "+b+"의 배수입니다");
		} else {
			System.out.println(a+"(은)는 "+b+"의 배수가 아닙니다");
		}
	}
}
