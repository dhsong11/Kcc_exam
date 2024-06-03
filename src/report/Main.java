package report;

public class Main {

	public static void main(String[] args) {

		Member member1 = new Member("송", "서울시", 25);

		Product product1 = new Product("자바", 500, 1);

		Event event1 = new Event("vacation", "2020-11-11");

		member1.order(product1);

		member1.participate(event1);

		member1.printInfo();

		

		member1.cancelEvent(event1);

		member1.printInfo();
		
		product1.printInfo();
		
		event1.printEvent();
	}
}
