package kosa.io;

import java.io.Serializable;

public class Member implements Serializable{

	private String name;
	private int age;
	private Video video;
	
	
	public Member() {}
	
	public Member(String name, int age, Video video) {
		super();
		this.name = name;
		this.age = age;
		this.video = video;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", video=" + video + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
}
