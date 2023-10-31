package ex03;

public class ArticleDTO { // 자바빈즈
	private int num; // 글번호
	private String title; // 글제목

	// getter
	public int getNum() {
		return num;
	}

	public String getTitle() {
		return title;
	}

	// setter
	public void setNum(int num) {
		this.num = num;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}