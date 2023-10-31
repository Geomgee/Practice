package ex08;

public class Navy extends Unit {

	public Navy(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println(getName() + " >> 어뢰 발사!");
		System.out.println(getName() + " >> 지상 착륙!");
	}

	public void nucleus() {
		System.out.println(getName() + " >> 핵 미사일 공격");

	}

}
