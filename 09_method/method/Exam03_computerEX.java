package method;

public class Exam03_computerEX {
	public static void main(String[] args) {
		//데이터타입(클래스타입) 변수명 = new 사용하고자하는 클래스 명(); => 클래스명(): 생성자 함수
		Exam03_computer myCom = new Exam03_computer();
		
		int[] values1 = {1,2,3,4,10,100};
		int result1 = myCom.sum1(values1); //sum1(int[] values)
		System.out.println(result1);
		
		int result2 = myCom.sum2(1,2,3); //sum2(int...values)
		System.out.println(result2);
		
		int result3 = myCom.sum2(1,2,3,10,100); //sum2(int...values)
		System.out.println(result3);
		
		int result4 = myCom.sum1(new int[] {1,2,3}); //sum2(int...values)
		System.out.println(result4);
	}
}
