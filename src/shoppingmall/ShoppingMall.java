package shoppingmall;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ShoppingMall {
	private List<Category> categories;
	private List<Member> members;
	private List<Order> orders; 

	public ShoppingMall() {
		categories = new ArrayList<>();
		members = new ArrayList<>();
		orders = new ArrayList<>();
		initializeCategories();
	}

	private void initializeCategories() {
		for (CategoryName categoryName : CategoryName.values()) {
			categories.add(new Category(categoryName));
		}
	}

	public void addItem() { //��ǰ ���
		Scanner sc = new Scanner(System.in);
		System.out.print(">��ǰ �̸�: ");
		String name = sc.nextLine();
		System.out.print(">����: ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print(">����: ");
		int quantity = Integer.parseInt(sc.nextLine());
		System.out.println(">ī�װ� ����:");
		for (int i = 0; i < CategoryName.values().length; i++) {
			System.out.println((i + 1) + ". " + CategoryName.values()[i].getDisplayName());
		}
		int categoryIndex = Integer.parseInt(sc.nextLine()) - 1;

		Category category = categories.get(categoryIndex);
		new Item(name, price, quantity, category);
	}

	public void listItems() { 
		for (Category category : categories) {
			System.out.println("ī�װ�: " + category.getName());
			for (Item item : category.getProducts()) {
				item.printInfo();
			}
		}
	}

	public void searchByCategory() { 
		Scanner sc = new Scanner(System.in);
		System.out.println(">ī�װ� ����:");
		for (int i = 0; i < CategoryName.values().length; i++) {
			System.out.println((i + 1) + ". " + CategoryName.values()[i].getDisplayName());
		}
		int categoryIndex = Integer.parseInt(sc.nextLine()) - 1;

		if (categoryIndex >= 0 && categoryIndex < categories.size()) {
			Category category = categories.get(categoryIndex);
			System.out.println("ī�װ�: " + category.getName());
			for (Item item : category.getProducts()) {
				item.printInfo();
			}
		} else {
			System.out.println("�߸��� ī�װ� �����Դϴ�.");
		}
	}

	public Item search(String searchName) { 
		for (Category category : categories) {
			for (Item item : category.getProducts()) {
				if (item.getName().equalsIgnoreCase(searchName)) {
					return item;
				}
			}
		}
		return null;
	}

	public void addMember() { //ȸ�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print(">ȸ�� �̸�: ");
		String name = sc.nextLine();
		System.out.print(">ȸ�� ����: ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print(">ȸ�� �ּ�: ");
		String address = sc.nextLine();

		members.add(new Member(name, age, address));
	}

	public void listMembers() { //ȸ�� ��� ���
		for (Member member : members) {
			member.printInfo();
		}
	}

	public void addOrder() { //�ֹ� �߰�
		Scanner sc = new Scanner(System.in);
		System.out.print(">ȸ�� �̸�: ");
		String memberName = sc.nextLine();
		Member member = null;
		for (Member m : members) {
			if (m.getName().equalsIgnoreCase(memberName)) {
				member = m;
				break;
			}
		}
		if (member == null) {
			System.out.println("�ش� ȸ���� �����ϴ�.");
			return;
		}

		Order order = new Order(member);
		while (true) {
			System.out.print(">��ǰ �̸� (�����Ϸ��� 'exit' �Է�): ");
			String itemName = sc.nextLine();
			if (itemName.equalsIgnoreCase("exit"))
				break;

			Item item = search(itemName);
			if (item == null) {
				System.out.println("�ش� ��ǰ�� �����ϴ�.");
				continue;
			}

			System.out.print(">����: ");
			int amount = Integer.parseInt(sc.nextLine());

			try {
				order.addOrderItem(new OrderItem(item, amount));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		orders.add(order);
	}

	public void listOrders() { //�ֹ� ��� ���
		for (Order order : orders) {
			order.printInfo();
		}
	}
}
