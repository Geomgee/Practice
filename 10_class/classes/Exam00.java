package classes;

//클래스 명은 대문자로 시작한다.
//클래스는 필드만 가질 수도, 메소드만 가질수도, 동시에 가질 수도 있다.
public class Exam00 { // 클래스 앞에 붙는 접근 제한자는 public, default 둘 중 하나를 사용할 수 있다.
	// 필드는 4가지 접근 제한자를 가진다
	public int x = 100; // 어디서나 접근 가능, 다른 패키지에서도 접근 가능
	protected int y = 200; // 같은 패키지 안에서 접근 가능한 접근 제한자
	int z = 300; // default //(안 붙이는 것) 같은 패키지 안에서 접근 가능한 제한자
	private static int alpha = 400; // 같은 클래스 안에서만 접근 가능

	public static void main(String[] args) {
		System.out.println(alpha);
		/* System.out.println(beta); */
		System.out.println("private 접근 제한자는 같은 클래스 파일 안에서 선언해도 다른 클래스 안에 가지고 있으면 접근이 불가능하다.");
			
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
}
