package restaurant;

public class MainCourse extends MenuItem {
	private boolean vegetarian;

	public MainCourse(String name, double price, String description, boolean vegetarian) {
		super(name, price, description);
		this.vegetarian = vegetarian;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}
}
