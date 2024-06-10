package kosa.data;

import java.util.Scanner;
import java.util.Stack;

public class StackMission {

	public static void main(String[] args) {
		// Ű����κ��� ���м����� �Է�
		// ((2+3)+10)) => ��ȣ ��ġ/����ġ �Ǵ�

		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
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
				System.out.println("��ȣ ��ġ");
			} else {
				System.out.println("��ȣ ����ġ");
			}
		} catch (Exception e) {
			System.out.println("��ȣ�� ����ġ�մϴ�.");
		}
	}
}
