package kosa.mission;

import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		//메뉴를 선택해서 해당 메뉴를 명령문을 실행해 보자.
		//1.추가 2.출력 3.검색 4.종료
		
		Scanner scanner = new Scanner(System.in);
		
        
		while(true) {
			
			System.out.println("1.추가 2.출력 3.검색 4.종료");
			
			
			System.out.print("입력 >");
			String menuInput = "";
			menuInput = scanner.nextLine();
			
			switch(menuInput) {
			case "1":
				
				System.out.println("추가합니다.");
			break;

			case "2":
				
				System.out.println("출력합니다.");
			
			break;
	
			case "3":

				System.out.println("검색합니다.");

			break;

			case "4":

				System.out.println("종료합니다.");
			return;
			}
		}
				
	
	}

}
