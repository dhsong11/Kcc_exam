package kosa.mission;

import java.util.Scanner;

public class MethodExam {

	public static int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
		//�޼��� ����
		//����������, (static), ������(void), �޼����̸�(�Ķ����(����))
		public static void printCharacter(char ch, int num) {
			for(int i=1; i<=num;i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		public static void main(String[] args) {
			printCharacter('#',10);
			int sum = add(10,20);
			System.out.println(sum);
		
	}

}


