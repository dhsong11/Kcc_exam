package arrayEx;

import java.util.Scanner;

public class ArrayEx3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� ���� ������ ������ �Է��ϼ���: ");
		int count = scanner.nextInt();

		int[] numbers = new int[count];
		int sum = 0;
		double average;

		System.out.println(count + "���� ������ �Է��ϼ���: ");
		for (int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}

		average = (double) sum / count;
		System.out.println("�Է��� ������ �հ�: " + sum);
		System.out.println("�Է��� ������ ���: " + average);

	}

}
