package classes;

public class Exam24_Address {
	// pdf 360
	private String name;
	private String tel;
	private String addr;

	// getter
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddr() {
		return addr;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Exam24_Address() {

	}

	public Exam24_Address(String name, String tel, String addr) {
		super();
		this.name = name;
		this.tel = tel;
		this.addr = addr;
	}

	public String showAddress() {
		return "이름 : " + name + "\n전화 : " + tel + "\n주소 : " + addr;
	}

}
