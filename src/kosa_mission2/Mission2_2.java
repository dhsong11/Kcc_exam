package kosa_mission2;

import java.util.Scanner;

public class Mission2_2 {
//�տ� �� �ִ� �л��� Ű ���� ū���� ������ Ƚ�� ���ϱ�
	
	//���1
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
	    	
	    // ���2	
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

	        System.out.print("�л��� ���� �Է��ϼ���: ");
	        int n = scanner.nextInt();

	        int arr[] = new int[n];

	        System.out.print("�� �л��� Ű�� �Է��ϼ���: ");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        int count = solution(arr);
	        System.out.println("�տ� �� �ִ� �л��� ������ ū ���� ������ Ƚ��: " + count + "��");

	        scanner.close();
	    }
 	}

















        
