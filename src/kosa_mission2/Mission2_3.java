package kosa_mission2;

import java.util.Scanner;

public class Mission2_3 {

	
	public static int solution(int n, int arr[][]) {
		int answer = 0;
        int sum1 = 0; // ����
        int sum2 = 0; // ����

        for (int i = 0; i < n; i++) {
            sum1 = 0; // 1�� ������ ���� �� ���� �ʱ�ȭ
            sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = 0;
        sum2 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - 1 - i];
        }

        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        int result = solution(n, arr);
        System.out.println("���� ū ����: " + result);

        sc.close();
	    	
	    
	}
}



 



  















