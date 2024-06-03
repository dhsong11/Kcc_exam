package kosa_mission2;

import java.util.Scanner;

public class Mission2_2 {
//앞에 서 있는 학생의 키 보다 큰수가 나오는 횟수 구하기
	
	//방법1
	    public static int solution(int arr[]) {
	    	int answer = 1;
	    	int max = arr[0];
	    	for(int i=1; i<arr.length; i++) {
	    		if(arr[i] > max) {
	    			max = arr[i];
	    			arr[i] = arr[i];
	    			answer++;
	    		}
	    	}
	    	return answer;
	    }
	    	
	    // 방법2	
//	        int count = 0;
//	        
//	        for (int i = 1; i < arr.length; i++) {
//	            if (arr[i] > arr[i - 1]) {
//	                count++;
//	            }
//	        }
//	        
//	        return count;
//	    }
	    
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("학생의 수를 입력하세요: ");
	        int n = scanner.nextInt();

	        int arr[] = new int[n];

	        System.out.print("각 학생의 키를 입력하세요: ");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int count = solution(arr);
	        System.out.println("앞에 서 있는 학생의 수보다 큰 수가 나오는 횟수: " + count + "명");

	        scanner.close();
	    }
 	}

















        
