package classes;

import java.util.Scanner;

class Score {
	String num; // 학번 - 가지고 연산 할 일이 없기 때문에 문자열로 선언
	String name; // 학생명
	int kor, eng, math, tot, avg; // 국 영 수 총점, 평균

	void set() {
		Scanner sc = new Scanner(System.in);

		System.out.print("학번: ");
		num = sc.next();
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어점수: ");
		kor = sc.nextInt();
		System.out.print("영어점수: ");
		eng = sc.nextInt();
		System.out.print("수학점수: ");
		math = sc.nextInt();

		tot = kor + eng + math;
		avg = tot / 3;

		System.out.println("총점: " + tot + " 평균: " + avg);
	}

	void hello() {
		System.out.println("성적을 확인해 주세요");
	}

	void print() {
		this.hello(); // 같은 클래스에 있는 메소드를 호출할 때 this.메소드명()으로 호출할 수 있다.
		System.out.println("===========" + this.name + "님 성적===========");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		String result = num + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + avg;
		System.out.println(result);
	}
}

public class Exam11_score {
	public static void main(String[] args) {
		Score s1 = new Score();
		Score s2 = new Score();

		System.out.println("=================");
		s1.set();
		s2.set();
		System.out.println("=================");
		s1.print();
		s2.print();

	}
}