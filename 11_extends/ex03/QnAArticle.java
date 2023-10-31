package ex03;

public class QnAArticle extends ArticleDTO {
	private String answer; // 답변글

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "QnAArticle [answer=" + answer + ", getAnswer()=" + getAnswer() + ", getNum()=" + getNum()
				+ ", getTitle()=" + getTitle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
