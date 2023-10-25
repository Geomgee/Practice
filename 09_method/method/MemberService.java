package method;

public class MemberService{
	static String id = "";
	static String password = "";
	
	public static boolean login(String id, String password) {
		boolean result = false;
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		}
		return result;
	}
	static void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
}