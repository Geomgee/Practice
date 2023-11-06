package customer;

public class CustomerVO {
	private int customerNum; // 고객 번호
	private String name; // 고객 이름
	private String phoneNum; // 고객 이름

//	public CustomerVO() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public CustomerVO(int customerNum, String name, String phoneNum) {
//		super();
//		this.customerNum = customerNum;
//		this.name = name;
//		this.phoneNum = phoneNum;
//	}

	// getter, setter
	public int getCustomerNum() {
		return customerNum;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setCustomerNum(int customerNum) {
		this.customerNum = customerNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	// toString override
	@Override
	public String toString() {
		return String.format("%4d\t%4s\t%13s", customerNum, name, phoneNum, null);
	}

}
