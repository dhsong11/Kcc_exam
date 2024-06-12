package kosa.io;

import java.io.Serializable;

public class Video implements Serializable{
	private String sno;
	private String title;
	private String actor;
	  
	public Video() {}

	public Video(String sno, String title, String actor) {
		super();
		this.sno = sno;
		this.title = title;
		this.actor = actor;
	}
	
	
	public void show() {
		System.out.println("번호 : " + sno);
		System.out.println("제목 : " + title);
		System.out.println("배우 : " + actor);
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}
	
	
}