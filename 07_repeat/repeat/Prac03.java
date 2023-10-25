package repeat;

import java.util.Scanner;

public class Prac03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사용자에게 1~100의 수 중에서 원하는 수를 입력 받고, 배수의 개수를 구해서 출력
		int want=0;
		char answer = 0;
		
//		1.
//		//변수 선언
//		
//		//사용자의 값 받기
//		do{
//			System.out.print("몇 단을 출력할 지 입력하세요: ");
//			want = sc.nextInt();
//			for(int i=1; i<10; i++) {
//			System.out.println(want+"*"+i+"="+want*i);
//			}
//			System.out.println("계속할 지 선택하세요 (계속:y)");
//			answer = sc.next().charAt(0);
//		} while(answer=='y' || answer=='Y');
//		System.out.println("종료합니다.");
		
		
//		2.
		do{
			System.out.print("몇 단을 출력할 지 입력하세요: ");
			want = sc.nextInt();
			for(int i=1; i<10; i++) {
				System.out.println(want+"*"+i+"="+want*i);
			}
			System.out.println("계속할 지 선택하세요 (계속:y)");
			answer = sc.next().charAt(0);
			
			if(!(answer=='y' || answer=='Y')) {
				System.out.println("종료합니다.");
				break;
				}
			}while(true);
		
		
		
		sc.close();
	}

}
