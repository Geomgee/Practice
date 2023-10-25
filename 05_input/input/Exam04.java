package input;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. 변수 선언 : 이름, 성별(F/M), 나이, 키
		String name, realGender = " ";
		char gender;
		int age;
		double height;

		System.out.println("이름을 입력해 주세요");
		name = sc.nextLine();
		System.out.println("성별을 입력해 주세요 (F 혹은 M 둘중에 하나만 입력해주세요.)");
		gender = sc.next().charAt(0); // 체이닝 방식 ( 메소드 연결 )
		System.out.println("나이를 입력해 주세요 (숫자만 입력해주세요)");
		age = sc.nextInt();
		System.out.println("키를 입력해 주세요 예시: 130.2");
		height = sc.nextDouble();

		// 3. 성별을 출력하는 연산
		if (gender == 'F' || gender == 'f') {
			realGender = "여자";
		} else if (gender == 'M' || gender == 'm') {
			realGender = "남자";
		} else {
			System.out.println("성별을 정확하게 다시 입력해주세요.");
		}

		// 4. 데이터를 출력
		System.out.println("이름: " + name);
		System.out.println("성별: " + realGender);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);

		sc.close();
	}

}
