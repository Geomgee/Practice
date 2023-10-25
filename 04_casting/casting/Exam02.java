package casting;

public class Exam02 {
	public static void main(String[] args) {
		// 자동 형 변환

		double d = 123456789012345L;
		float f = (float) d;
		long l = (long) f;
		int i = (int)l;
		short s = (short)i;

		System.out.println("d=" + d);
		System.out.println("f=" + f); // 큰 데이터를 작은 데이터 타입에 담으려고 하면 데이터를 모두 담지 못해서
										// 강제 형 변환을 통해서 데이터를 쪼개서 넣게 되고 왜곡된 값이 들어갈 수 있다.
		System.out.println("l=" + l);
		System.out.println("i=" + i);
		System.out.println("s=" + s);

	}
}
