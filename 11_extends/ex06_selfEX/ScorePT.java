package ex06_selfEX;

public class ScorePT {
	String name;
	int kor, eng, mat;
	int tot;
	double avg;

	public ScorePT(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	int getTot() {
		tot = kor + eng + mat;
		return tot;
	}

	double getAvg() {
		return (double) tot / 3;
	}

	void output_result() {
		System.out.printf("이름 : %s, 총점 : %d, 평균 : %0.2f", name, getTot(), getAvg());
	}
}
