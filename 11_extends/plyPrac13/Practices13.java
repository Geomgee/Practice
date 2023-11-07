package plyPrac13;

import java.util.Scanner;

public class Practices13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Print[] op = new Print[2];

		for (int i = 0; i < 2; i++) {
			op[i] = new Print();
			op[i].input();
			op[i].setProcess(); // 총액 저장 기능 포함
			System.out.println();
		}
		System.out.print("\n할인율 : ");
		Sales.setDiscount(sc.nextDouble());

		System.out.println("==[판매가]==");
		for (int i = 0; i < op.length; i++) {
			op[i].getDisplay();

		}
		System.out.print("판매건수 : " + Sales.getCnt() + "건");
	}
}
