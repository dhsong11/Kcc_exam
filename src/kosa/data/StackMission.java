package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// 키보드로부터 수학수식을 입력
		// ((2+3)+10)) => 괄호 일치/불일치 판단

		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("수식입력: ");
		String exp = sc.nextLine();

		try {

			for (int i = 0; i < exp.length(); i++) {
				char testch = exp.charAt(i);

				if (testch == '(') {
					stack.push(testch + "");
				} else if (testch == ')') {
					stack.pop();
				}
			}

			if (stack.isEmpty()) {
				System.out.println("괄호 일치");
			} else {
				System.out.println("괄호 불일치");
			}
		} catch (Exception e) {
			System.out.println("괄호가 불일치합니다.");
		}
	}
}
