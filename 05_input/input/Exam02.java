package input;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//1. 변수 선언하면서 초기화
		String name = "";
		int kor = 0;
		double math = 0;
		boolean b = false;
		char ch = 0;
		
		//2. 사용자에게 값을 입력 받아서 데이터 저장
		System.out.println("이름:");
		name = sc.nextLine(); //next()는 단어 하나, nextLine()문자열 모두 입력 받을 때
		System.out.println("국어점수:");
		kor = sc.nextInt();
		System.out.println("수학점수:");
		math = sc.nextDouble();
		System.out.println("부모님께 성적 확인을 해드렸는 지 진실을 true 혹은 false로 입력하세요. :");
		b = sc.nextBoolean();
		System.out.println("A~F 뭘까요잉? :");
		ch = sc.next().charAt(0);
	
		//3. 출력
		System.out.println("이름:"+name);
		System.out.println("국어점수:"+kor);
		System.out.println("수학점수:"+math);
		System.out.println("보여드렸습니까?"+b);
		System.out.println("A~F 뭘까요잉? :"+ch);
		
		sc.close();
	}

}
