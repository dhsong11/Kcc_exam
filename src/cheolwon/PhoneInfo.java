package cheolwon;

public class PhoneInfo {

	private String name;
	private String phoneNo;
	private String birth;

	// �⺻ ������(������ ������) + ��� ����: ���� -> ����
	public PhoneInfo() {
	};

	// �Ķ���� ������
	public PhoneInfo(String name, String phoneNo, String birth) {
		// this -> ���߳�
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	};

	// ���� ����
	

	public void printPhoneInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNo);
		System.out.println("���� : " + birth);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

}