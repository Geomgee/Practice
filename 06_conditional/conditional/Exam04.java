package conditional;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		//입력한 년도가 윤년인지 평년인지 알아보는 조건식
		Scanner sc = new Scanner(System.in);
		System.out.println("윤년인지 알기 원하는 년도를 숫자만 입력해 주세요.");
		int year = sc.nextInt();
	if((year%4==0) && (year%100 !=0) || (year%400==0)){
		System.out.println(year+"년은 윤년 ☆*: .｡. o(≧▽≦)o .｡.:*☆");
	}else {
		System.out.println(year+"년은 평년 (❁´◡`❁)");
	}	
		sc.close();
	}

}
