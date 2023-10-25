package geomji_java;

public class Exam03 {

	public static void main(String[] args) {
		//정수의 나눗셈 : 몫 구하기
		System.out.println(5 / 2); //int/int=>int형
	
		//실수의 나눗셈
		System.out.println(5.0 / 2.0); //double/double=>double형
		
		//정수/실수
		System.out.println(5.0 / 2); //double/int=>정수 데이터는 실수 데이터보다 작다
		
		//정수는 0으로 나눌 수 없다. error
//		System.out.println(5 / 0);
		
		//실수는 0으로 나눌 수 있다. 여기서 0.0 실수 데이터는 0.0000000000(...)1을 의미
		System.out.println(5.0/0.0);
		System.out.println(5.0/0);
		System.out.println(5/0.0);
		
	}

}
