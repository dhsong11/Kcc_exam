package restaurant;

public class MenuItem {
	private String name;
	private double price;
	private String description;

	public MenuItem(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public double getPrice() {
		return price;
	}
}
