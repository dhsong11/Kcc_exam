package shoppingmall;

import java.util.ArrayList;
import java.util.List;

class Category {
	private CategoryName name;
	private List<Item> products;

	public Category(CategoryName name) {
		this.name = name;
		this.products = new ArrayList<>();
	}	

	public void addItem(Item item) {
		products.add(item);
	}

	public String getName() {
		return name.getDisplayName();
	}

	public List<Item> getProducts() {
		return products;
	}
}
