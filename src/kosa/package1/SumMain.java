package kosa.package1;

public class SumMain {

	public static void main(String[] args) {

		// t1: 1~50 합을 구하는 스레드
		// t2: 51~100 합을 구하는 스레드
		// main: t1 + t2합 => 합:5050 => 문제:join()함수

		SumThread at1 = new SumThread(1, 50);
		SumThread at2 = new SumThread(51, 100);

		at1.start();    
		at2.start();

		try {
			at1.join();
			at2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("1에서 100까지의 합 : " + (at1.getTotal() + at2.getTotal()));
	}
}
