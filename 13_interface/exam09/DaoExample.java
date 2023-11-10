package exam09;

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.select();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new MySqlDao());
		dbWork(new OracleDao()); // OOP 의 개념 : 쉽게 붙였다 뗏다 위 아님 아래 () 괄호 속 만 바꾸면 되는
	}
}
