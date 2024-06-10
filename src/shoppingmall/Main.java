

package shoppingmall;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ShoppingMall shoppingMall = new ShoppingMall();

		while (true) {
			showMenu(); 
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				shoppingMall.addItem();
				break;
			case 2:
				shoppingMall.listItems();
				break;
			case 3:
				shoppingMall.searchByCategory();
				break;
			case 4:
				shoppingMall.addMember();
				break;
			case 5:
				shoppingMall.listMembers();
				break;
			case 6:
				shoppingMall.addOrder();
				break;
			case 7:
				shoppingMall.listOrders();
				break;
			case 8:
				System.out.println("���α׷� ����");
				return;
			}
		}
	}

	
	private static void showMenu() {
		System.out.println(">1.��ǰ ��� 2.��ü ��ǰ ��� 3.ī�װ��� �˻� 4.ȸ�� ��� 5.ȸ�� ��� ��� 6.�ֹ� �߰� 7.�ֹ� ��� ��� 8.����");
		System.out.print(">�޴�: ");
	}
}
