package ex03;

public class ArticleExample {
	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		fileArticle.setNum(1);// 부모가 가지고 있는 글번호 설정하는 메소드
		fileArticle.setTitle("첫번째 자료입니다");// 부모가 가지고 있는 글제목 설정하는 메소드
		fileArticle.setFileName("java.ppt"); // 자식이 가지고 있는 메소드
		System.out.println("=================================================");
		System.out.println(fileArticle.toString());

		QnAArticle qna = new QnAArticle();
		qna.setNum(2);
		qna.setTitle("두번째 자료입니다");
		qna.setAnswer("답변입니다=====");
		System.out.println(qna); // 변수명<<.toString()>> <- 생략가능
	}
}