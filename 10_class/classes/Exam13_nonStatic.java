package classes;

class Block {
	Block() {
		System.out.println("=============");
		System.out.println("나는 생성자 함수이다");
	}

	{
		System.out.println("나는 non-static 블록이다");
		System.out.println(
				"non-static블록은 자동으로 호출이 되며, 생성자 함수보다도 더 먼저 호출되어 동작하는 특징을 가지고 있고 각 인스턴스가 생설될 때마다 생성자함수보다 먼저 각각 실행된다!!!");
	}
}

public class Exam13_nonStatic {
	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
	}
}