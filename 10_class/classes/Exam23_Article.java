package classes;

public class Exam23_Article {
	// pdf 353
	private int seq; // 글번호
	private String subject; // 글제목
	private String content; // 글내용
	private String writer; // 작성자
	private int hit; // 조회수
	private String regDate; // 작성일시

	// getter 생성
	public int getSeq() {
		return seq;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public int getHit() {
		return hit;
	}

	public String getRegDate() {
		return regDate;
	}

	// setter 생성
	public void setSeq(int seq) {
		this.seq = seq;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	Exam23_Article() { // 기본 생성자 함수 생성

	}

	public Exam23_Article(int seq, String subject, String content, String writer, int hit, String regDate) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.hit = hit;
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return seq + "\n" + subject + "\n" + content + "\n" + writer + "\n" + hit + "\n" + regDate + "\n";
	}
}