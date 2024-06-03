package example;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {

		while(true)
		{

			Scanner sc = new Scanner(System.in);
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;

			int sum = dice1 + dice2;

			System.out.println("생성된 숫자: " + sum);

			if (sum != 5) {
				continue;
			} else {

				break;
			}
		}


		System.out.println("종료");
	}


	}


