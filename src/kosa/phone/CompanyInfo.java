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
		System.out.println("ȸ���̸� : " + dept);
		System.out.println("��å : " + position);

	}

}
