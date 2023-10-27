package lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	// 로또 생성기
	int[] set; // 로또번호 1세트(6개의 숫자) 값 저장
	int buyNum; // 구매 수량 저장

	// 생성자 함수를 이용하여 로또번호 1세트의 배열이 생성되도록 함
	public Lotto() {
		set = new int[6]; // 초기화
	}

	// 입력 받는 함수 : 구매 수량 입력받아 저장
	public void inputBuyNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("구매 수량을 입력하세요");
		buyNum = sc.nextInt();

	}

	// 연산 : 로또번호 1세트 생성
	public void selectLotto() {
		boolean chk; // 숫자가 중복되면 true 저장

		// 1~45까지의 숫자 중에서 임의의 데이터를 생성
		Random random = new Random();
		set[0] = random.nextInt(45) + 1;
		// 1~45 범위 안의 임의 정수 1개 생성해서 배열의 첫번째 저장

		for (int i = 1; i < 6;) {
			set[i] = random.nextInt(45) + 1;

			// 번호 중복 검사 코드 추가
			chk = false;
			for (int b = 0; b < i; b++) { // 비교값을 b변수에 저장해서 비교
				if (set[i] == set[b]) {
					chk = true; // 숫자가 중복되면
					break;
				}
			}
			if (!chk) {
				i++; // chk가 false 이면 i값 증가
			}
		}
	}

	// 로또 1세트 번호를 오름차순 정렬 => 선택정렬 알고리즘
	public void sort() {
		for (int x = 0; x < 5; x++) { // 기준값
			for (int y = x + 1; y < 6; y++) { // 비교값
				if (set[x] > set[y]) { // 기준값이 비교값보다 크면 두 값을 교환
					int temp = set[x]; // 임시변수 생성
					set[x] = set[y]; // 작은 값을 x 위치에 담는다
					set[y] = temp; // 큰 값을 temp로 옮겨놓는다
				}
			}
		}
	}

	// 출력
	public void outputResult() {
		for (int i = 0; i < 6; i++) {
			System.out.printf(" %2d ", set[i]);
		}
		System.out.println();
	}

	// 전체를 관리하는 함수 (실행)
	public void doLotto() {
		inputBuyNum();
		for (int i = 0; i < buyNum; i++) {
			selectLotto();
			sort();
			outputResult();
		}
	}
}
