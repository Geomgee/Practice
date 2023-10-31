package ex06_selfEX;

public class Practice {
	public static void main(String[] args) {

		// 국어 영어 수학 과목 성적 처리
		ScoreP sP = new ScoreP("홍길동", 90, 80, 70);
		sP.output_result();
		System.out.println("---------------------------------");

		ScoreC sC = new ScoreC("김철수", 91, 81, 71, 82, 92);
		sC.output_result();
	}

}
