package ex08;

public class Army extends Unit {

	public Army(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		super.attack();
		System.out.println(getName() + " >> 지상 공격 실행");
	}

	public void tank() {
		System.out.println(getName() + " >> 탱크 공격");

	}

}
