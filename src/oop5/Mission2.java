package oop5;

import java.util.Scanner;

public class Mission2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열을 입력하세요:");
		String input = scanner.nextLine();

		String[] words = input.split(" ");
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		System.out.println("가장 긴 문자열은: " + longestWord);
	}

}
