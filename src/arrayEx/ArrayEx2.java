package arrayEx;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[]numbers = new int[5];
		
		System.out.print("5���� ������ �Է��Ͻÿ�");
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		System.out.println("���");
//		for(int i=0; i<numbers.length; i++) {
//			System.out.print(numbers[i]);
//			if(i< numbers.length-1) {
//				System.out.print(", ");
//			}
//		}
		
		//���� ���
		for(int i=4; i>=0; i--) {
			System.out.print(numbers[i]);
			if(i>0) {
				System.out.print(", ");
			}
		}

	}

}
