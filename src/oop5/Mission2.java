package oop5;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���:");
		String input = scanner.nextLine();

		String[] words = input.split(" ");
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		System.out.println("���� �� ���ڿ���: " + longestWord);
	}

}
