package variable;

public class SelfEX_p073 {

	public static void main(String[] args) {
//4번 문제
		int v1 = 0;
		if (true) {
			int v2 = 0;
			if (true) {
				int v3 = 0;
				v1 = 1;
				v2 = 2;
				v3 = 3;
				v1 = v2 + v3;
			}
		}
		System.out.println(v1);
	}

}
