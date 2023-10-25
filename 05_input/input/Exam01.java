package input;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("콘솔창에 출력하기 위한 문자열을 입력해주세요");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// 1. 변수 선언: 데이터를 저장할 수 있는 공간을 만들고 이름을 붙인다.
		double a, b, c;

		// 2.사용자가 원하는 값을 입력 받아 데이터를 변수에 저장
		System.out.println("밑변의 길이를 실수(cm)로 입력해주세요 :");
		a = sc.nextDouble();
		System.out.println("높이의 길이를 실수(cm)로 입력해주세요 :");
		b = sc.nextDouble();
		
		//3. 연산: 저장된 데이터를 가공하기
		c = a*b/2;
		
		//4. 출력 : 저장된 데이터와 결과값을 확인하기.
		System.out.println("입력한 데이터를 가지고 생성한 삼각형의 넓이는? : "+c+"cm");
		
		sc.close();
	}

}
