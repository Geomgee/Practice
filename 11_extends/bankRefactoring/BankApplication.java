package bankRefactoring;

import java.util.Scanner;

public class BankApplication {

	private static Scanner sc = new Scanner(System.in);
	private static Account[] acList = new Account[100];
	static int cnt = 0;

	public static void main(String[] args) {
		int num;

		while (true) {
			num = menu();

			switch (num) {
			case 1:
				makeAccount();
				break;
			case 2:
				showAcList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				exitProgram();
			}
		}
	}

	// 내부구조 개선 => 리팩토링
	static void syso(String s) {
		System.out.print(s);
	}

	static int menu() {
		System.out.println("--------------------------------");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("--------------------------------");
		System.out.print("선택>");
		int num = sc.nextInt();
//      if (num < 6) {

//      } else if (!(num < 6)) {
//         System.out.println("없는 메뉴번호입니다. 다시 입력해주세요.");
//      } else if (((Object) num).getClass().getTypeName().equals("java.lang.String")) {
//         System.out.println(((Object) num).getClass().getTypeName());
//         System.out.println("문자가 아닌 숫자로 입력해주세요.");
//      } else if (((Object) num).getClass().getTypeName().equals("java.lang.Double")) {
//         System.out.println(((Object) num).getClass().getTypeName());
//         System.out.println("1-5 사이의 정수를 입력해주세요.");
//      }

		sc.skip("\r\n");
//      
		return num;
	}

	// 1번 선택시 계좌생성(매개변수 없는 메소드를 사용하는 경우)
	static void makeAccount() {
		syso("------\n계좌생성------\n");
		syso("계좌번호 : ");
		String acNum = sc.nextLine();
		syso("계좌주 : ");
		String name = sc.nextLine();
		syso("초기입금액 : ");
		int balance = Integer.parseInt(sc.nextLine());

		Account ac = new Account(acNum, name, balance);

		if (cnt > 0) { // 계좌 생성 카운팅이 0 이 넘으면
			int chkCnt = 0;
			for (int i = 0; i < cnt; i++) { // for문을 돌릴거야 cnt 개수 만큼

				if (acList[i].getAcNum().equals(ac.getAcNum())) { // 배열 안 acNum이랑
					syso("이미 존재하는 계좌번호입니다. 다른 계좌번호를 입력해 주세요.\n");
					break;
				} else if (!(acList[i].getAcNum().equals(ac.getAcNum()))) {
					chkCnt++;
					if (chkCnt == cnt) {
						acList[i + 1] = ac;
						syso("2결과 : 계좌가 생성되었습니다.\n");
						cnt++;
						break;
						// return;
					}
				}
			}
		} else if (cnt > 99) {
			syso("더이상의 개좌생성이 불가능합니다.");
		} else {
			acList[0] = ac;
			syso("1결과 : 계좌가 생성되었습니다.\n");
			cnt++;
		}
//      syso("break확인용 test문구\n");
	}

	// 2번 선택시 계좌목록보기
	static void showAcList() {
		syso("------\n계좌목록------\n");
		if (cnt > 0) {
			for (int i = 0; i < cnt; i++) {
				System.out.println(i);
				Account ac = acList[i];
				System.out.println(ac.toString());
			}
		} else {
			syso("생성된 계좌목록이 없습니다.");
		}
	}

	// 배열에서 동일한 객체가 있는지 찾아서 리턴하는 기능
	static Account find(String acNum) {
		Account tempAc = null;
		for (int i = 0; i < cnt; i++) {
			if ((acList[i].getAcNum()).equals(acNum)) {
				tempAc = acList[i];
				break;
			}
		}
		return tempAc;
	}

	// 3번 선택시 예금
	static void deposit() {
		syso("------\n예금------\n");
		syso("계좌번호 : ");
		Account ac = find(sc.nextLine());
		if (ac != null) {
			syso("예금액 : ");
			int deposit = Integer.parseInt(sc.nextLine());
			ac.setBalance(ac.getBalance() + deposit);
			syso(deposit + "원을 입금합니다.\n");
			syso("남은 잔액은 " + ac.getBalance() + "원 입니다.\n");
		} else {
			syso("해당 번호로 개설된 계좌가 없습니다.\n");
		}
	}

	// 4번 선택시 출금
	static void withdraw() {
		syso("------\n출금------\n");
		syso("계좌번호 : ");
		Account ac = find(sc.nextLine());
		if (ac != null) {
			syso("출금액 : ");
			int withdraw = Integer.parseInt(sc.nextLine());
			int minusConfirm = ac.getBalance() - withdraw;
			if (minusConfirm < 0) {
				syso("통장의 잔액이 부족합니다.\n");
				return;

			} else {
				ac.setBalance(minusConfirm);
				syso(withdraw + "원을 출금합니다.\n");
			}
			syso("남은 잔액은 " + ac.getBalance() + "원 입니다.\n");
		} else {
			syso("해당 번호로 개설된 계좌가 없습니다.\n");
		}
	}

	// 5번 선택시 프로그램 종료
	static void exitProgram() {
		syso("프로그램 종료\n");
		sc.close();
		System.exit(0);
	}
}