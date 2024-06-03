package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void checkout() {
        // 결제 로직
        System.out.println("결제가 완료되었습니다. 총액: $" + calculateTotal());
        items.clear(); // 주문 목록 초기화
    }

    public List<MenuItem> getItems() {
        return items;
    }
}