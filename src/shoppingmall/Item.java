package shoppingmall;

class Item {
	private String name;
	private int price;
	private int quantity;
	private Category category;

	public Item(String name, int price, int quantity, Category category) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		category.addItem(this);
	}

	public void printInfo() {
		System.out.println("ǰ��: " + name + ", ����: " + price + "��" +", ����: " + quantity + ", ī�װ�: " + category.getName());
	}

	public void increaseQuantity(int amount) {
		this.quantity += amount;
	}

	public void decreaseQuantity(int amount) {
		this.quantity -= amount;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public boolean isAvailable(int amount) {
		return quantity >= amount;
	}
}
