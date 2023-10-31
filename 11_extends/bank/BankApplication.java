package bank;

import java.util.Scanner;

public class BankApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		while (true) {
			num = Account.menu(sc);
			switch (num) {
			case 1:
				Account ac = new Account();
				ac.makeAccount(sc, ac);
				break;
			case 2:
				Account.showAccountList();
				break;
			case 3:
				Account.deposit(sc);
				break;
			case 4:
				Account.withdraw(sc);
				break;
			case 5:
				Account.exitProgram(sc);
			}
		}

	}
}
