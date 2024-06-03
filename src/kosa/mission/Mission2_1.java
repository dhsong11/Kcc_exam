package kosa.mission;

import java.util.Scanner;

public class Mission2_1 {
	
		
	public static void main(String[] args) {
		//국어,영어,수학 => 키보드로부터 입력 받아 배열로 구현
		//총점, 평균 구하기 => 메서드 정의 구현
		Scanner scanner = new Scanner(System.in);

       
        System.out.print("국어 점수를 입력하세요:");
        int koreanScore = scanner.nextInt();
        
        System.out.print("영어 점수를 입력하세요:");
        int englishScore = scanner.nextInt();
        
        System.out.print("수학 점수를 입력하세요:");
        int mathScore = scanner.nextInt();
        
        
        int[] scores = {koreanScore, englishScore, mathScore};
        
      
        int totalScore = Total(scores);
        
           
        double averageScore = Average(scores);
        
       
        System.out.println("총점: " + totalScore);
        System.out.println("평균: " + averageScore);
        
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




