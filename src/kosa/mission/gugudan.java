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
		
		
		//do~while : 명령문을 1번은 시작해야해서
		//키보드로부터 숫자를 입력 받기
		//음수를 입력하면 새로 입력받도록 하기 위함
//		Scanner sc = new Scanner(System.in);
//		int n;
//		do {
//			System.out.print("입력: ");
//			n=sc.nextInt();
//			
//		}
//		while(n<0);
//			System.out.println("입력결과: " + n);
		
		//랜덤값
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
	
		//배열의 사용 방법 팁!
		//1.배열에 사용될 데이터타입을 결정한다.
		//2.배열의 크기를 결정(배열의 크기가 고정, ArrayIndexOfBoundsException예외가 발생)
		//3.배열 생성 방법 선택 => 1,2,3
		//4.배열을 어떻게 초기화 => 직접 인덱스 접근, for문, 생성과 초기화
		//5.배열의 데이터를 어떻게 출력 => for문, 향상된 for문 사용, 직접인덱스
		
		
		
		
		//퀴즈 > 키보드로부터 문자열을 입력 받아 배열에 추가한 후 전체를 출력
		//"q"를 입력할때까지 입력 받는다.
		//입력: 홍길동
		//입력: 박길동
		//입력: q
		//출력: 홍길동 박길동 q
		
//		Scanner sc = new Scanner(System.in);
//	    String sArr[] = new String[10];
//		int count = 0;
//		
//	    
//			while (true) {
//	            System.out.print("('q' 입력 시 종료): ");
//	            String input = sc.nextLine();
//
//	            if (input.equals("q")) 
//	                break;
//	        sArr[count++] = input;
//	            }
//	            
//
//	       
//	        System.out.println("입력한 문자열:");
//	        for (int i=0; i<count; i++) {
//	            System.out.print(sArr[i]+", ");
//		
//	        }
		
		
		//2차원 배열 선언, 생성, 초기화
		int arr3[][] = {{1,2},{3,4,5},{6,7,8,9}};
		for(int i = 0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println("arr3["+i+"]["+j+"]=" + arr3[i][j]);
			}
		}
		
		
		
		
		
		
		
			}
	}


	


