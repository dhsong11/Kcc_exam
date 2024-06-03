package cheolwon;

public class PhoneInfo {

	private String name;
	private String phoneNo;
	private String birth;

	// 기본 생성자(생략이 가능해) + 상속 개념: 상위 -> 하위
	public PhoneInfo() {
	};

	// 파라미터 생성자
	public PhoneInfo(String name, String phoneNo, String birth) {
		// this -> 나야나
		this.name = name;
		this.phoneNo = phoneNo;
		this.birth = birth;
	};

	// 게터 세터
	

	public void printPhoneInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("생일 : " + birth);
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