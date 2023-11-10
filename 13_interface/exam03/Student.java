package exam03;

// 인터페이스는 클래스와는 다르게 다중 상속을 허용한다
public class Student implements Allowance, Academy {
// 인터페이스를 구현하는 클래스에서는 추상 메소드를 구현 할 때 부모가 가지고 있는 접근제한인
// public 보다 더 강하게 접근할 수 없기 때문에 public 접근 제한자를 붙이지 않으면 Error!
	@Override
	public void pay(int academy_fee, String name) {
		System.out.printf("%s 학원비 %d원 입금 완료", name, academy_fee);
	}

	@Override
	public void in(int value, String name) {
		System.out.printf("%s에게서 %d원 용돈을 받았습니다", name, value);

	}

	@Override
	public void out(int value, String name) {
		System.out.printf("금액 %d원을 %s(으)로 지출하였습니다", value, name);

	}
}