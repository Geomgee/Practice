package method;

import java.util.Scanner;

public class Review01S {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNum = 0, balance = 0; //menuNum 변호 선택, balance 잔고액
		
		do{
			menuNum = selectMenu(sc);
			
			switch(menuNum) {
			case 1:	balance = deposit(sc, balance); break;
			case 2:	balance = withdrawal(sc, balance); break;
			case 3: output(balance); break;
			case 4: exit(sc); break;
			default : System.out.println("다시 입력하세요. (1~4)");
			}
			
		} while(true);
		
	}

	// 메뉴를 선택하는 함수
	static int selectMenu(Scanner sc) {
		System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
		System.out.print("번호 선택 : ");
		return sc.nextInt();
	}

	// 종료 식의 함수
	static void exit(Scanner sc) {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
		System.exit(0);
	}

	// 예금 식의 함수
	static int deposit(Scanner sc, int balance) {
		int deposit = 0;
		System.out.print("예금액 : ");
		deposit = sc.nextInt();
		balance += deposit;
		return balance;
	}

	// 출금 식의 함수
	static int withdrawal(Scanner sc, int balance) {
		int withdrawal = 0;
		System.out.print("출금액 : ");
		withdrawal = sc.nextInt();
		if(withdrawal > balance) { // (balance-withdrawal) < 0 으로 해도 가능!
			System.out.println("출금액이 잔고액보다 많습니다.");
		} else {
			balance -= withdrawal;
		}
		return balance;
	}

	// 잔고 식의 함수
	public static void output(int balance) {
		System.out.println("잔고액: " + balance);
		System.out.println();
	}

}