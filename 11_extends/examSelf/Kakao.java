package examSelf;

public class Kakao {
	String id; // 유저 아이디
	String name; // 닉네임
	int count = 0; // 입장한 횟수

	public Kakao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getCount() {
		return count;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
