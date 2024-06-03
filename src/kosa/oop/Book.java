package kosa.oop;

public class Book {

	String bookName;
	int price;
	int discountedPrice;

	public Book() {}
	
	public Book(String bookName, int price) {
		super();
		this.bookName = bookName;
		this.price = price;
	}
	

	public void discount() {

		double discountRate = 0;
		if (price >= 30000) {
			discountedPrice = (int)(price * 0.75);
		} else if (price >= 20000) {
			discountedPrice = (int)(price * 0.80);
		} else if (price >= 15000) {
			discountedPrice = (int)(price * 0.85);
		}

	
	}
	
	 public void printDiscountedPrice() {
	        System.out.println(bookName + " 교재의 정가는 " + price + "원이며, 할인된 가격은 " + discountedPrice + "원 입니다.");
	    }
	  

}


