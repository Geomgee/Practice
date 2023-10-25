package array;

import java.util.Arrays;

public class Exam02 {
	public static void main(String[] args) {
		// 배열 생성하기
		int[] coding_score = {100,90,80,70,60};
		
		//차례대로 코딩점수를 출력
		for (int i=0; i<coding_score.length; i++) {
			System.out.println(coding_score[i]);
		}
		System.out.println("=====================");
		System.out.println(Arrays.toString(coding_score));
		//Arrays.toString(배열의 변수명) => 배열을 통째로 출력할 수 있다.
		//Arrays.toString(coding_score) => 배열을 통째로 출력할 수 있다.
				
		
	}
}
