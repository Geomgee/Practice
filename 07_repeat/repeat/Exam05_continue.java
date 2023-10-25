package repeat;

public class Exam05_continue {
	public static void main(String[] args) {
		
		// 1~10 홀수의 합
		int i = 1;
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			if(i%2 == 0) continue;
			// continue의 의미는 앞의 조건이 맞으면 그 다음 줄은 건너뛰겠다!
			sum += i;
			System.out.println("sum: "+sum+", i: "+i);
		}
		System.out.println("=================");
		System.out.println("최종 sum: "+sum);
		System.out.println("최종 i: "+i);
	}
}
