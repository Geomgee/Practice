package ex08;

public class Practice {
	public static void main(String[] args) {
		// 육군
		Army army = new Army("육군");
		army.attack();
		army.tank();
		System.out.println("=========================");
		// 해군
		Navy navy = new Navy("해군");
		navy.attack();
		navy.nucleus();
		System.out.println("=========================");
		// 육군
		AirForce airForce = new AirForce("육군");
		airForce.attack();
		airForce.bombing();
		System.out.println("=========================");
	}
}
