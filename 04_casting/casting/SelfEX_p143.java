package casting;

import java.util.Scanner;

public class SelfEX_p143 {
	public static void main(String[] args) {
		// PDF p143-147

//		ex01();
//		ex02();
//		ex03();
//		ex04();
//		ex05();
		ex08();

	}
//
//		public static void ex01() {
//			byte byteValue=10;
//			char charValue='A';
//			
//			int intValue= byteValue;
//			
//			System.out.println(intValue);
//		
//		
//	
//		public static void ex02() {
//			
//			int intValue = 10;
//			char charValue = 'A';
//			double doubleValue = 5.7;
//			String strValue = "A";
//			
//			char var = strValue.charAt(0);
//			
//			
//			System.out.println(var);
//		}	

//		public static void ex03() {
//			
//			char c1 = 'a';
//			char c2 = (char)(c1 + 1);
//			
//			System.out.println(c2);

//		public static void ex04() {
//			int x = 5;
//			int y = 2;
//			double result = (double)x / (double)y;
//			System.out.println(result);
//		}
//
//	public static void ex05() {
//		int x = 5;
//		int y = 2;
//		double result = x / y;
//
//		System.out.println(result);
//
	public static void ex08() {
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//
//		int result = (int)(var3 + Double.parseDouble(var4))+(int)(var1 + var2);
//		
		Scanner sc = new Scanner(System.in);
		
		
		String name = "";
		double base, month, tax;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("기본급 : ");
		base = sc.nextDouble();
		
		double tax = base*0.033;
		double month = base-tax;
		
		System.out.printf("기본급 : %.1f\n월급 : %.1f\n세급 : %.1f\n", base, month, tax);
		
		
	}
}
