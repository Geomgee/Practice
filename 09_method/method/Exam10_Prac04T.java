package method;

import java.util.Scanner;

public class Exam10_Prac04T {
	static Scanner sc = new Scanner(System.in);
	private static int input_dan;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			//메뉴를 입력받는 함수
			int dan = input_dan(sc);
			
			//구구단 출력하는 함수
			disp_gugudan(dan);
			
			//계속할 건지 물어보기 
			char answer = input_y(sc);

			//y가 아닌 다른 문자열을 입력하면 종료하는 함수
			exit(sc, answer);
			
		}while(true);

	}

	// 사용자에게 몇 단을 출력할 지 입력받는 함수 inputDan()
	static int input_dan(Scanner sc) {
		System.out.print("몇 단? : ");
		int dan = sc.nextInt();
		return dan;
	}

	// 구구단을 출력하는 함수
	static void disp_gugudan(int dan) {
		for(int i = 1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = "+dan*i);
		}
	}

	// 계속 할 지 선택하는 함수 input_y()
	static char input_y (Scanner sc) {
		System.out.print("계속 하시려면 y를 입력하세요 : ");
		char answer = sc.next().charAt(0);
		return answer;
	}

	// 종료하는 함수 exit()
	static void exit (Scanner sc, char answer) {
		if(!(answer == 'y'|| answer == 'Y')) {
			System.out.println("빠이");
			sc.close();
			System.exit(0);
		}
	}
}