package array;

public class Exam01 {
	public static void main(String[] args) {
		// 배열 생성하기
		int[] hong; // 배열타입 변수선언
		hong = new int[3]; // 3개의 공간에 0으로 자동 초기화
		System.out.println(hong);
		System.out.println(hong[0] + "," + hong[1] + "," + hong[2]);

		hong[0] = 75;
		hong[1] = 85;
		hong[2] = 95;

		System.out.println(hong[0] + "," + hong[1] + "," + hong[2]);

		int[] lee;
		lee = new int[] { 100, 90, 80, 40 };

		System.out.println(lee[0] + "," + lee[1] + "," + lee[2] + "," + lee[3]);

		int[] kim;
		// kim = {80,90}; //배열을 선언만 해놓고 초기화 할 때에는 new 데이터 타입[]을 선언하지 않으면 에러가 난다.

		int[] kang = { 80, 90, 100 }; // 선언과 동시에 초기화 할 때에는 new 데이터 타입[]을 선언하지 않아도 된다.

		int[] cho = new int[] { 80, 80, 90 };

		int shin[] = { 100, 90, 80 }; // 데이터 타입 변수명[] 선언도 가능하다.
		
		
		//개인별 총점 구하기
		int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0, sum5=0;
		
		sum1 = hong[0]+hong[1]+hong[2];
		System.out.println("hong씨의 총점"+sum1);
		System.out.println("hong씨의 평균"+sum1/3);
		System.out.println("----------------");
		
		for (int i=0; i<3; i++) {
			sum2 += kim[i];
		} 
		System.out.println("kim씨의 총점"+sum2);
		System.out.println("kim씨의 평균"+sum2/kim.length);
		System.out.println("----------------");

		for (int i=0; i<kang.length;i++) {
			sum3 += kang[i];
		}
		System.out.println("kang씨의 총점"+sum1);
		System.out.println("kangg씨의 평균"+sum1/hong.length);
		System.out.println("----------------");
		
		for (int i=0; i<shin.length;i++) {
			sum5 += shin[i];			
		}
		System.out.println("shin씨의 총점"+sum1);
		System.out.println("shin씨의 평균"+sum1/shin.length);
		System.out.println("----------------");
		
		
		
		
	}
}
