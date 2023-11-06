package customer;

import java.util.Scanner;

public class CustomerFunctions {
	Scanner sc = new Scanner(System.in);

	final static int liNum = 20; // 담을 수 있는 고객데이터 수
	CustomerVO[] list = new CustomerVO[liNum];
	int cnt = 0; // 현재 고객 데이터 수

	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 고객번호 검색");
		System.out.println("4. 이름 검색");
		System.out.println("5. 전화 검색");
		System.out.println("6. 이름 내림차순 정렬");
		System.out.println("7. 고객 번호 오름차순 정렬");
		System.out.println("8. 종료");
		System.out.println("-----------------------");
		System.out.print("번호 : ");
		return sc.nextInt();
	}

	// 8. 종료
	public void exitProgram() {
		System.out.println("프로그램 종료");
		sc.close();
		System.exit(0);
	}

	// 1. 입력
	public void input() {
		CustomerVO vo = new CustomerVO();
		System.out.print("고객번호 (4자리 숫자) : ");
		int num = sc.nextInt();
		int customerNum = num;

		if (cnt == 0) {
			vo.setCustomerNum(customerNum);
		} else {
			for (int i = 0; i < cnt; i++) {
				if (list[i].getCustomerNum() == num) {
					System.out.println("!!!!!!!!!중복 되었습니다. 다시 입력해주세요");
					break;
				} else {
					System.out.println("중복 안 되었습니다.");
					vo.setCustomerNum(customerNum);
					System.out.print("이름 : ");
					vo.setName(sc.next());
					System.out.print("전화(-포함) : ");
					vo.setPhoneNum(sc.next());
					list[cnt] = vo;
					cnt++;
				}
			}
		}
	}

	// 고객번호 검색
	public void searchCustomerNum() {
		System.out.print("고객번호 입력하여 정보검색: ");
		int customerNum = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			CustomerVO vo = list[i];
			if (vo.getCustomerNum() == customerNum) {
				printTitle();
				System.out.println(vo);
			}
		}
	}

	// 이름 검색
	public void searchName() {
		System.out.print("이름 입력하여 정보검색: ");
		String name = sc.next();
		for (int i = 0; i < cnt; i++) {
			CustomerVO vo = list[i];
			if (vo.getName().equals(name)) {
				printTitle();
				System.out.println(vo);
			}
		}
	}

	// 전화 검색
	public void searchPhoneNum() {
		System.out.print("전화 입력하여 정보검색: ");
		String phone = sc.next();
		for (int i = 0; i < cnt; i++) {
			CustomerVO vo = list[i];
			if (vo.getPhoneNum().equals(phone)) {
				printTitle();
				System.out.println(vo);
			}
		}
	}

	// 이름 내림차순 정렬
	public void descSortName() {
		for (int x = 0; x < cnt; x++) { // 기준값
			for (int y = x + 1; y < cnt; y++) {
				String left = list[x].getName();
				String right = list[y].getName();
				if (left.compareTo(right) < 0) { // 기준 값이 비교값보다 크면 양수를 반환하고 같으면 0을 반환하고 작으면 음수로 변환
					CustomerVO temp = list[x];
					list[x] = list[y];
					list[y] = temp;
				}
			}
		}
		print();
	}

	// 고객번호 오름차순 정렬
	public void ascSortCsNum() {
		for (int x = 0; x < cnt; x++) { // 기준값
			for (int y = x + 1; y < cnt; y++) {
				if (list[x].getCustomerNum() > list[y].getCustomerNum()) { // 기준 값이 비교값보다 크면
					CustomerVO temp = list[x];
					list[x] = list[y];
					list[y] = temp;
				}
			}
		} // for문을 빠져나온 뒤
		print();
	}

	public void print() {
		printTitle();
		for (int i = 0; i < cnt; i++) {
			CustomerVO vo = list[i];
			System.out.printf("%4s\t%4s\t%13s\n", vo.getCustomerNum(), vo.getName(), vo.getPhoneNum());
		}
	}

	public void printTitle() {
		System.out.printf("%4s\t%4s\t%13s\n", "고객번호", "이름", "전화");
//		CustomerVO vo = new CustomerVO();
//		System.out.printf("고객번호\t이름\t전화");
//		vo.toString();
	}
}