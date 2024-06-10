package kosa.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Mission1 {
//	�Ĵ� �ֹ����� ���α׷� (ť����)
//
//	1. �ֹ���û  2. �ֹ�ó�� 3. ����� �Ѿ� 4. ����
//
//	�Է� 1>Food(foodName, price)
//	          Order(Food, amount)���� => �ڷᱸ�� �߰�
//
//	�Է� 2> �ڷᱸ���� �ִ� �ֹ�ó��(�ֹ��� ���� ���)
//
//	�Է� 3> �ֹ�ó���� �޴��� ���� �հ����

	public static void main(String[] args) {
		Map<String, Integer> menu = new HashMap<>();
		LinkedList<Food> queue = new LinkedList<>();
		menu.put("a", 90);
		menu.put("ab", 60);
		menu.put("abc", 50);

		LinkedList<Order> orderQueue = new LinkedList<Order>();
		Scanner sc = new Scanner(System.in);
		int totalSales = 0; // �հ�

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1. �ֹ���û");
			System.out.println("2. �ֹ�ó��");
			System.out.println("3. ����� �Ѿ�");
			System.out.println("4. ����");
			System.out.print("����: ");
			int choice = sc.nextInt();
			sc.nextLine();

			Scanner sc1 = new Scanner(System.in);
			int total = 0;

			switch (choice) {
			case 1:
				System.out.println("�ֹ� �޴�: ");
				String menuinput = sc1.nextLine();
				Set set = menu.entrySet();
				Iterator iter = set.iterator();
				
				while(iter.hasNext()) {
					Map.Entry<String, Integer> e = (Map.Entry<String, Integer>)iter.next();
					if(e.getKey().equals(menuinput)){
						queue.offer(new Food(e.getKey(), e.getValue()));
						System.out.println("���������� �ֹ��� �Ǿ����ϴ�.");
					}
					
				}

//				for (String key : menu.keySet()) { // key�� ���
//					Food food = menu.get(key);
//					System.out.println(food.foodName + ": " + food.price);
//				}

//				System.out.print("���� �̸��� ������ �Է��ϼ���: ");
//				String input = sc1.nextLine();
//
//				String[] orderDetails = input.split(" ");
//				if (orderDetails.length != 2) {
//					System.out.println("�߸��� �Է��Դϴ�. �ٽ� �õ��ϼ���.");
//					continue;
//				}
//
//				String foodName = orderDetails[0];
//				int amount;
//				try {
//					amount = Integer.parseInt(orderDetails[1]);
//				} catch (NumberFormatException e) {
//					System.out.println("�߸��� �����Դϴ�. �ٽ� �õ��ϼ���.");
//					continue;
//				}

//				Food orderedFood = menu.get(foodName);
//				if (orderedFood == null) {
//					System.out.println("�������� �ʴ� �����Դϴ�.");
//					continue;
//				}

//				Order order = new Order(orderedFood, amount);
//				orderQueue.offer(order);
//				System.out.println("�ֹ��� �߰��Ǿ����ϴ�.");
				break;

			case 2:
				if (orderQueue.isEmpty()) {
					System.out.println("ó���� �ֹ��� �����ϴ�.");
				} else {
					Order processedOrder = orderQueue.poll();
					totalSales += processedOrder.food.price * processedOrder.amount;
					System.out.println("�ֹ� ó����: " + processedOrder.amount + " x " + processedOrder.food.foodName);
				}
				break;

			case 3:
				System.out.println("�� �����: " + totalSales);
				break;

			case 4:
				System.out.println("���α׷��� ����");
				sc1.close();
				return;

			default:
				System.out.println("�߸��� �����Դϴ�. �ٽ�..");

			}
		}
	}
}
