package ex08;

public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println(getName() + " >> 이륙!!");
		System.out.println(getName() + " >> 공중 공격 실행!");
	}

	public void bombing() {
		System.out.println(getName() + " >> 폭격");
	}
}
