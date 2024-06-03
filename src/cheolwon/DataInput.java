package cheolwon;

import java.util.Scanner;

public class DataInput {

	private static Scanner sc; // 인스턴스가 생성될 때

	public static void makeScanner() { // 먼저 태어났지.
		sc = new Scanner(System.in);
	}

}
