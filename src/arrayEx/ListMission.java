package arrayEx;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListMission {

	public static void main(String[] args) {

		// List자료구조를 활용하여 키보드로부터 문자열을 입력받아 처리하자.
		// 1.데이터 추가 2.데이터 삭제 3.데이터 출력(for,Iterator)4.종료
		//전체값 읽을 때는 arraylist, 변경 상황과 같은 것은 linkedList사용
		 
		Scanner scanner = new Scanner(System.in);
		List<String> stringList = new LinkedList<String>();

		int choice;
		do {
			System.out.println("1. 데이터 추가");
			System.out.println("2. 데이터 삭제");
			System.out.println("3. 데이터 출력");
			System.out.println("4. 종료");
			System.out.print("선택하세요: ");
			choice = scanner.nextInt();
			scanner.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("추가할 문자열을 입력하세요: ");
				String newData = scanner.nextLine();
				stringList.add(newData);
				break;
			case 2:
				System.out.print("삭제할 문자열을 입력하세요: ");
				String deleteData = scanner.nextLine();
				stringList.remove(deleteData);
				break;
			case 3:
				System.out.println("데이터 출력:");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				break;
			}
		} while (choice != 4);

		scanner.close();
	}
}
