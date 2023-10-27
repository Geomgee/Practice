package lotto;

import java.util.Random;

public class Test_RandomClass {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt());
		// 매개변수로 5를 넣으면 0~4까지의 범위 안에서 정수 1개를 생성
	}
}
