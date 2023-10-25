package repeat;

import java.util.Scanner;

public class Prac05_doWhile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//사용자에게 입력받을 정수를 담을 변수 선언
		int key=0;
		
		while(true) {
			
			System.out.println("**************");
			System.out.println("1. 입력\n2. 검색\n3. 삭제\n4. 종료");
			System.out.println("**************");
			System.out.println("번호 선택: ");
			key = sc.nextInt();
			
			if(key==4) break;
			
			switch(key) {
			case 1: System.out.println("입력을 선택하였습니다."); break;
			case 2: System.out.println("검색을 선택하였습니다."); break;
			case 3: System.out.println("삭제를 선택하였습니다."); break;
//			case 4: System.out.println("프로그램을 종료합니다."); System.exit(0);
		

			}
			System.out.println("프로그램을 종료합니다.");
		}
	}
}