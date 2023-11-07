package plyPrac13;

public class Print extends Sales {
	// 멤버 필드
	int amount; // 총액 = 금액 * 수량

	public void setProcess() {
		amount = getQty() * getCost();
	}

	public void getDisplay() {
		System.out.println(getArticle() + "\t" + amount * (1 - getDiscount()));
		// 판매가 = 총액 - 총액 * 할인율 => 총액 * (1-할인율)

	}

}
