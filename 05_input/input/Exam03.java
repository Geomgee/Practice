package input;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		//국영수 점수 입력받아 총합, 평균 구하기
		Scanner sc = new Scanner(System.in);
		//Scanner 클래스 타입의 객체를 sc 변수에 저장.
		
		
		//1. 변수 선언 (실수형으로 kor, eng, math 선언 해보기)
		String name="";
		double kor=0, eng=0, math=0, sum=0, avg=0;
		
		System.out.println("이름 :");
		name = sc.nextLine();
		System.out.println("국어 :");
		kor = sc.nextDouble();
		System.out.println("영어 :");
		eng = sc.nextDouble();
		System.out.println("수학 :");
		math = sc.nextDouble();
		
		
		System.out.println("이름 : "+name);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("-----------");

		sum = kor+eng+math;
		System.out.println("총합 : "+sum);
		avg = sum/3;
		System.out.println("평균 : "+avg);
		System.out.printf("평균 : %.2f",avg);
		System.out.printf("\n학생명: %s, 국어점수: %f, 영어점수: %f, 수학점수: %f, 총점: %.2f, 평균 : %.2f",name,kor,eng,math,sum,avg);

		
		sc.close();
	}

}
