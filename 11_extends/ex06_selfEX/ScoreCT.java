package ex06_selfEX;

public class ScoreCT extends ScoreP {
	int mus, com;

	public ScoreCT(String name, int kor, int eng, int mat, int mus, int com) {
		super(name, kor, eng, mat);
		this.mus = mus;
		this.com = com;
	}

	// @Override
	int getTot() {
		tot = kor + eng + mat + mus + com;
		return tot;
	}

	// @Override
	double getAvg() {
		avg = (double) tot / 5;
		return avg;
	}

}
