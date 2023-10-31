package ex06_selfEX;

public class ScoreP {
	String name;
	int kor, eng, mat;
	int tot;
	double avg;

	public ScoreP() {
		super();
	}

	public ScoreP(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getTot(int kor, int eng, int mat) {
		return tot = kor + eng + mat;
	}

	public double getAvg() {
		return this.avg = (double) this.tot / 3;
	}

	public void output_result() {
		System.out.println("이름 : " + this.name + ", 총점 : " + getTot(kor, eng, mat) + ", 평균 : " + getAvg());
	}

}
