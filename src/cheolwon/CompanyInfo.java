package cheolwon;

// ���۴ϴ� �������� �ڽ��̴�.
public class CompanyInfo extends PhoneInfo {

//	private String name;
//	private String phoneNo;
//	private String birth;

	private String dept;
	private String position;

	public CompanyInfo() {
	};

	public CompanyInfo(String name, String phoneNo, String birth, String dept, String position) {
		// super: �θ�
		super(name, phoneNo, birth);
		this.dept = dept;
		this.position = position;
	};

	public void printCompanyInfo() {
		System.out.println("ȸ���̸� : " + dept);
		System.out.println("��å : " + position);

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
//		System.out.println("�̸� : " + name);
//		System.out.println("��ȭ��ȣ : " + phoneNo);
//		System.out.println("���� : " + birth);
//	}
	
	// getter setter 
}
