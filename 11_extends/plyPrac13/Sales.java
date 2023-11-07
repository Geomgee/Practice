package plyPrac13;

import java.util.Scanner;

public class Sales {
	Scanner sc = new Scanner(System.in);
	// 멤버 필드
	private String article; // 품목
	private int qty; // 수량
	private int cost; // 단가

	private static int cnt; // 총 판매 건수
	private static double discount; // 총 판매 건수

	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sales(String article, int qty, int cost) {
		this.article = article;
		this.qty = qty;
		this.cost = cost;
	}

	public void input() {
		System.out.print("품목 : ");
		article = sc.next();
		System.out.print("수량 : ");
		qty = sc.nextInt();
		cnt += qty;
		System.out.print("단가 : ");
		cost = sc.nextInt();
	}

	// getter setter
	public String getArticle() {
		return article;
	}

	public int getQty() {
		return qty;
	}

	public int getCost() {
		return cost;
	}

	public static int getCnt() {
		return cnt;
	}

	public static double getDiscount() {
		return discount;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public static void setCnt(int cnt) {
		Sales.cnt = cnt;
	}

	public static void setDiscount(double discount) {
		Sales.discount = discount;
	}

}
