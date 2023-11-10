package PolyExam2;

import java.util.Scanner;

class Menu {// 부모 클래스
	int menuPrice; // 메뉴별 가격
	static int totalPrice = 0; // 누적금액
	String menuName; // 메뉴명

	public Menu() {
	}

	public Menu(int menuPrice, String menuName) {
		super();
		this.menuPrice = menuPrice;
		this.menuName = menuName;
	}

	public void order() {
		totalPrice += menuPrice; // 누적금액
	}

	@Override
	public String toString() {
		return menuName + "를 주문하였습니다.";
	}

	public static void pay() {
		Scanner sc = new Scanner(System.in);
		System.out.println("계산할 금액은" + totalPrice + "입니다.");
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

	// 기능추가
	public void tip() {
		System.out.println("==" + menuName + "을(를) 맛있게 먹는 방법 꿀팁!==");
	}

	public void eatMethod() {
		tip();
		System.out.println("각 메뉴별 맛있게 먹는 방법");
	}

	public void reOrder() {
		totalPrice += menuPrice * 0.5; // 누적금액/2 => 할인가
	}

//	public void howToMake() {  //내가 한 방법
//		System.out.println(menuName + "의 원재료부터 꼼꼼히 골라 엄선합니다.");
//		System.out.println(menuName + "의 가격을 낮추기 위해 마진율을 낮추고 박리다매 합니다");
//		System.out.println(menuName + "(을)를 맛있게 조리하기 위해 10년 경력의 최고 쉐프가 조리합니다");
//		System.out.println(menuName + "(을)를 가장 맛있게 즐기기 위해 직원들이 최선의 서비스를 제공합니다\n");
//	}

	public void a() {
		System.out.println(this.menuName + "의 원재료부터 꼼꼼히 골라 엄선합니다.");
	}

	public void b() {
		System.out.println(menuName + "의 가격을 낮추기 위해 마진율을 낮추고 박리다매 합니다");
	}

	public void c() {
		System.out.println(menuName + "(을)를 맛있게 조리하기 위해 10년 경력의 최고 쉐프가 조리합니다");
	}

	public void d() {
		System.out.println(menuName + "(을)를 가장 맛있게 즐기기 위해 직원들이 최선의 서비스를 제공합니다\n");
	}

}

class FriedChicken extends Menu {
	public FriedChicken() {
		super(14000, "치킨");
	}

	public FriedChicken(int menuPrice, String menuName) {
		super(menuPrice, menuName);
	}

	@Override
	public void eatMethod() {
		tip();
		System.out.println("두가지 소스별로 찍어먹어 보세요");
	}
}

class RiceCake extends Menu {

	public RiceCake() {
		super(13000, "인생떡볶이");
	}

	public RiceCake(int menuPrice, String menuName) {
		super(menuPrice, menuName);
	}

	@Override
	public void eatMethod() {
		tip();
		System.out.println("튀김에 적셔 먹어요");
	}
}

class Pizza extends Menu {
	public Pizza() {
		super(12000, "고르곤졸로 피자");
	}

	public Pizza(int menuPrice, String menuName) {
		super(menuPrice, menuName);
	}

	@Override
	public void eatMethod() {
		tip();
		System.out.println("달콤한 꿀에 찍어먹어요!!");
	}
}

class Beer extends Menu {
	public Beer() {
		super(5000, "생맥주 500cc");
	}

	public Beer(int menuPrice, String menuName) {
		super(menuPrice, menuName);
	}

	@Override
	public void eatMethod() {
		tip();
		System.out.println("살얼음잔에 마시면 완전 시원");
	}
}

public class PolyPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int cost[] = { 14000, 13000, 12000, 11000, 10000, 9000, 8000, 7000, 6000,
		// 5000 };
		String name[] = { "치킨", "인생떡볶이", "피자", "국물닭발", "육회", "새우튀김", "감바스", "스테이크", "메론빙수", "생맥주 500cc" };
		Menu[] menu = new Menu[10];
		boolean[] reOrder = new boolean[12];
//		for (Menu m : menu) {
//			System.out.println(m);
//		}
		menu = new Menu[] { new FriedChicken(), new RiceCake(), new Pizza(), new Beer() };
//		for (Menu m : menu) {
//			System.out.println(m);
//		}
		System.out.println("==인생맥주입니다. 키오스크에서 원하는 메뉴를 선택해주세요==");
		while (true) {
			System.out.print("[");
			for (int i = 0; i < name.length; i++) { // 10개
				System.out.print(i + 1 + "." + name[i] + "\t");
			}
			System.out.print("11.메뉴별 2배 맛있어지는 꿀팁!\t12. 재주문하면 50% 깎아드림\t13.메뉴별 제조공정\t14.계산]\n메뉴번호 : ");
			int num = sc.nextInt();

			if (num < 11) {
				menu[num - 1].order();
				reOrder[num - 1] = true;
				System.out.println(menu[num - 1]);
			} else if (num == 11) {
				for (Menu m : menu)
					m.eatMethod();
				break;
			} else if (num == 12) {
				System.out.print("재주문 할 메뉴 변호: ");
				int reMenu = sc.nextInt();
				if (reMenu < 11) {
					if (reOrder[reMenu - 1]) {
						menu[reMenu - 1].reOrder();
					} else {
						System.out.println("재주문이 아닙니다. 홈으로 이동합니다.");
					}
				} else {
					System.out.println("잘못된 입력으로 홈으로 이동");
				}
			} else if (num == 13) {
				System.out.print("제조 공정을 보려는 메뉴 번호: ");
				int proNum = sc.nextInt();
				process(menu[proNum - 1]);
				continue;
			} else if (num == 14) {
				Menu.pay();
			}
		}
	}
//
//			switch (num) {
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//			case 6:
//			case 7:
//			case 8:
//			case 9:
//			case 10:
////				new Beer();
//				menu[num - 1].order();
//				reOrder[num - 1] = true;
//				System.out.println(menu[num - 1]);
//				break;
//			case 11:
//				for (Menu m : menu)
//					m.eatMethod();
//				break;
//			case 12:
//				System.out.print("재주문 할 메뉴 변호: ");
//				int reMenu = sc.nextInt();
//
//				if (reMenu < 11) {
//					if (reOrder[reMenu - 1]) { // 내가 주문을 하겠다고 하는 그 메뉴에 reOrder을
//						menu[reMenu - 1].reOrder();
//					} else {
//						System.out.println("재주문이 아닙니다. 홈으로 이동합니다.");
//					}
//				} else {
//					System.out.println("잘못된 입력으로 홈으로 이동");
//				}
//				break;
//			case 13:
//				System.out.print("제조 공정을 보려는 메뉴 번호: ");
//				num = sc.nextInt();
//				// menu[num-1].howToMake(); //내가 한 방법
//				process(menu[num - 1]);
//				continue;
//			case 14:
//				Menu.pay();
//				break;
//			}
//			System.out.println("[주문 누적금액 : " + Menu.totalPrice + "]");
//			System.out.println();
//		}
//	}

	public static void process(Menu food) {
		food.a();
		food.b();
		food.c();
		food.d();
	}
}