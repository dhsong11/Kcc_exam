package shoppingmall;

public class Member {

	private String name;
	private int age;
	private String address;

	public Member(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;

	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public void printInfo() {
		System.out.println("ȸ��: " + name + ", ����: " + age + ", �ּ�: " + address);
	}
}
