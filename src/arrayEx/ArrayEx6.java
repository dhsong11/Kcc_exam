package arrayEx;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է� ���� ������ ������ �Է��ϼ���: ");
		int count = scanner.nextInt();

		int[] numbers = new int[count];
		int minnumber, maxnumber;
		
		System.out.println(count + "���� ������ �Է��ϼ���: ");
		for(int i=0; i<count; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		minnumber = maxnumber = numbers[0];
		for(int i=1; i<count; i++) {
			if(numbers[i]<minnumber) {
				minnumber = numbers[i];
			}
			if(numbers[i] > maxnumber) {
				maxnumber = numbers[i];
			}
			
		}
		System.out.println("���� ���� ����: " + minnumber);
		System.out.println("���� ū ����: " + maxnumber);
	}

}
