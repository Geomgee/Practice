package method;

import java.util.Scanner;

public class Review01{
	static Scanner sc = new Scanner(System.in);
	static int select, balanceV, savingV, withdrawalV;
	
	// 예금 식의 함수
	public static void saving() {
		System.out.print("예금액: "); 
		balanceV += sc.nextInt(); 
		System.out.println();
	}
	
	// 출금 식의 함수
	public static void withdrawal() {
		System.out.print("출금액: ");
		
		withdrawalV = sc.nextInt(); 
		if (balanceV < withdrawalV) {
			System.out.println("출금 실패  error: 잔액 부족");
		}else {
			balanceV -= withdrawalV;
		}
		System.out.println();
	}
	
	// 잔고 식의 함수
	public static void balance() {
		System.out.println("잔고액: "+balanceV);
		System.out.println();
	}
	
	// 종료 식의 함수
	public static void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	//출력 값을 받는 함수
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.print("번호 선택: ");
			select = sc.nextInt();

			switch(select) {
				case 1 : 
					saving(); break;
				case 2 : 
					withdrawal(); break;
				case 3 : 
					balance(); break;
				case 4 :
					exit();
				default : 
					System.out.println("다시 입력하세요.");
					break;
			}
		}
	}
}