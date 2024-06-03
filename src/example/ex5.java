package example;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// 랜덤한 숫자 생성 (1부터 6까지)
			int num = (int) (Math.random() * 6) + 1;
			System.out.println("생성된 숫자: " + num);

			// 6이면 루프 종료
			if (num == 6) {
				break;
			}

			// 사용자 입력 대기
			System.out.println("계속하려면 Enter를 누르세요...");
			scanner.nextLine(); // 사용자가 Enter 키를 입력할 때까지 대기
		}

		
		System.out.println("프로그램 종료");

		
		scanner.close();
	}
}
