package restaurant;

public class Appetizer extends MenuItem {
	private int calories;

	public Appetizer(String name, double price, String description, int calories) {
		super(name, price, description);
		this.calories = calories;
	}

	public int getCalories() {
		return calories;
	}
}
