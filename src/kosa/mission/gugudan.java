package kosa.mission;

import java.util.Scanner;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int i=2;
//		while(i<=9) {
//			System.out.print(i);
//		}
//		int j=1;
//		while(j<=9) {
//			System.out.println(i+"*"+j+"="+(i*j));
//		}
//		i++;
//		
//		
//		j++;
//	}
//	
		
		
//		for(int i=0; i<=100; i++) {
//			if (!(i%2==0 || i%3==0)) {
//				System.out.print(i+", ");
//			}
//		}
		

		//		for(int i=0; i<=100; i++) {
//			if((i%2==0 || i%3==0)){
//				continue;
//			}
//			System.out.print(i+ ", ");
//		}
//		
//		
//		
		
		
		//do~while : ��ɹ��� 1���� �����ؾ��ؼ�
		//Ű����κ��� ���ڸ� �Է� �ޱ�
		//������ �Է��ϸ� ���� �Է¹޵��� �ϱ� ����
//		Scanner sc = new Scanner(System.in);
//		int n;
//		do {
//			System.out.print("�Է�: ");
//			n=sc.nextInt();
//			
//		}
//		while(n<0);
//			System.out.println("�Է°��: " + n);
		
		//������
//		int n = (int)(Math.random() * 9) + 1;
//		System.out.println(n);
		
		
//	 int a,b,c;
//	 a =(int)(Math.random() * 9)+1;
//	 do {
//		 b = (int)(Math.random() * 9)+1;
//		 
//	 }while(a==b);
//	 do {
//		 c=(int)(Math.random() * 9)+1;
//		 
//	 }while(a ==c || b==c);
//	 System.out.println(a+","+b + "," +c);
//		
		
	
//	for(int i=2; i<=9; i++) {
//		for(int j=1; j<=9; j++) {
//			System.out.println(i+"*"+j+"="+(i*j));
//		}
//		System.out.println();
//	}
//	
//		
		
		//for(int x = 0; x <= 10; x++) {
//			for(int y = 0; y <= 10; y++) {
//				if(2*x + 4*y == 10) {
//					System.out.println(" x = " + x + ", y = " + y );
//				}
//			}

		
//	for(int i=0; i<=5; i++) {
//		for(int j=0; j<=i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	
//	
//		
//	}
	

		//	for(int i=5; i>0; i--) {
//		for(int j=0; j<i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
		
		
//		int arr2[] = new int[5];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		
//		int arr3[] = {1,2,3,4,5};
//		
//		for(int i=0; i<arr3.length; i++) {
//			System.out.println("arr3["+i+"]=" + arr3[i]);
//		}
	
		//�迭�� ��� ��� ��!
		//1.�迭�� ���� ������Ÿ���� �����Ѵ�.
		//2.�迭�� ũ�⸦ ����(�迭�� ũ�Ⱑ ����, ArrayIndexOfBoundsException���ܰ� �߻�)
		//3.�迭 ���� ��� ���� => 1,2,3
		//4.�迭�� ��� �ʱ�ȭ => ���� �ε��� ����, for��, ������ �ʱ�ȭ
		//5.�迭�� �����͸� ��� ��� => for��, ���� for�� ���, �����ε���
		
		
		
		
		//���� > Ű����κ��� ���ڿ��� �Է� �޾� �迭�� �߰��� �� ��ü�� ���
		//"q"�� �Է��Ҷ����� �Է� �޴´�.
		//�Է�: ȫ�浿
		//�Է�: �ڱ浿
		//�Է�: q
		//���: ȫ�浿 �ڱ浿 q
		
//		Scanner sc = new Scanner(System.in);
//	    String sArr[] = new String[10];
//		int count = 0;
//		
//	    
//			while (true) {
//	            System.out.print("('q' �Է� �� ����): ");
//	            String input = sc.nextLine();
//
//	            if (input.equals("q")) 
//	                break;
//	        sArr[count++] = input;
//	            }
//	            
//
//	       
//	        System.out.println("�Է��� ���ڿ�:");
//	        for (int i=0; i<count; i++) {
//	            System.out.print(sArr[i]+", ");
//		
//	        }
		
		
		//2���� �迭 ����, ����, �ʱ�ȭ
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}};
		for(int i = 0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println("arr3["+i+"]["+j+"]=" + arr3[i][j]);
			}
		}
		
		
		
		
		
		
		
			}
	}


	


