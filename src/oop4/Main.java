package oop4;

public class Main {

	public static void main(String[] args) {

		// MyType => 斥誤鎧採適掘什稽 姥薄

		MyType myType = new MyType() {
			@Override
			public void hello() {
				System.out.println("いしいしいし");
			}
		};

		myType.hello();
		System.out.println("----------------------------------");
		// 寓陥縦生稽 姥薄
		// 蓄雌五辞球亜 1鯵析凶幻 寓陥縦生稽 姥薄 亜管
		MyType my2 = () -> {
			System.out.println("寓陥縦 莫縦脊艦陥.");
		};
		my2.hello();

		// 寓陥縦拭辞 鎧遂戚 1匝戚檎 掻胤硲亀 持繰 亜管
		MyType my3 = () -> System.out.println("寓陥縦 莫縦2 脊艦陥.");
		my3.hello();

		System.out.println("-----------------------------------");
		// 置企葵 窒径
		YourType you = (num1, num2) -> {
			System.out.println("収切: " + num1 + ", " + num2);
			return num1 > num2 ? num1 : num2;
		};

		int result = you.getMax(10, 20);
		System.out.println("置企葵: " + result);
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
