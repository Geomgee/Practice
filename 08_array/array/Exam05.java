package array;

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Java";
		String s4 = new String("Hello");
		System.out.println("Hello를 입력하세요");
		String s5 = sc.next();
		System.out.println("Hello를 입력하세요");
		String s6 = sc.next();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		System.out.println("====================");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s1 == s5);
		System.out.println(s4 == s5);
		//문자열을 비교할 때  ==의 의미는 주소값과 문자열 데이터를 모두 같음을 의미
		//문자열 데이터가 같은 지 비교할 때에는 배열명.equals(”문자열”)메소드가 필요하다
		System.out.println("====================");
		System.out.println(s1.equals("Hello"));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
	}
}
		