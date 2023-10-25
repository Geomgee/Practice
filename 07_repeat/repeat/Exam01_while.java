package repeat;

public class Exam01_while {
	public static void main(String[] args) {
		int a=1;
		
		do { // 조건식이 참이든 거짓이든 무조건 한 번은 do안의 구문을 실행한다!
			System.out.println("Hello world!!");
			a++;
			System.out.println("a: "+a);
			System.out.println("==================");
		}while(a<=5); // 조건식 뒤에 ; 확인!!
	}

}
