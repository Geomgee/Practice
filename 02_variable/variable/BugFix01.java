package variable;

public class BugFix01 {
   public static void main(String[] args) {
      float num = 1.2f;
      String str1 = "abracadabra";
      float fl = 1.234f;
      
      System.out.println(num);
      System.out.printf("아브라카다브라의 스펠링은 %s\n", str1);
      System.out.printf("변수 fl의 값은 %.3f", fl);
   }
}