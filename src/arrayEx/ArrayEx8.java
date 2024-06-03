package arrayEx;

import java.util.Scanner;

public class ArrayEx8 {

	public static void main(String[] args) {

		int maxProducts = 10;
		String[] productNames = new String[maxProducts];
		int[] productPrices = new int[maxProducts];
		int productCount = 0;

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("1.��ǰ ��� | 2.��ǰ ��� | 3.����");
			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				if (productCount >= maxProducts) {
					System.out.println("��ǰ�� �� �̻� ����� �� �����ϴ�.");
					continue;
				}
				System.out.print("��ǰ �̸��� �Է��ϼ���: ");
				productNames[productCount] = scanner.nextLine();

				System.out.print("��ǰ ������ �Է��ϼ���: ");
				productPrices[productCount] = scanner.nextInt();

				productCount++;
			} else if (menu == 2) {
				if (productCount == 0) {
					System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
					continue;
				}
				for (int i = 0; i < productCount; i++) {
					System.out.println(productNames[i] + ": " + productPrices[i] + "��");
				}
			} else if (menu == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;

			} else {
				System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�.");
			}
		}
	}

}
