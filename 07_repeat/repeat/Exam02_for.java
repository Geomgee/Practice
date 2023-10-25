package repeat;

public class Exam02_for {
	public static void main(String[] args) {
		// 1~10까지의 합
//		int i = 1;
//		int sum = 0;

//		while (i <= 10) {
//			sum += i;
//			System.out.println("sum :"+sum);
//			i++; //i=i+1
//			System.out.println("i :"+i);
//		}
		
		int i;
		int sum = 0;
		
		for (i=1; i<=10; i++) {
			// 초기화 식 [1번만 실행]; 조건식[1]; 증감식[3])
			//1->2->3->1->2->3 ... 반복하다 조건식이 거짓되면 for문을 빠져나온다
			sum += i; //실행문[2]
			System.out.println("sum :"+sum + ", i :"+i); //실행문[2]
			
		}
		
		System.out.println("=================");
		System.out.println("sum = "+sum);
		System.out.println("i = "+i);
	}

}
