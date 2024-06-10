package shopping;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingMall {

	private static Scanner sc = new Scanner(System.in);
	private static Category[] categories = { new Category("디지털/가전"), new Category("의류"), new Category("가구/인테리어"),
			new Category("기타") };

	private static List<Member> members;
	private static List<Item> items;
	private static List<Order> orders;


	public ShoppingMall() {
		members = new LinkedList<>();
		items = new LinkedList<>();
		orders = new LinkedList<>();
	}

	public void addMember() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.nextLine());
		System.out.print("주소 : ");
		String address = sc.nextLine();

		members.add(new Member(name, age, address));
		System.out.println("멤버 등록 완료");
	}

	public void addItem() {
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		System.out.print("상품가격 : ");
		int price = Integer.parseInt(sc.nextLine());
		System.out.print("상품수량 : ");
		int quantity = Integer.parseInt(sc.nextLine());

		showCategories();

		Item item = new Item(name, price, quantity, categories[selectCategoryNum()]);
		items.add(item);
		System.out.println("상품 등록 완료!");
	}

//	 선택한 카테고리에 해당하는 아이템 목록
    public List<Item> getCategoryProducts() {
        showCategories();
        List<Item> items = categories[selectCategoryNum()].getItems();
        for (Item item : items)
            item.printInfo();
        return items;
    }

	// 카테고리에 해당하는 물건 정보 출력
	public void showCategoryProducts() {
		List<Item> items = getCategoryProducts();
		for (Item item : items)
			item.printInfo();
	}

	// 카테고리 번호를 선택한다(카테고리를 선택한다)
	public int selectCategoryNum() {
		System.out.print("카테고리 번호 : ");
		int categoryNum = Integer.parseInt(sc.nextLine());
		return categoryNum;
	}

	// 카테고리 목록을 보여준다
	public void showCategories() {
		for (int i = 0; i < categories.length; i++) {
			System.out.print(i + "." + categories[i].getName() + "   ");
		}
		System.out.println();
	}

	public void createOrder(Member member) {
		List<OrderItem> orderItems = new ArrayList<>();

		if (member == null) {
			System.out.println("로그인 후 이용해주세요");
			return;
		}

		while (true) {
			System.out.println("구매하고 싶은 물건의 카테고리를 선택<해당 카테고리의 물건 목록을 보여줍니다>");
			List<Item> items = getCategoryProducts();
			System.out.print("구매할 상품명 : ");
			String name = sc.nextLine(); // 구매할 상품명

			// 아래 내용 Item클래스안에 validation 함수 넣어서 찾으면 Item객체 리턴하도록 하기.
			Item buyItem = null;
			for (Item item : items) {
				if (item.getName().equals(name))
					buyItem = item;
			}
			if (buyItem == null) {
				System.out.println("해당하는 상품이 없습니다.");
				continue;
			}

			System.out.print("구매할 수량 : ");
			int amount = Integer.parseInt(sc.nextLine());
			if (buyItem.validateAmount(amount)) {
				buyItem.decreaseQuantity(amount);
				orderItems.add(new OrderItem(buyItem, amount));
			} else {
				System.out.println("수량 부족!");
				continue;
			}

			System.out.print("더 구매하시겠습니까?<Y/N> : ");
			String ans = sc.nextLine();
			if (ans.equals("N"))
				break;
		}
		Order createOrder = new Order(member, orderItems);
		orders.add(createOrder);
	}

	public void print(Member member) {
		if (member == null) {
			System.out.println("로그인 후 이용해주세요");
			return;
		}

		System.out.println(member.getName() + "님이 주문한 주문 정보들 출력");
		int count = 1;

		for (Order order : orders) {
			if (order.getMember() == member) {
				System.out.println("주문 " + (count++));
				order.printOrder();
//				 orders.stream()
//		          .filter(order -> order.getMember().equals(member))
//		          .forEach(order -> {
//		              System.out.println("주문 " + (orders.indexOf(order) + 1));
//		              order.printOrder();

			}
		}
	}
}
