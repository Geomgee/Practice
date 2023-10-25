package conditional;

import java.util.Scanner;

public class Review01_p172_K {

	   public static void ex01() {
		      Scanner sc = new Scanner(System.in);

		      double num1;
		      double num2;
		      String str1 = "";
		      double result = 0;

		      System.out.print("첫 번째 수 : ");
		      num1 = sc.nextDouble();
		      System.out.print("두 번째 수 : ");
		      num2 = sc.nextDouble();
		      System.out.print("연산자 : ");
		      str1 = sc.next();

		      if (str1.equals("+")) {
		         result = num1 + num2;
		      } else if (str1.equals("-")) {
		         result = num1 - num2;
		      } else if (str1.equals("*")) {
		         result = num1 * num2;
		      } else if (str1.equals("/")) {
		         result = num1 / num2;
		      } else if (str1.equals("%")) {
		         result = num1 % num2;
		      } else {
		         System.out.println("다시입력");
//		         return;
		      }
		      System.out.printf("%.2f%s%.2f=%.2f", num1, str1, num2, result);
	   }
}