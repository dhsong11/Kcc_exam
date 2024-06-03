//package restaurant;
//
//import java.util.Scanner;
//
//public class RestaurantOrderSystem {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		Order order = new Order();
//
//		boolean running = true;
//		while (running) {
//			System.out.println("1. 주문 추가");
//			System.out.println("2. 주문 삭제");
//			System.out.println("3. 결제");
//			System.out.println("4. 종료");
//			System.out.print("작업 선택: ");
//			int choice = scanner.nextInt();
//
//			switch (choice) {
//			case 1:
//				// 주문 추가
//				System.out.print("메뉴 이름: ");
//				String name = scanner.next();
//				System.out.print("가격: ");
//				double price = scanner.nextDouble();
//				System.out.print("설명: ");
//				String description = scanner.next();
//				MenuItem item = new MenuItem(name, price, description);
//				order.addItem(item);
//				break;
//			case 2:
//				// 주문 삭제
//				System.out.print("삭제할 메뉴 이름: ");
//				String deleteName = scanner.next();
//				for (MenuItem menuItem : order.getItems()) {
//					if (menuItem.getName().equals(deleteName)) {
//						order.removeItem(menuItem);
//						System.out.println(deleteName + "이(가) 주문에서 삭제되었습니다.");
//						break;
//					}
//				}
//				break;
//			case 3:
//				// 결제
//				order.checkout();
//				break;
//			case 4:
//				// 종료
//				running = false;
//				break;
//			default:
//				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
//			}
//		}
//		scanner.close();
//	}
//
//}
