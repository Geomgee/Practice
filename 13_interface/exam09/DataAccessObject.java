package exam09;

public interface DataAccessObject {
	// DB의 4가지 기능 => create, read, update, delete => CRUD
	void insert(); // 삭제 기능

	void select(); // read

	void update(); // 업데이트

	void delete(); // 삭제
}
