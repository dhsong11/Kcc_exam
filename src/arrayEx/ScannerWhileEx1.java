package arrayEx;

import java.util.Scanner;

public class ScannerWhileEx1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("�̸��� �Է��ϼ���(���Ḧ �Է��ϸ� ����): ");
			String name = input.nextLine();
			
			if(name.equals("����")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("���̸� �Է��ϼ���: ");
			int age = input.nextInt();
			input.nextLine();
			System.out.println("�Է��� �̸�: " + name + ", ����: " + age);
		}
		

	}

}
