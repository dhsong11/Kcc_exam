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
//			System.out.println("1. �ֹ� �߰�");
//			System.out.println("2. �ֹ� ����");
//			System.out.println("3. ����");
//			System.out.println("4. ����");
//			System.out.print("�۾� ����: ");
//			int choice = scanner.nextInt();
//
//			switch (choice) {
//			case 1:
//				// �ֹ� �߰�
//				System.out.print("�޴� �̸�: ");
//				String name = scanner.next();
//				System.out.print("����: ");
//				double price = scanner.nextDouble();
//				System.out.print("����: ");
//				String description = scanner.next();
//				MenuItem item = new MenuItem(name, price, description);
//				order.addItem(item);
//				break;
//			case 2:
//				// �ֹ� ����
//				System.out.print("������ �޴� �̸�: ");
//				String deleteName = scanner.next();
//				for (MenuItem menuItem : order.getItems()) {
//					if (menuItem.getName().equals(deleteName)) {
//						order.removeItem(menuItem);
//						System.out.println(deleteName + "��(��) �ֹ����� �����Ǿ����ϴ�.");
//						break;
//					}
//				}
//				break;
//			case 3:
//				// ����
//				order.checkout();
//				break;
//			case 4:
//				// ����
//				running = false;
//				break;
//			default:
//				System.out.println("�߸��� �����Դϴ�. �ٽ� �����ϼ���.");
//			}
//		}
//		scanner.close();
//	}
//
//}
