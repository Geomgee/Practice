package examSelf;

import java.util.Scanner;

public class KakaoP extends Kakao {
	public static Kakao[] user = new Kakao[5]; // 유저 배열
	static Scanner sc = new Scanner(System.in);
	static int num; // 유저의 수
	static int find;
	// 닉네임 변경

	// find 유저 배열 찾기
	public int find(String id) {
		for (int i = 0; i < num; i++) {
			if (user[i].getId().equals(id)) {
				find = i;
			}
		}
		return find;
	}

	// 입장 메세지 출력
	static void input(Scanner sc) {
		System.out.println("채팅방에 입장하시겠습니까 ? : ");
		String select = sc.next();
		if ((sc.next().equals("y") || (sc.next().equals("Y")){
			for (int i = 0; i < user.length; i++) {
				if (count == 0) {
					System.out.print("변경할 닉네임을 입력해주세요 : ");
				} else {
					// count(입장횟수)가 0이 아닐 경우에 바로 입장
					System.out.println(". /) /)");
					System.out.print("ฅ(• - •)ฅ 처음 오셨군요! 당신의 닉네임을 입력해주세요 :");
					user[i].getName() = sc.next();
					count++;
				}
				System.out.println(user[i].getName() + "님이 들어왔습니다.");
			}
		}
	}

	// 퇴장 메세지 출력
	public void output(Scanner sc) {
		System.out.println(user[find].getName() + "님이 퇴장하였습니다.");
	}

	// 실행
	public static void main(String[] args) {
		do {
			input(sc);

		} while (true);
	}

}
