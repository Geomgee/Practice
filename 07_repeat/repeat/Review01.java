package repeat;

import java.util.Scanner;

public class Review01 {
//	public static void main(String[] args) {
//		// 5층짜리 트리를 출력 (공백)
//		for (int enter = 1; enter <= 5; enter++) {
//			for (int space = 1; space<=5-enter; space++) {
//				System.out.print(" ");
//			}
//			for (int star = 1; star<=(2*enter-1); star++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//	}
//}
	public static void main(String[] args) {
		// 5층짜리 트리를 출력 (공백)
		for (int enter = 1; enter <= 5; enter++) {
			for (int space = 4; space >= 1; space--) {
				System.out.print("0");
			}
			for (int star = 1; star <= 10; star++) if (star % 2 == 0) continue; {
			System.out.println("*");
			}
			System.out.println();
		}
	}
}