package customer;

public class Practice {
	public static void main(String[] args) {
		CustomerFunctions cs = new CustomerFunctions();

		int num = 0;
		while (true) {
			do {
				num = cs.menu();
			} while (num < 1 || num > 8);

			switch (num) {
			case 1:
				cs.input();
				break;
			case 2:
				cs.print();
				break;
			case 3:
				cs.searchCustomerNum();
				break;
			case 4:
				cs.searchName();
				break;
			case 5:
				cs.searchPhoneNum();
				break;
			case 6:
				cs.descSortName();
				break;
			case 7:
				cs.ascSortCsNum();
				break;
			case 8:
				cs.exitProgram();
			default:
				break;
			}
			System.out.println();
		}
	}
}
