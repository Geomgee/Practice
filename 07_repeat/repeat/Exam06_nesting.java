package repeat;

public class Exam06_nesting { //nesting = 새둥지  ⁂ 모여있다 중첩된다 중복
	public static void main(String[] args) {
		
		//가로 구구단
		for(int a=2; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				System.out.printf("%dx%d = %2d \n",a,b,a*b);
			}
			System.out.println();
		}
		System.out.println("———————————————————");
		//세로 구구단
		for(int b=1; b<=9; b++) {
			for(int a=2; a<=9; a++)
			System.out.printf("%dx%d = %2d \n",a,b,a*b);
		}
		System.out.println();
	}
}
