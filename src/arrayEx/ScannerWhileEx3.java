package arrayEx;

import java.util.Scanner;

public class ScannerWhileEx3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int input = 0;
		int count = 0;
		
		System.out.println("���ڸ� �Է��ϼ���. �Է��� �ߴ��Ϸ��� -1�� �Է��ϼ���: ");
		while(true) {
			input = scanner.nextInt();
			if(input == -1) {
				break;
			}
			sum += input;
			count++;
		}
		
		double average = (double)sum/count;
		System.out.println("�Է��� ���ڵ��� �հ�: " + sum);
		System.out.println("�Է��� ���ڵ��� ���: " + average);

	}

}
