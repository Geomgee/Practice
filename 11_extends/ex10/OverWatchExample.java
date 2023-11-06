package ex10;

import java.util.Scanner;

class OverWatch {// 부모 클래스

	// 오버라이드 메소드
	void name() {
	};

	void lClick() {
	};

	void rClick() {
	};

	void shiftButton() {
	};

	void eButton() {
	};

	void qButton() {
	};
}

class Mei extends OverWatch {

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("이름 : 메이");
	}

	@Override
	void lClick() {
		// TODO Auto-generated method stub
		super.lClick();
		System.out.println("좌클릭 : 냉각총");
	}

	@Override
	void rClick() {
		// TODO Auto-generated method stub
		super.rClick();
		System.out.println("우클릭 : 고드름 투사체");
	}

	@Override
	void shiftButton() {
		// TODO Auto-generated method stub
		super.shiftButton();
		System.out.println("shift : 급속 빙결");
	}

	@Override
	void eButton() {
		// TODO Auto-generated method stub
		super.eButton();
		System.out.println("e : 빙벽");
	}

	@Override
	void qButton() {
		// TODO Auto-generated method stub
		super.qButton();
		System.out.println("q : 눈보라");
	}
}

class Reaper extends OverWatch {

	@Override
	void name() {
		// TODO Auto-generated method stub
		System.out.println("이름 : 리퍼");
	}

	@Override
	void lClick() {
		// TODO Auto-generated method stub
		super.lClick();
		System.out.println("좌클릭 : 샷건");
	}

	@Override
	void rClick() {
		// TODO Auto-generated method stub
		super.rClick();
		System.out.println("우클릭 : 기능 없음");
	}

	@Override
	void shiftButton() {
		// TODO Auto-generated method stub
		super.shiftButton();
		System.out.println("shift : 망령화");
	}

	@Override
	void eButton() {
		// TODO Auto-generated method stub
		super.eButton();
		System.out.println("e : 그림자 밟기");
	}

	@Override
	void qButton() {
		// TODO Auto-generated method stub
		super.qButton();
		System.out.println("q : 죽음의 꽃");
	}
}

public class OverWatchExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OverWatch ow = null; // 부모 타입으로 참조변수 선언
		System.out.println("Play를 할 캐릭터 번호 선택\n(1. 메이\t2. 리퍼)");
		int num = sc.nextInt();

		if (num == 1) {
			ow = new Mei();
		} else if (num == 2) {
			ow = new Reaper();
		} else {
			System.out.println("번호를 잘못 입력하였습니다.");
		}

		ow.name();
		ow.lClick();
		ow.rClick();
		ow.shiftButton();
		ow.eButton();
		ow.qButton();

	}

}
