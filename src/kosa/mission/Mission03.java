package kosa.mission;

import java.util.Scanner;

public class Mission03 {

	public static void main(String[] args) {
		//������ �������� ���ؼ� ��ü �ڸ��� �� ¦��, Ȧ���� ������ ���ϱ�.
		//5�ڸ��� ex)12345
		//¦���� ���� : 2��
		//Ȧ���� ���� : 3��
		//���ǿ�����,/,%
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
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
			System.out.println("¦���� ����: " + evencount);
			System.out.println("Ȧ���� ����: " + ovencount);
			
	}

}
