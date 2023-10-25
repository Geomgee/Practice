package array;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			int[] months = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			int y = 0, m = 0, d = 0, day=0;

			System.out.println("*** 일수 구하기 ***");
			System.out.print("년: ");
			y = sc.nextInt();
			System.out.print("월: ");
			m = sc.nextInt();
			System.out.print("일: ");
			d = sc.nextInt();

			//months의 m달 까지 가져와서 = ok 
			//months 의 합을 구하고 
			//남은 일수를 카운팅 month[i] - i 하여 마저 더한다
			for (int i = 1; i < m; i++) {
//				day += d;
				if(m !=1) {
					day += (int)(months[i-1]);
					System.out.printf("1월 1일부터 %d월 %d일까지는 %d일 입니다.",m,d,+(day+d));
				} 
				else if (y % 100 == 0) { // 평달
				System.out.printf("1월 1일부터 %d월 %d일까지는 %d일 입니다.",m,d,day);
				} else if (((y % 4 == 0)||(y % 400 == 0))&&(m == 2 && y >= 29)) {
			    System.out.printf("1월 1일부터 %d월 %d일까지는 %d일 입니다.",m,d,(day+1)); // 윤달이면서 2월 29일 이상은 평달 day+1
				}//
			}
			

			sc.close();
		}
	}