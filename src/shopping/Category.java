package shopping;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name; //카테고리명
    private List<Item> items = new ArrayList<Item>(); //카테고리별 아이템 목록

    public Category(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }
}