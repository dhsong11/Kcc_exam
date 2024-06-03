package oop4;

public class Main {

	public static void main(String[] args) {

		// MyType => 익명내부클래스로 구현

		MyType myType = new MyType() {
			@Override
			public void hello() {
				System.out.println("ㄴㅇㄴㅇㄴㅇ");
			}
		};

		myType.hello();
		System.out.println("----------------------------------");
		// 람다식으로 구현
		// 추상메서드가 1개일때만 람다식으로 구현 가능
		MyType my2 = () -> {
			System.out.println("람다식 형식입니다.");
		};
		my2.hello();

		// 람다식에서 내용이 1줄이면 중괄호도 생략 가능
		MyType my3 = () -> System.out.println("람다식 형식2 입니다.");
		my3.hello();

		System.out.println("-----------------------------------");
		// 최대값 출력
		YourType you = (num1, num2) -> {
			System.out.println("숫자: " + num1 + ", " + num2);
			return num1 > num2 ? num1 : num2;
		};

		int result = you.getMax(10, 20);
		System.out.println("최대값: " + result);
		System.out.println("-----------------------------------");
		
//		Runnable r = () -> {
//			for(int i=1; i<=10; i++) {
//				try {
//					Thread.sleep(100);
//				}catch(Exception e) {}
//				System.out.println(i);
//			}
//		};
//		
//		Thread t = new Thread(r);
//		t.start();
		System.out.println("-----------------------------------");
		
		
		
		
	}

}
