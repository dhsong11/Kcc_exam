package shoppingmall;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderItem> orderItems;
	private Member member;
	private int total;

	public Order(Member member) {
		this.orderItems = new ArrayList<>();
		this.member = member;
		this.total = 0;
	}

	public void addOrderItem(OrderItem orderItem) throws Exception {
		if (!orderItem.getProduct().isAvailable(orderItem.getAmount())) {
			throw new Exception("재고 수량이 부족합니다: " + orderItem.getProduct().getName());
		}
		orderItems.add(orderItem);
		orderItem.getProduct().decreaseQuantity(orderItem.getAmount());
		calculateTotal();
	}

	public void calculateTotal() {
		total = 0;
		for (OrderItem orderItem : orderItems) {
			total += orderItem.getProduct().getPrice() * orderItem.getAmount();
		}
	}

	public void printInfo() {
		System.out.println("회원 주문: " + member.getName() + ", 총합: " + total + "원");
		for (OrderItem orderItem : orderItems) {
			orderItem.printInfo();
		}
	}
}
