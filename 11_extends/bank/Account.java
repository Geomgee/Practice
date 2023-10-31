package bank;

import java.util.Scanner;

public class Account {
	Scanner sc = new Scanner(System.in);

	String accountNum; // 계좌번호
	String name; // 계좌주
	int balance; // 잔고
	static Account[] accountList = new Account[100]; // 총 계좌수
	static int count = 0; // 신규가입 멤버 수

	static int menu(Scanner sc) {
		int num;
		System.out.println("-----------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("-----------------------------------------------");
		System.out.print("선택> ");
		num = sc.nextInt();
		sc.skip("\r\n"); // 캐리지 리턴 : 엔터를 친 값
		return num;
	}

	// 5. 프로그램 종료
	static void exitProgram(Scanner sc) {
		System.out.println("프로그램 종료");
		sc.close();
		System.exit(0);
	}

	// 1. 계좌 생성
	void makeAccount(Scanner sc, Account ac) {
		System.out.println("------\n계좌생성\n------");
		System.out.print("계좌번호 : ");
		ac.accountNum = sc.nextLine();
		System.out.print("계좌주 : ");
		ac.name = sc.nextLine();
		System.out.print("초기 입금액 : ");
		ac.balance = sc.nextInt();

		if (count > 0) {
			int checkCount = 0;
			for (int i = 0; i < count; i++) {
				if (accountList[i].accountNum.equals(ac.accountNum)) {
					System.out.println("이미 존재하는 계좌번호 입니다. 다른 계좌번호를 입력해주세요");
					break;
				} else if (!(accountList[i].accountNum.equals(ac.accountNum))) {
					checkCount++;
					if (checkCount == count)
						System.out.println("결과 : 계좌가 생성 되었습니다.");
					accountList[count] = ac;
					count++;
					break;
				}
			}
		} else { // count가 0일 때
			accountList[count] = ac;
			System.out.println("결과 : 계좌가 생성 되었습니다.");
			count++;
		}
	}

	// 2. 계좌 목록 보여주기
	static void showAccountList() {
		if (count > 0) {
			System.out.println("------\n계좌목록\n------");

			for (int i = 0; i < count; i++) {
				System.out.printf("%s\t%s\t%d\n", accountList[i].accountNum, accountList[i].name,
						accountList[i].balance);
			}
		} else {
			System.out.println("개설된 계좌가 없습니다.");
		}
	}

	// 3. 예금
	static void deposit(Scanner sc) {
		int deposit = 0; // 입력한 예금액
		String accountNum = ""; // 입력한 계좌번호
		System.out.println("------\n계좌목록\n------");
		System.out.print("계좌번호 : ");
		accountNum = sc.nextLine();
		System.out.print("예금액 : ");
		deposit = sc.nextInt();

		if (count > 0) {
			int checkCount = 0;
			for (int i = 0; i < count; i++) {
				if (accountList[i].accountNum.equals(accountNum)) {
					accountList[i].balance += deposit;
					System.out.println(deposit + "원을 입금합니다.");
					System.out.println("남은 잔액은 " + accountList[i].balance + "원 입니다.");
				} else if (!(accountList[i].accountNum.equals(accountNum))) {
					checkCount++;
					if (checkCount == count) {
						System.out.println("해당 계좌는 잘못된 계좌입니다. 다시 입력해주세요.");
					}
				}
			}

		} else {
			System.out.println("개설된 계좌가 없습니다.");
		}
	}

	// 4. 출금
	static void withdraw(Scanner sc) {
		int withdraw = 0; // 입력한 출금액
		String accountNum = ""; // 입력한 계좌번호
		System.out.println("------\n계좌목록\n------");
		System.out.print("계좌번호 : ");
		accountNum = sc.nextLine();
		System.out.print("출금액 : ");
		withdraw = sc.nextInt();

		if (count > 0) {
			int checkCount = 0;
			for (int i = 0; i < count; i++) {
				if (accountList[i].accountNum.equals(accountNum)) {
					if (accountList[i].balance < withdraw) {
						System.out.println("잔액이 부족합니다. 다시 시도해 주세요");
					} else {

						accountList[i].balance -= withdraw;
						System.out.println(withdraw + "원을 출금합니다.");
						System.out.println("남은 잔액은 " + accountList[i].balance + "원 입니다.");
					}
				} else if (!(accountList[i].accountNum.equals(accountNum))) {
					checkCount++;
					if (checkCount == count) {
						System.out.println("해당 계좌는 잘못된 계좌입니다. 다시 입력해주세요.");
					}
				}
			}

		} else {
			System.out.println("개설된 계좌가 없습니다.");
		}
	}
}
