package classes;

public class Exam22_memberInfo {
	// 자바빈즈

	// 1)데이터를 private으로 선언
	private String name;
	private int age;
	private String id;

	// 2)getter : private로 선언한 데이터를 외부에 얻어가려면 public 으로 선언한 getter()를 이용
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	// 3)setter : private로 선언한 데이터를 외부에 설정하거나 변경하려면 public 으로 선언한 setter()이용
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Exam22_memberInfo() {
	}
	// 데이터를 초기화하기 위한 매개변수 있는 생성자 함수 생성

	public Exam22_memberInfo(String name, int age, String id) {
		super(); // 상위 생성자 함수를 호출하는 애 (기본 생성자처럼 숨어있었던 애)
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override // 주석
	public String toString() {
		return "Exam22_memberInfo [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}
