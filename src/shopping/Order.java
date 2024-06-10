package shopping;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> orderItems;
    private int total = 0;
    private Member member;

    public Order(){

    }

    public Order(Member member, List<OrderItem> orderItems){
        this.member = member;
        this.orderItems = orderItems;
        calculateTotal();
    }

    private void calculateTotal(){
        for (OrderItem orderItem : orderItems) {
            total += orderItem.getItem().getPrice() * orderItem.getAmount();
        }
    }

//    public void addOrderItem(OrderItem orderItem) {
//        orderItems.add(orderItem);
//        total += orderItem.getItem().getPrice() * orderItem.getAmount();
//    }

    public void printOrder(){
        System.out.println("----------------------------------------------");
        for (OrderItem orderItem : orderItems) {
            System.out.println("주문한 상품명 : " + orderItem.getItem().getName());
            System.out.println("주문 수량 : " + orderItem.getAmount());
            System.out.println();
        }

        System.out.println("해당 주문 총 금액 : " + total);
        System.out.println("----------------------------------------------");
    }


    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public int getTotal() {
        return total;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Member getMember() {
        return member;
    }






}

