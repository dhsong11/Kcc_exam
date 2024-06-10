package kosa.phone;

public class CompanyInfo extends PhoneInfo {

	String dept;
	String position;

	public CompanyInfo() {
	};

	public CompanyInfo(String name, String phoneNo, String birth, String dept, String position) {
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;

	};

	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void printCompanyInfo() {
		System.out.println("회사이름 : " + dept);
		System.out.println("직책 : " + position);

	}

}
