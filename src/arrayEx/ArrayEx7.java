package arrayEx;

import java.util.Scanner;

public class ArrayEx7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("�л����� �Է��ϼ���: ");
		int studentCount = scanner.nextInt();
		int[][]scores = new int[studentCount][3];
		String[] subjects = {"����","����","����"};
		
		for(int i=0; i<studentCount; i++) {
			System.out.println((i+1)+ "�� �л��� ������ �Է��ϼ���: ");
			for(int j=0; j<3; j++) {
				System.out.print(subjects[j]+ " ����: ");
				scores[i][j] = scanner.nextInt();
			}
		}
		
		for(int i=0; i<studentCount; i++) {
			int total = 0;
			for(int j=0; j<3; j++) {
				total += scores[i][j];
			}
			
			double average = total/3.0;
			System.out.println((i+1) + "�� �л��� ���� : " + total + ", ���: " + average);
		}
		
	}

}
