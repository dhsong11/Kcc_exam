package oop4;

interface A {
	void abc();
}

class B {
	void bcd() {
		System.out.println("메서드 호출");
	}
}

public class Main2 {

	public static void main(String[] args) {

		// 1.익명클래스 이용해서 abc()오버라이딩 -> B객체를 생성해서 bcd()를 호출해주세요.
		A a = new A() {
			@Override
			public void abc() {
				B b = new B();
				b.bcd();

			}
		};
		a.abc();
		
		System.out.println("------------------");

		// 2. 1번을 람다식으로
		A a2 = () -> {
			B b = new B();
			b.bcd();
		};
		a2.abc();
		System.out.println("------------------");

		// 3.인스턴스참조 구현
		B b = new B();
		A a3 = b::bcd;

		a3.abc();
	}

}
