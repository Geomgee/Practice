package polyArray;

import java.util.Scanner;

public class PolyPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalPrice = 0; // 누적금액
		int cost[] = { 14000, 13000, 12000, 11000, 10000, 9000, 8000, 7000, 6000, 5000 };
		String name[] = { "치킨", "인생떡볶이", "피자", "국물닭발", "육회", "새우튀김", "감바스", "스테이크", "메론빙수", "생맥주 500cc" };
		String tip[] = { "두가지 소스별로 찍어 먹어 보세요", "튀김에 적셔 먹어요", "달콤한 꿀에 찍어먹어요!!", "오이시쿠나레", "오이시쿠나레", "모에모에큥", "맛있어져라",
				"맛있어져라", "얍", "살얼음잔에 마시면 완전 시원" };
		boolean order[] = new boolean[name.length];

		System.out.println("==인생맥주입니다. 키오스크에서 원하는 메뉴를 선택해주세요==");

		while (true) {
			System.out.print("[");
			for (int i = 0; i < name.length; i++) {
				System.out.print((i + 1) + "." + name[i] + "\t");
			}
			System.out.print("11.메뉴별 2배 맛있어지는 꿀팁!\t12.~재주문시 50%할인 event~\t13.메뉴별 제조공정\t14.계산]\n메뉴번호 : ");
			int num = sc.nextInt();
			if (num < 11) {
				System.out.println(name[num - 1] + "를 주문 하였습니다.");
				totalPrice += cost[num - 1];
				order[num - 1] = true;
			} else if (num == 11) {
				for (int i = 0; i < name.length; i++) {
					System.out.println(name[i] + "을(를) 맛있게 먹는 방법 꿀팁 !");
					System.out.println("ㄴ" + tip[i] + "\n");
				}
				System.out.println();
				continue;

				// 재주문
			} else if (num == 12) {
				System.out.print("재주문 할 메뉴 변호: ");
				int reMenu = sc.nextInt();
				if (reMenu < 11) {
					if (order[reMenu - 1] == true) {
						totalPrice += (cost[reMenu - 1] * 0.5); // 반값 할인!
					} else {
						System.out.println("재주문이 아닙니다. 홈으로 이동합니다.");
					}
				} else {
					System.out.println("잘못된 입력으로 홈으로 이동");
				}
			} else if (num == 13) {
				System.out.print("제조 공정을 보려는 메뉴 번호: ");
				int proNum = sc.nextInt();
				System.out.println(name[proNum - 1] + " 만들 때 맛있어지라고 주문을 외웁니다!");
				System.out.println(name[proNum - 1] + "의 원재료부터 꼼꼼히 골라 엄선합니다.");
				System.out.println(name[proNum - 1] + "의 가격을 낮추기 위해 마진율을 낮추고 박리다매 합니다");
				System.out.println(name[proNum - 1] + "(을)를 맛있게 조리하기 위해 10년 경력의 최고 쉐프가 조리합니다");
				System.out.println(name[proNum - 1] + "(을)를 가장 맛있게 즐기기 위해 직원들이 최선의 서비스를 제공합니다\n");
				continue;
			} else if (num == 14) {
				System.out.println("계산할 금액은 " + totalPrice + " 입니다.");
				System.out.print("현금을 투입구에 넣어주세요. 투입한 금액입력 : ");
				int input = sc.nextInt();
				if (input < totalPrice) {
					System.out.println("입금액이 부족합니다. 계산메뉴를 클릭하여 추가로 입금해주세요");
					totalPrice -= input;
				} else {
					System.out.println(input + "원이 투입되었습니다.");
					System.out.println("거스름돈은 " + (input - totalPrice) + "원입니다.");
					System.out.println("이용해 주셔서 감사합니다.");
					sc.close();
					System.exit(0);
				}
			}
			System.out.println("[주문 누적금액 : " + totalPrice + "]");
			System.out.println();
		}
	}
}
