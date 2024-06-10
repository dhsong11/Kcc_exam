package shopping;

public class OrderItem {
    private Item item;
    private int amount;

    private Order order;

    public OrderItem(Item item, int amount) {
        this.item = item;
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public int getAmount() {
        return amount;
    }


}
