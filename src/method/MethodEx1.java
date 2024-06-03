package method;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int balance = 0;

		while (true) {
			System.out.println("-------------------");
			System.out.println("1.�Ա� | 2.��� | 3.�ܾ� Ȯ�� | 4.����");
			System.out.println("-------------------");
			System.out.println("����: ");

			int choice = scanner.nextInt();
			int amount;

			switch (choice) {
			case 1:
				System.out.print("�Աݾ��� �Է��ϼ���: ");
				amount = scanner.nextInt();
				balance = deposit(balance, amount);
				break;

			case 2:
				System.out.print("��ݾ��� �Է��ϼ���: ");
				amount = scanner.nextInt();
				balance = withdraw(balance, amount);
				break;

			case 3:
				System.out.println("���� �ܾ�: " + balance + "��");

			case 4:
				System.out.println("�ý����� �����մϴ�.");
				return;

			default:
				System.out.println("�ùٸ� ������ �ƴմϴ�. �ٽ� �������ּ���.");
		
			}

		}
	}

	public static int deposit(int balance, int amount) {
		balance += amount;
		System.out.println(amount + "���� �Ա��Ͽ����ϴ�. ���� �ܾ�: " + balance + "��");
		return balance;
	}

	public static int withdraw(int balance, int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + "���� ����Ͽ����ϴ�. ���� �ܾ�: " + balance + "��");
		} else {
			System.out.println(amount + "���� ����Ϸ� ������ �ܾ��� �����մϴ�.");
		}
		return balance;

	}
}
