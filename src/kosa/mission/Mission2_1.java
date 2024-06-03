package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {
	
		
	public static void main(String[] args) {
		//����,����,���� => Ű����κ��� �Է� �޾� �迭�� ����
		//����, ��� ���ϱ� => �޼��� ���� ����
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("���� ������ �Է��ϼ���:");
        int koreanScore = scanner.nextInt();
        
        System.out.print("���� ������ �Է��ϼ���:");
        int englishScore = scanner.nextInt();
        
        System.out.print("���� ������ �Է��ϼ���:");
        int mathScore = scanner.nextInt();
        
        
        int[] scores = {koreanScore, englishScore, mathScore};
        
      
        int totalScore = Total(scores);
        
           
        double averageScore = Average(scores);
        
       
        System.out.println("����: " + totalScore);
        System.out.println("���: " + averageScore);
        
        scanner.close();
    }
    
    
    public static int Total(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }
    
  
    public static double Average(int[] scores) {
        int total = Total(scores);
        return (double) total / scores.length;
        

	}
	
	

}




