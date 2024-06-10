package oop5;

import java.util.Scanner;

public class Mission3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		printNumbers(str);
	}

	public static void printNumbers(String str) {
		StringBuilder numbers = new StringBuilder();

		for (int i = 0; i < str.length(); i++) { // isdigit() -> ���ڸ� ������ true, �ƴϸ� false
			char c = str.charAt(i);
			if (Character.isDigit(c)) {
				numbers.append(c);
			}
		}

		System.out.println("����: " + numbers);

	}

}
