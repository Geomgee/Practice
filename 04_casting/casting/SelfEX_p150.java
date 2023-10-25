package casting;

import java.util.Scanner;

public class SelfEX_p150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String name;
		String birth;
		String tel;

		System.out.println("[필수 정보 입력]");

		System.out.print("1. 이름 : ");
		name = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		birth = sc.nextLine();
		System.out.print("3. 전화번호: ");
		tel = sc.nextLine();
		
		System.out.println();
		System.out.printf("[입력한 내용]\n%s\n%s\n0%s", name, birth, tel);
		
		
		sc.close();
	
	}
	}