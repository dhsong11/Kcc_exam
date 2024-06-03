package cheolwon;

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
	


	public void printUniverseInfo() {
		System.out.println("�а� : " + major);
		System.out.println("�г� : " + year);

	}

}
