package example;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int speed = 0;
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1. ���� | 2. ���� | 3. ����");
			System.out.println("-------------------------------");
			System.out.println("����: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			}else if(strNum.equals("2"))
				{
				speed--;
				System.out.println("���� �ӵ� = " + speed);
				}
			else if(strNum.equals("3")) {
				break;
			}
		}
		System.out.println("���α׷� ����");

	}

}
