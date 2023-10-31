package ex03;

public class FileArticle extends ArticleDTO {
	private String FileName; // 파일명

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	@Override
	public String toString() { // toString()메소드는 원래 최상위 객체인 object 객체가 가지고 있는 메소드인데 보통 다른 클래스에서 오버라이드를 해서 해당
								// 객체가 가지고 있는 필드를 출력하는 용도로 많이 사용한다
		return "파일이름: " + FileName + " / 자료실 번호: " + getNum() + " / 제목: " + getTitle();
	}

}
