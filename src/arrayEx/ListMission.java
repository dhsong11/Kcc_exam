package arrayEx;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {

		// List�ڷᱸ���� Ȱ���Ͽ� Ű����κ��� ���ڿ��� �Է¹޾� ó������.
		// 1.������ �߰� 2.������ ���� 3.������ ���(for,Iterator)4.����
		//��ü�� ���� ���� arraylist, ���� ��Ȳ�� ���� ���� linkedList���
		 
		Scanner scanner = new Scanner(System.in);
		List<String> stringList = new LinkedList<String>();

		int choice;
		do {
			System.out.println("1. ������ �߰�");
			System.out.println("2. ������ ����");
			System.out.println("3. ������ ���");
			System.out.println("4. ����");
			System.out.print("�����ϼ���: ");
			choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("�߰��� ���ڿ��� �Է��ϼ���: ");
				String newData = scanner.nextLine();
				stringList.add(newData);
				break;
			case 2:
				System.out.print("������ ���ڿ��� �Է��ϼ���: ");
				String deleteData = scanner.nextLine();
				stringList.remove(deleteData);
				break;
			case 3:
				System.out.println("������ ���:");
				for (String str : stringList) {
					System.out.println(str);
				}

				/*
				 * Iterator<String> iterator = stringList.iterator(); 
				 * while (iterator.hasNext())
				 * { 
				 * System.out.println(iterator.next());
				 *  }
				 */
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				break;
			}
		} while (choice != 4);

		scanner.close();
	}
}
