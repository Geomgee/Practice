package casting;

public class Exam03 {
	public static void main(String[] args) {
		// 자동 형 변환
		short s = 100;
		int i = s;
		long l = i;
		float f = l;
		double d = f;

		System.out.println("s=" + s);
		System.out.println("i=" + i);
		System.out.println("l=" + l);
		System.out.println("f=" + f);
		System.out.println("d=" + d);

		
	}
}
