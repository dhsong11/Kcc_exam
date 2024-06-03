package example;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int balance = 0;

		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 중지");
			System.out.println("-------------------------------");
			System.out.print("선택: ");

			String strNum = scanner.nextLine();
			System.out.println();

			if (strNum.equals("1")) {
				System.out.print("예금액을 입력하세요: ");
				int deposit = scanner.nextInt();
				balance += deposit;
				System.out.println("예금액 = " + balance);
			} else if (strNum.equals("2")) {
				System.out.print("출금액을 입력하세요: ");
				int withdraw = scanner.nextInt();
				if (withdraw > balance) {
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= withdraw;
					System.out.println("출금액 = " + balance);
				}
			} else if (strNum.equals("3")) {
				System.out.println("잔고= " + balance);
			} else {
				break;
			}
			
		}
		System.out.println("프로그램 종료");

	}

}
