package shoppingmall;

class OrderItem {
	private Item product;
	private int amount;

	public OrderItem(Item product, int amount) {
		this.product = product;
		this.amount = amount;
	}

	public Item getProduct() {
		return product;
	}

	public int getAmount() {
		return amount;
	}

	public void printInfo() {
		System.out.println("주문 항목: " + product.getName() + ", 수량: " + amount);
	}	
}
