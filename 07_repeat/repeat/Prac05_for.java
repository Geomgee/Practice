package repeat;

import java.util.Scanner;

public class Prac05_for {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		
		System.out.println("*************");
		System.out.println("1. 입력");
		System.out.println("2. 검색");
		System.out.println("3. 삭제");
		System.out.println("4. 종료");
		System.out.println("*************");
		
		System.out.print("번호 선택 :  ");
		num = sc.nextInt();
		
		for(int i=1;i<=5;i++) {
			i = num;
				if(i==1)  {
					System.out.println("입력을 선택하였습니다"); break;
				}
				if(i>1 && i<=2) {
					System.out.println("검색을 선택하였습니다"); break;
				}
				if(i>2 && i<=3) {
					System.out.println("삭제를 선택하였습니다"); break;
				}
				if(i>3 && i<=4) {System.out.println("종료를 선택하였습니다"); break;
				}
			
		}
		

		
		sc.close();
	}

}
