package kosa.phone;

import java.io.Serializable;

public class UniverseInfo extends PhoneInfo implements Serializable{
	String major;
	String year;

	public UniverseInfo() {
	};

	public UniverseInfo(String name, String phoneNo, String birth, String major, String year) {
		super(name, phoneNo, birth);
		this.major = major;
		this.year = year;
	}
	


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public void printUniverseInfo() {
		System.out.println("학과: " + major);
		System.out.println("년도: " + year);

	}

}
