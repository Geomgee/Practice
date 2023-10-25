package classes;

class Data {
	// 필드에도 4가지 접근 제한자가 있다
	public int x;
	private int y;
	protected int z;
	int alpha;
}

public class Exam21_accessField {
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		// data.y = 20; //private은 같은 파일이여도 같은 클래스가 아니면 접근이 안 된다.
		data.z = 40;
		data.alpha = 50;
		System.out.println(data.x + ", " + data.z + ", " + data.alpha);
	}
}
