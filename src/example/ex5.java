package example;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// ������ ���� ���� (1���� 6����)
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("������ ����: " + num);

			// 6�̸� ���� ����
			if (num == 6) {
				break;
			}

			// ����� �Է� ���
			System.out.println("����Ϸ��� Enter�� ��������...");
			scanner.nextLine(); // ����ڰ� Enter Ű�� �Է��� ������ ���
		}

		
		System.out.println("���α׷� ����");

		
		scanner.close();
	}
}
