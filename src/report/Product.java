package report;

public class Product {
	private String name;
	private int price;
	private int quantity;
	
	public Product() {}

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//��ǰ�������
	public void printInfo() {
		System.out.println("��ǰ��: " + name);
		System.out.println("��ǰ����: " + price);
		System.out.println("��ǰ����: " + quantity);
	}
	
	public void increase() {
		quantity++;
	}
	
	public void decrease() {
		quantity--;
	}
	
	

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public int getprice() {
		return price;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}