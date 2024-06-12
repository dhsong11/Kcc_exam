package kosa.phone;

import java.io.Serializable;

public class CompanyInfo extends PhoneInfo implements Serializable{

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
		System.out.println("부서 : " + dept);
		System.out.println("직책 : " + position);

	}

}