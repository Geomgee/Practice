package array;

import java.util.Scanner;

public class Prac03_T {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = 0, m = 0, d = 0, sum = 0;
		int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		System.out.println("*** 일수 구하기 ***");
		System.out.print("년: ");
		y = sc.nextInt();
		System.out.print("월: ");
		m = sc.nextInt();
		System.out.print("일: ");
		d = sc.nextInt();

		// months의 m달 까지 가져와서 = ok
		// months 의 합을 구하고
		// 남은 일수를 카운팅 month[i] - i 하여 마저 더한다
		if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
			months[1]=29;
		}
		//사용자가 입력한 월의 전달까지의 합
		for(int i= 0; i < (m-1); i++) {
			sum += months[i];
		}
		
		//사용자가 입력한 일을 더해줌
		sum += d;
		
		//출력
		System.out.printf("1월 1일부터 %d월 %d일까지는 %d일 입니다.", m,d,sum);
		
		
			sc.close();
	}
}