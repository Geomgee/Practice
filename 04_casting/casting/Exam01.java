package casting;

public class Exam01 {
	public static void main(String[] args) {
		// 형변환에는 두가지(자동 형변환, 강제 형변환)이 있다.
		long l;
		int i = 1000;
		l = i * i; // 자동 형변환
		System.out.println(l);

		byte bi, bj;
		int i1 = 100, j1 = 300;
		bi = (byte) i1;
		System.out.println(i1);
		bj = (byte) j1;
		System.out.println(bj); // 강제로 형변환시에는 데이터가 왜곡될 수 있음에 유의

		byte b1 = 10, b2;
		int i2 = 5;
		System.out.println(i2);
		b2 = (byte) (b1 + i2);
		System.out.println(b2);

		byte b3 = 5, b4;
		b4 = (byte) (b3 + 3); //계산식에 리터럴이 포함되어있는 경우   
								//정수 데이터 : int / 실수 데이터 : double형으로 간주해서 계산
	}

}
