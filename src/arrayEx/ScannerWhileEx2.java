package arrayEx;

import java.util.Scanner;

public class ScannerWhileEx2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("��ǰ�� ������ �Է��ϼ��� (-1�� �Է��ϸ� ����): ");
			int price = input.nextInt();
			
			if(price == -1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("�����Ϸ��� ������ �Է��ϼ���: ");
			int quantity = input.nextInt();
			
			int totalCost = price * quantity;
			System.out.println("�� ���: " + totalCost);
		}

	}

}
