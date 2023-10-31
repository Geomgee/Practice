package ex08;

public class Unit {
	private String name;

	// 기본 생성자 함수
	public Unit() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 매개변수가 있는 생성자 함수
	public Unit(String name) {
		super();
		this.name = name;
	}

	public void attack() {
		System.out.println(name + " >> 공격 준비");
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
