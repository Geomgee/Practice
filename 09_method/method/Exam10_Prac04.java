package method;

import java.util.Scanner;

public class Exam10_Prac04 {
	static Scanner sc = new Scanner(System.in);
	private static int input_dan;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = 0;
		
		do {
			input_dan(sc);
			disp_gugudan(input_dan); 
			input_y(sc);
			switch(input_y) {
			case y :
			}
			if(input.equals("y" || "Y");)){
				exit(sc);
			}
		} while (true);

	}

	// 사용자에게 몇 단을 출력할 지 입력받는 함수 inputDan()
	static int input_dan(Scanner sc) {
		System.out.println("몇 단? : ");
		int dan = sc.nextInt();
		return dan;
	}

	// 구구단을 출력하는 함수
	static int disp_gugudan(int input_dan) {
		int result = 0;
		for(int i = 0; i<=10; i++) {
			result = dan * i;
			System.out.println(dan + "*" + i + "= result");
		}
	}

	// 계속 할 지 선택하는 함수 input()
	static char input_y(Scanner sc) {
		System.out.println("계속 하시려면 y를 입력하세요");
		char input = sc.next().charAt(0);
		if input.equals('y'||'Y'){
			
		}
		return input;
	}

	// 종료하는 함수 exit()
	static void exit(Scanner sc) {
		System.out.println("빠이");
		sc.close();
		System.exit(0);
	}
}