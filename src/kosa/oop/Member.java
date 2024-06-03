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
		        System.out.println("이름: " + name);
		        System.out.println("나이: " + age);
		        System.out.println("이메일: " + email);
		    

	}

}
