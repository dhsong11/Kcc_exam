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

	
	public void printCompanyInfo() {
		System.out.println("회사이름 : " + dept);
		System.out.println("직책 : " + position);

	}

}
