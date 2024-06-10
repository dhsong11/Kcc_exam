package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Mission1 {
//	식당 주문관리 프로그램 (큐구조)
//
//	1. 주문요청  2. 주문처리 3. 매출액 총액 4. 종료
//
//	입력 1>Food(foodName, price)
//	          Order(Food, amount)생성 => 자료구조 추가
//
//	입력 2> 자료구조에 있는 주문처리(주문된 내용 출력)
//
//	입력 3> 주문처리된 메뉴에 대한 합계출력

	public static void main(String[] args) {
		Map<String, Integer> menu = new HashMap<>();
		LinkedList<Food> queue = new LinkedList<>();
		menu.put("a", 90);
		menu.put("ab", 60);
		menu.put("abc", 50);

		LinkedList<Order> orderQueue = new LinkedList<Order>();
		Scanner sc = new Scanner(System.in);
		int totalSales = 0; // 합계

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1. 주문요청");
			System.out.println("2. 주문처리");
			System.out.println("3. 매출액 총액");
			System.out.println("4. 종료");
			System.out.print("선택: ");
			int choice = sc.nextInt();
			sc.nextLine();

			Scanner sc1 = new Scanner(System.in);
			int total = 0;

			switch (choice) {
			case 1:
				System.out.println("주문 메뉴: ");
				String menuinput = sc1.nextLine();
				Set set = menu.entrySet();
				Iterator iter = set.iterator();
				
				while(iter.hasNext()) {
					Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)iter.next();
					if(e.getKey().equals(menuinput)){
						queue.offer(new Food(e.getKey(), e.getValue()));
						System.out.println("성공적으로 주문이 되었습니다.");
					}
					
				}

//				for (String key : menu.keySet()) { // key값 출력
//					Food food = menu.get(key);
//					System.out.println(food.foodName + ": " + food.price);
//				}

//				System.out.print("음식 이름과 수량을 입력하세요: ");
//				String input = sc1.nextLine();
//
//				String[] orderDetails = input.split(" ");
//				if (orderDetails.length != 2) {
//					System.out.println("잘못된 입력입니다. 다시 시도하세요.");
//					continue;
//				}
//
//				String foodName = orderDetails[0];
//				int amount;
//				try {
//					amount = Integer.parseInt(orderDetails[1]);
//				} catch (NumberFormatException e) {
//					System.out.println("잘못된 수량입니다. 다시 시도하세요.");
//					continue;
//				}

//				Food orderedFood = menu.get(foodName);
//				if (orderedFood == null) {
//					System.out.println("존재하지 않는 음식입니다.");
//					continue;
//				}

//				Order order = new Order(orderedFood, amount);
//				orderQueue.offer(order);
//				System.out.println("주문이 추가되었습니다.");
				break;

			case 2:
				if (orderQueue.isEmpty()) {
					System.out.println("처리할 주문이 없습니다.");
				} else {
					Order processedOrder = orderQueue.poll();
					totalSales += processedOrder.food.price * processedOrder.amount;
					System.out.println("주문 처리됨: " + processedOrder.amount + " x " + processedOrder.food.foodName);
				}
				break;

			case 3:
				System.out.println("총 매출액: " + totalSales);
				break;

			case 4:
				System.out.println("프로그램을 종료");
				sc1.close();
				return;

			default:
				System.out.println("잘못된 선택입니다. 다시..");

			}
		}
	}
}
