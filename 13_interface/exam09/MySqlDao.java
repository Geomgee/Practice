package exam09;

public class MySqlDao implements DataAccessObject {
	// DAO : data access object : 데이터에 접근하는 클래스
	public String db = "MySql DB";

	@Override
	public void insert() {
		System.out.println(db + "에서 삽입");
	}

	@Override
	public void select() {
		System.out.println(db + "에서 검색");

	}

	@Override
	public void update() {
		System.out.println(db + "에서 수정");

	}

	@Override
	public void delete() {
		System.out.println(db + "에서 삭제");

	}

}
