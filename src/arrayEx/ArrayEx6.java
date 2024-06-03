package arrayEx;

import java.util.Scanner;

public class ArrayEx6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
		int count = scanner.nextInt();

		int[] numbers = new int[count];
		int minnumber, maxnumber;
		
		System.out.println(count + "개의 정수를 입력하세요: ");
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
		System.out.println("가장 작은 점수: " + minnumber);
		System.out.println("가장 큰 점수: " + maxnumber);
	}

}
