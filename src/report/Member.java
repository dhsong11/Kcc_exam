package report;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private String username;
	private String address;
	private int age;
	private List<Product> products = new ArrayList<Product>();
	private List<Event> events = new ArrayList<Event>();

	public Member() {
	}

	public Member(String username, String address, int age) {
		super();
		this.username = username;
		this.address = address;
		this.age = age;
	}

	public void order(Product product) {
		products.add(product);
		product.decrease();
	}

	public void cancelOrder(Product product) {
		products.remove(product);
		product.increase();
	}

	public void participate(Event event) {
		events.add(event);
		event.addMember(this);
	}

	public void cancelEvent(Event event) {
		events.remove(event);
	}

	public void printInfo() {
		System.out.println("회원이름: " + username + ", 회원주소: " + address +", 회원나이: "+ age);
		for(Product s: products) {
			System.out.println(s.getname());
			
		
		}
		
		for(Event e: events) {
			System.out.println(e.getname());
		}
	}

}

