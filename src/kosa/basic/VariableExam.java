package kosa.basic;

public class VariableExam {

	public static void main(String[] args) {
		
	//지역(로컬)변수 특징 2가지
    //1. 반드시 초기화 후 사용해야 한다.
    //2. 선언된 변수는 정의된 범위 안에서만 사용 가능하다.
		
		int num = 0;
		 
		num = num+1;
		System.out.println(num);
		
		int i=1;
		for(; i<=10; i++) {
			System.out.println(i+", ");
		}
		
		System.out.println("최종 i값: " + i);
		
		//변수 사용시 블록 밖에서도 사용하고 싶은지 결정
		//1.어떤 종류의 데이터? => 데이터 타입 선언 결정
		//2.데이터를 어디까지 사용? => 변수 선언 위치 결정
		
	
		//연산자 %
		System.out.println(10%3);
	    

		//3.14 + 1 = 4.14
		double d = 3.14 + 1;
		System.out.println(d);
		if(d == 4.14) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
