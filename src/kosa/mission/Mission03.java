package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		//임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 개수를 구하기.
		//5자리수 ex)12345
		//짝수의 개수 : 2개
		//홀수의 개수 : 3개
		//조건연산자,/,%
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();

		int evencount = 0;
		int ovencount = 0;
		
		while(num!=0) {
			int digit = num%10;
			
			if (digit%2 == 0) {
					
				evencount++;
			}
			else {
				ovencount++;
				
			}
				num/=10;
				
			
		}
			System.out.println("짝수의 개수: " + evencount);
			System.out.println("홀수의 개수: " + ovencount);
			
	}

}
