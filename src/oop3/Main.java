package oop3;

public class Main {

	public static void main(String[] args) {

		Role role = new Work();
		role.doing();
		
		Role role2 = new Student();
		role2.doing();
		
		Person person = new Person("sdsd",role);
		person.doit();
		
		Person person2 = new Person("しししし",role2);
		person2.doit();
		
		

	}

}
