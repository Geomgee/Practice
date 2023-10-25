package array;

public class Exam08 {
	public static void main(String[] args) {

		// 2차원 배열 (학생 3명의 국어, 영어 점수}
		int[][] scores = new int[3][2]; // 크기가 3인 1차열 배열을 2개 만들기
		String[] names = { "햄배걸", "효지턱", "싼드로" };

		// 햄배걸의 점수
		scores[0][0] = 80;
		scores[0][1] = 50;

		// 효지턱의 점수
		scores[1][0] = 10;
		scores[1][1] = 100;

		// 싼드로의 점수
		scores[2][0] = 70;
		scores[2][1] = 50;

		System.out.println("scores.length: " + scores.length);
		System.out.println("scores.length: " + scores[0].length);
		System.out.println("scores.length: " + scores[1].length);
		System.out.println("scores.length: " + scores[2].length);

		// 2차원 배열의 총점과 평균점수 구하기
		for (int i = 0; i < scores.length; i++) {
			int sum = 0, avg = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			avg = sum / scores[i].length;
			
			System.out.printf("%s: 총점= %d, 평균= %d\n",names[i], sum, avg);
		}
	}
}
