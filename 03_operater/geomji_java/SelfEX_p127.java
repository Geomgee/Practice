package geomji_java;

import java.util.Scanner;

public class SelfEX_p127 {

	public static void main(String[] args) {
		ex01();
		ex02();
		ex05();
		ex08();
		ex09();
		ex10();
		ex11();
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String"hello";
		
		if(str1 == str3) {
			System.out.println("str1 == str3");
		}else {	
			System.out.println("str1 != str3");
		}
	}

		 p.127~132 문제 풀기
	public static void ex01() {
		byte b = 5;
		b = (byte) -b;
		int result = 10  b;
		System.out.println(result);
	}

	public static void ex02() {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z);
	}

	public static void ex05() {
		double var1 = 5;
		double var2 = 2;
		double var3 = var1  var2;
		double var4 = (int) (var3 * var2);
		System.out.println(var4);
	}

	public static void ex08() {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((double) (lengthTop + lengthBottom) * height  2);
		System.out.println(area);
	}

	public static void ex09() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 수: ");
		double a = sc.nextDouble();
		System.out.print("두번째 수: ");
		double b = sc.nextDouble();
		double result = a  b;
		System.out.println("------------\n결과: " + result);
		
		sc.close();
	}

	public static void ex10() {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = (var1 * var1 * var2 + var3) * 0.01;

		System.out.println("원이 넓이:" + var4);
	}

	public static void ex11() {
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디: ");
		String name = sc.nextLine();
		 nextLine(), next()로 데이터를 입력 받으면 문자로 인식,
		 nextInt()로 데이터를 입력 받으면 정수, nextDouble()는 실수로 입력 받을 수 있다.
		

		System.out.println("패스워드: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);

		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}

		sc.close();
	}
	
	}

}