package kosa.oop;

public class Member {
		
	
		    String name;
		    int age;
		    String email;

		    public Member(String name, int age, String email) {
		        this.name = name;
		        this.age = age;
		        this.email = email;
		    }

		    public void displayInfo() {
		        System.out.println("�̸�: " + name);
		        System.out.println("����: " + age);
		        System.out.println("�̸���: " + email);
		    

	}

}
