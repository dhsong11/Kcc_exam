package report;

import java.util.ArrayList;
import java.util.List;

public class Event {

	private String name;
	private String period;
	private List<Member> members = new ArrayList<Member>();

	
	public Event() {}
	
	public Event(String name, String period) {
		super();
		this.name = name;
		this.period = period;
	}
	
	//상품정보출력
	public void printEvent() {
		System.out.println("이벤트명: " + name);
		System.out.println("이벤트기간: " + period);
	}


	public void addMember(Member member) {
		members.add(member);
		
	}
	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getperiod() {
		return period;
	}

	public void setperiod(String period) {
		this.period = period;
	}



}
