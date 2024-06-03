package kosa_mission2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission2_1 {
//큰 수 출력하기(자신의 바로 앞 수보다 큰 수만 출력)
	
	public static int[] solution(int arr[]) {
		int answer[] = new int[arr.length];
		int count = 0;
		
		answer[count++] = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				answer[count++] = arr[i];
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

        
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for(int i=0; i< arr.length; i++) {
        	arr[i] = scanner.nextInt();
        }
        int answer[] = solution(arr);
        for(int i=0; i<answer.length; i++) {
        	System.out.print(answer[i]+" ");
        }
	}

}


   
