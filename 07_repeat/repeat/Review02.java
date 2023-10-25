package repeat;

import java.util.Scanner;

public class Review02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int select = 0; //번호 저장
		int balance = 0; //잔고 저장
		int withdrawal = 0; //출금액 저장
		int deposit = 0; //입금액 저장
		
		
		while(true) {
			System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
			System.out.print("번호 선택: ");
			select = sc.nextInt();
			if(select == 4) break;
			
			
			switch(select) {
				case 1 : System.out.print("예금액: "); 
					deposit = sc.nextInt(); 
					balance += deposit;
					System.out.println();
					break;
					
				case 2 : System.out.print("출금액: ");
					withdrawal = sc.nextInt(); 
					if (balance < withdrawal) {
						System.out.println("출금 실패  error: 잔액 부족");
						break;
					}else {
						balance -= withdrawal;
					}
					System.out.println();
					break;
					
				case 3 : System.out.println("잔고액: \n"+balance);
					break;
			} 
		
		}
		System.out.println();
		System.out.println("프로그램을 종료합니다.");
		System.out.println();
		sc.close();
	}
}
	
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		boolean run = true;
//		int num = 0;
//		int saving = 0;
//		int pay = 0;
//
//		while (run)	{
//
//			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
//			System.out.print("번호 선택> ");
//			num = sc.nextInt();
//
//			if (num == 1) {
//				System.out.print("예금액> ");
//				saving = sc.nextInt();
//				System.out.println();
//			} else if (num == 2) {
//				System.out.print("출금액> ");
//				pay = sc.nextInt();
//				System.out.println();
//			} else if (num == 3) {
//				System.out.print("잔고> ");
//				if ((saving - pay)<=0) {
//					System.out.println("마이너스 통장입니다.");
//				}
//				System.out.print(saving - pay + "\n");
//				System.out.println();
//			} else {
//				run = false;
//			}
//
//		}
//
//		System.out.println();
//		System.out.println("프로그램 종료\n");
//
//		sc.close();
//	}
//}
			