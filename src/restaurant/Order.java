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
        // ���� ����
        System.out.println("������ �Ϸ�Ǿ����ϴ�. �Ѿ�: $" + calculateTotal());
        items.clear(); // �ֹ� ��� �ʱ�ȭ
    }

    public List<MenuItem> getItems() {
        return items;
    }
}