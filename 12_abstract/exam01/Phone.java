package exam01;

public abstract class Phone { // 추상 클래스
	// 필드 선언
	public String owner; // 주인

	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	// 메소드
	public void turnOn(String owner) {
		System.out.println(owner + "가 전원을 켭니다.");
	}

	public void turnOff(String owner) {
		System.out.println(owner + "가 전원을 끕니다.");
	}
}
