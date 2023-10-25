package variable;

public class Exam04 {

	public static void main(String[] args) {
		byte num1 = 50;
		System.out.println("num1 = " + num1);
		float num2 = 178.50f;
		System.out.printf("num2 = %.2f\n\n", num2);

		char ch = 'A';
		boolean b = true;
		int cost1 = 500;
		int cost2 = 2000;
		double discount = 0.1;
		int discount2 = 10;
		String prize = "자전거";

		System.out.println("ch = " + ch);
		System.out.println("b = " + b);
		System.out.printf("ch = %c\n", ch);
		System.out.printf("b = %b\n", b);

		System.out.println("======문자열 출력======");
		String str1 = "A";
		System.out.println(str1);
		String str2 = "AAAAAAAAAAAA";
		System.out.println(str2);
		String str3 = "AAA'박검지'AAA";
		System.out.println(str3);
		String str4 = "AAA\"박검지\"AAA";
		System.out.println(str4);
		String str5 = "AAA\t박검지\tAAA";
		System.out.println(str5);

		System.out.println("========formatting 문자열=======");
		System.out.printf("연필 1개의 가격 : %d\n", 500);
		System.out.printf("연필 1개의 가격 : %5d\n", 500); // 5자리로 변경
		System.out.printf("연필 1개의 가격 : %-5d", 500); // -를 넣은 경우에는 5자리로 변경 후 자리 추가가 뒤에 (공백으로) 생김
		System.out.print("foramt 뒤의 임시 문자열\n");
		System.out.printf("연필 1개의 가격 : %05d\n", 500); // 5자리로 변한 공간에 0으로 채우겠다 0 대체 가능한 것은 x
		System.out.printf("파란연필의 가격 : %d원, 빨간 매직의 가격 : %d원인데 할인율이 %.1f이다\n", cost1, cost2, discount);
		System.out.printf("파란연필의 가격 : %d원, 빨간 매직의 가격 : %d원인데 할인율이 %d%%이다\n", cost1, cost2, discount2);
		// %를 출력하고 싶다면 printf 구문에서는 %%로 표시한다
		System.out.printf("빨간 다이어리가 %5.1f할인중입니다.\n", discount);
		System.out.printf("빨간 다이어리가 %-5.1f할인중입니다.\n", discount); //
		System.out.printf("빨간 다이어리가 %05.1f할인중입니다.", discount); // 0숫자. 붙으면 0을 포함하여 5자리로 변환해준다
		System.out.printf("경품은 무엇일까요? %7s입니다.\n", prize);
		System.out.printf("경품은 무엇일까요? %-7s입니다.\n", prize);
		System.out.printf("경품은 무엇일까요? %s입니다.\n", prize);

	}
	
	public static int operator() {
		int num1 = 10;
		int num2 = 5;
		return num1+num2;
	}

}
