package kosa.mission;

import java.util.Scanner;

public class GAL_Mission {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        int Test = scanner.nextInt(); 
        
        for (int caseNum = 1; caseNum <= Test; caseNum++) {
            int A = scanner.nextInt(); 
            int B = scanner.nextInt(); 
            
            int days = 0; 
            
           // A: ����, B: ����
            while (B <= A) {
                A *= 2; 
                B *= 3; 
                days++; 
            }
            
            // ��� ���
            System.out.println("#" + caseNum + " " + days);
        }
        
        scanner.close();

	}

	
}











































