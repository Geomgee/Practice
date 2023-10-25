package method;

import java.util.Scanner;

public class MemberServiceExampleT{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		MemberServiceT memberService = new MemberServiceT();
		String id = null, password = null;
		
		boolean result = memberService.login(id, password);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}