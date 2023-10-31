package ex06_selfEX;

public class ScoreC extends ScoreP {
	int mus, com;

	public ScoreC(String name, int kor, int eng, int mat, int mus, int com) {
		// TODO Auto-generated constructor stub
		super();
		super.name = name;
		super.kor = kor;
		super.eng = eng;
		super.mat = mat;
		this.mus = mus;
		this.com = com;
	}

	public int getTot(int mus, int com) {
		return tot = super.getTot(kor, mat, eng) + mus + com;
	}

	public double getAvg() {
		return super.avg = (double) tot / 5;
	}

	public void output_result() {
		System.out.println("이름 : " + this.name + ", 총점 : " + getTot(mus, com) + ", 평균 : " + getAvg());
	}

}
