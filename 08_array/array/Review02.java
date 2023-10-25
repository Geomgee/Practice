package array;

import java.util.Scanner;

public class Review02 {
	public static void main(String[] args) {
				// pdf p.225 Review02
				Scanner sc = new Scanner(System.in);
				//변수 선언
				String[] menu = {"주차", "입차", "출차", "리스트", "종료"};
				boolean[] place = new boolean[5];
				int input = 0;
				int where = 0;
				
				while(true) {	
					System.out.println("주차 관리 프로그램");
					System.out.println("*************");
					for (int i = 0; i < menu.length; i++) {
						if(i > 0)	{System.out.println((i)+". "+menu[i]);}
					};
					System.out.println("*************");
					System.out.print("메뉴: ");
					input = sc.nextInt();

					//받은 값으로 action을 취한다
					if (input == 4) break;
					
					switch(input) {
						case 1 :
						case 2 :
							System.out.print("위치 입력[1~5]: ");
							where = sc.nextInt(); //원하는 곳의 자리를 입력
							System.out.print(input+"위치에 "+menu[input]+" / ");
							if ((input == 1) && (place[where-1] == true)) {
								System.out.print("이미 "+menu[0]+"된 자리입니다.");
							} else if ((input == 1) && (place[where-1] == false)) {
								place[where-1] = true; // 입력된 값을 true로 준다 (자리맡음)
								System.out.println(menu[1]+"되었습니다.");
							} else if ((input == 2) && (place[where-1] == true)) {
								place[where-1] = false; // 입력된 값을 false로 준다 (자리뺌)
								System.out.println(menu[2]+"되었습니다.");
							} else if ((input == 2) && (place[where-1] == false)) {
								System.out.println("이미 "+menu[2]+"된 자리입니다.");
							} else {System.out.println("다시 선택해주세요.");}
							break;
						case 3 :
							System.out.println();
							System.out.println("---"+menu[3]+"---");
							for(int z=0; z<place.length; z++) {
								System.out.println((z+1)+"위치 : "+place[z]);
							}; 
							break;
							
						default : System.out.println("다시 선택해주세요."); break;
					}
					System.out.println();
				}	
				System.out.println();
				System.out.println("프로그램을 종료합니다.");
					
				sc.close();
	}
}