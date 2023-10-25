package repeat;

public class Exam07_multiple {
	public static void main(String[] args) {
		//1~100까지의 수에서 5의 배수이면 출력
		for(int i=1; i<=100; i++) {
			if(i%5==0) System.out.print(i+" ");
		}
		
		System.out.println("==================");
		//1~100까지의 수에서 3의 배수이면서 7의 배수를 동시에 만족시 출력
		for(int i=1; i<=100; i++) {
			if(i%3==0 && i%7==0) System.out.println(i+" ");
		}
	}
}
