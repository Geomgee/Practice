package array;

import java.util.Scanner;

public class Review02_T {
	public static void main(String[] args) {
				// pdf p.225 Review02
				Scanner sc = new Scanner(System.in);
				//변수 선언
				int num = 0, position = 0 ; //num: 선택한 메뉴 저장 / position:선택한 주차 위치
				boolean[] car = new boolean[5]; //true: 주차, false: 비었음
				
				while(true) {	
					System.out.println("주차 관리 프로그램");
					System.out.println("*************");
					System.out.println("1.입차\n2.출차\n3.리스트\n4.종료");
					System.out.println("*************");
					System.out.print("메뉴: ");
					num = sc.nextInt();

					//받은 값으로 action을 취한다
					if (num == 4) {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
					
					switch(num) {
						case 1 :
							System.out.print("위치 입력[1~5]: ");
							position = sc.nextInt(); //원하는 곳의 자리를 입력
							
							if(car[position-1]) {
								System.out.println(position+"위치에 이미 주차되어 있습니다.");
							}else {
								car[position-1] = true;
								System.out.println(position+"위치에 입차 / 주차되었습니다.");
							}
							break;
						case 2 :
							System.out.print("위치 입력[1~5]: ");
							position = sc.nextInt(); //원하는 곳의 자리를 입력
							
							if(car[position-1]) {
								car[position-1] = false;
								System.out.println(position+"위치에 출차 / 출차되었습니다.");
							}else {
								car[position-1] = true;
								System.out.println(position+"위치에 주차 되어있지 않습니다.");
							}
							break;
						case 3 :
							System.out.println();
							System.out.println("---리스트---");
							for(int z=0; z<car.length; z++) {
								System.out.println((z+1)+"위치 : "+car[z]);
							}; 
							break;
							
						default : System.out.println("다시 선택해주세요."); break;
					}
					System.out.println();
				}	
				System.out.println();
					
				sc.close();
	}
}