package oop3;

import oop3.Role;

public class Person {
	String name;
	private Role role;
	
	public Person() {}

	public Person(String name, Role role) {
		super();
		this.role = role;
	}
	
	public void doit() {
		role.doing();
	}
}
