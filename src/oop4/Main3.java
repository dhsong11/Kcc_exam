package oop4;

interface AA {
	BB abc();
}

class BB {
	BB() {
		System.out.println("B생성자");
	}

}

public class Main3 {
	public static void main(String[] args) {
		// 1.익명내부클래스
		AA a1 = new AA() {

			@Override
			public BB abc() {
				return new BB();
			}
		};
		
		a1.abc();

		
		//2.람다식
		AA a2 = () -> new BB();
		a2.abc();
		
		//3.인스턴스참조
		AA a3 = BB::new;
		a3.abc();
	}
}
