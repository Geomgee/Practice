package repeat;

public class Exam04_break {
	public static void main(String[] args) {
		
		//1~10 까지의 합
		int i = 1;
		int sum = 0;
		
		while(true) { // 조건식에 true를 주면 무한루프를 돌리겠다는 의미.
			sum += i;
			if(i>=10) break; // 무조건 성립하는 조건식을 넣었을 때는 반드시 탈출 명령어가 있어야 한다.
			i++;
			System.out.println("i: "+i +", sum: "+sum);
		}
		System.out.println("=================");
		System.out.println("최종 sum: "+sum);
		System.out.println("최종 i: "+i);
	}
}
