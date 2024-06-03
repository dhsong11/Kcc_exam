package kosa.oop;

public class UniverseInfo extends PhoneInfo{
	String major;
	String year;

	public UniverseInfo() {
	};

	public UniverseInfo(String name, String phoneNo, String birth, String major, String year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}
	public UniverseInfo(String major, String year) {
		this.major = major;
		this.year = year;

	};

	public void addUniverseInfo(String major, String year) {

	}

	public void printUniverseInfo() {
		System.out.println("이름 : " + major);
		System.out.println("직책 : " + year);

	}

}
