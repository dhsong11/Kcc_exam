package restaurant;

public class Dessert extends MenuItem {
	private boolean glutenFree;

	public Dessert(String name, double price, String description, boolean glutenFree) {
		super(name, price, description);
		this.glutenFree = glutenFree;
	}

	public boolean isGlutenFree() {
		return glutenFree;
	}
}
