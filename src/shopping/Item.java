package shopping;

public class Item {
    private String name; // 상품명
    private int price; // 상품가격
    private int quantity; // 상품수량
    private Category category; // 카테고리

    public Item() {

    };

    public Item(String name, int price, int quantity, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        category.addItem(this);
    }

    public void decreaseQuantity(int amount) {
        quantity -= amount;
    }

    public void increaseQuantity(int amount) {
        quantity += amount;
    }

    public boolean validateAmount(int amount) {
        if(quantity >= amount)
            return true;
        return false;
    }

    public void printInfo() {
        System.out.println("상품명 : " + name);
        System.out.println("상품가격 : " + price);
        System.out.println("상품수량 : " + quantity);
        System.out.println("상품 카테고리 : " + category.getName());
        System.out.println("-----------------------------------");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public Category getCategory() {
        return category;
    }


}

