package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		//�޴��� �����ؼ� �ش� �޴��� ��ɹ��� ������ ����.
		//1.�߰� 2.��� 3.�˻� 4.����
		
		Scanner scanner = new Scanner(System.in);
		
        
		while(true) {
			
			System.out.println("1.�߰� 2.��� 3.�˻� 4.����");
			
			
			System.out.print("�Է� >");
			String menuInput = "";
			menuInput = scanner.nextLine();
			
			switch(menuInput) {
			case "1":
				
				System.out.println("�߰��մϴ�.");
			break;

			case "2":
				
				System.out.println("����մϴ�.");
			
			break;
	
			case "3":

				System.out.println("�˻��մϴ�.");

			break;

			case "4":

				System.out.println("�����մϴ�.");
			return;
			}
		}
				
	
	}

}
