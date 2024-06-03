package cheolwon;

// 컴퍼니는 폰인포의 자식이다.
public class CompanyInfo extends PhoneInfo {

//	private String name;
//	private String phoneNo;
//	private String birth;

	private String dept;
	private String position;

	public CompanyInfo() {
	};

	public CompanyInfo(String name, String phoneNo, String birth, String dept, String position) {
		// super: 부모
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	};

	public void printCompanyInfo() {
		System.out.println("회사이름 : " + dept);
		System.out.println("직책 : " + position);

	}

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

//	public void printPhoneInfo() {
//		System.out.println("이름 : " + name);
//		System.out.println("전화번호 : " + phoneNo);
//		System.out.println("생일 : " + birth);
//	}
	
	// getter setter 
}
