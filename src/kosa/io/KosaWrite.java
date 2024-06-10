package kosa.io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KosaWrite {

	public static void main(String[] args) {

		// 키보드로부터 문자열을 입력 받아 파일에 쓰는 예제를 구현
		// "q"를 입력하기 전까지 문자열을 파일에 쓰도록 한다
		// FileWriter: write(문자열)
		// 파일명: poem2.txt
		// 코드 실행 후 리플래쉬 => 파일 생성 확인 o => Kcc_Java에서 리플래쉬 후 확인
		// close()구현

		Scanner scanner = new Scanner(System.in);
		FileWriter writer = null;
		String input = "";
		String poem = "";

		System.out.println("파일에 내용을 썼음. 'q'입력... 종료");

		while ((input = scanner.nextLine()).equals('q')) {
			poem += input;
			poem += "\n";
		}
		try {
			writer = new FileWriter("poem2.txt");
			writer.write(input);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e2) {
			}
		}
	}
}
