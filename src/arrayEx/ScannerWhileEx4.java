package arrayEx;

import java.util.Scanner;

public class ScannerWhileEx4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int totalCost = 0;

		while (true) {
			System.out.println("1: ��ǰ �Է�, 2: ����, 3: ���α׷� ����");
			int option = sc.nextInt();
			if (option == 1) {
				sc.nextLine(); // ������ �Էµ� ���๮�� ����
				System.out.print("��ǰ���� �Է��ϼ���: ");
				String product = sc.nextLine();
				System.out.print("��ǰ�� ������ �Է��ϼ���: ");
				int price = sc.nextInt();
				System.out.print("���� ������ �Է��ϼ���: ");
				int quantity = sc.nextInt();
				totalCost += price * quantity;
				System.out.println("��ǰ��:" + product + " ����:" + price + " ����:" + quantity + " �հ�:" + price * quantity);
			} else if (option == 2) {
				System.out.println("�� ���: " + totalCost);
				totalCost = 0; // ���� �� �� ��� �ʱ�ȭ
			} else if (option == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�ùٸ� �ɼ��� �������ּ���.");
			}
		}
	}

}
