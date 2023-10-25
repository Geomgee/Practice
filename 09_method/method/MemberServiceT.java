package method;

import java.util.Scanner;

public class MemberServiceT{
	
	boolean login(id, password) {
		Scanner sc = new Scanner(System.in);
		
		boolean idEqual, passwordEqual;
		String id, password;
		
		System.out.println("아이디를 입력해주세요");
		id = sc.next().substring(0);
//		idEqual = id.equals("hong");
		System.out.println("비밀번호를 입력해주세요");
		password = sc.next().substring(0);

//		passwordEqual = password.equals("12345");
		
		
//		if(idEqual && passwordEqual) {
//			return true;
//		}else {
//			return false;
//		}
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	
	void logout(String id){
		System.err.println("로그아웃 되었습니다.");
	}
	
}