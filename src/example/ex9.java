package example;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int balance = 0;

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("-------------------------------");
			System.out.print("����: ");

			String strNum = scanner.nextLine();
			System.out.println();

			if (strNum.equals("1")) {
				System.out.print("���ݾ��� �Է��ϼ���: ");
				int deposit = scanner.nextInt();
				balance += deposit;
				System.out.println("���ݾ� = " + balance);
			} else if (strNum.equals("2")) {
				System.out.print("��ݾ��� �Է��ϼ���: ");
				int withdraw = scanner.nextInt();
				if (withdraw > balance) {
					System.out.println("�ܰ� �����մϴ�.");
				} else {
					balance -= withdraw;
					System.out.println("��ݾ� = " + balance);
				}
			} else if (strNum.equals("3")) {
				System.out.println("�ܰ�= " + balance);
			} else {
				break;
			}
			
		}
		System.out.println("���α׷� ����");

	}

}
