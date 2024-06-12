//package kosa.io;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class CopyExam {
//
//	public static void main(String[] args) {
//		// poem2.txt => poem3.txt :복사를 구현
//
//		String sourceFileName = "poem2.txt";
//		String copyFileName = "poem3.txt";
//
//		try (FileReader reader = new FileReader(sourceFileName);
//				FileWriter writer = new FileWriter(copyFileName)) {
//			int character;
//			while ((character = reader.read()) != -1) {
//				writer.write(character);
//			}
//			System.out.println("파일 복사가 완료");
//		} catch (IOException e) {
//			System.out.println("파일 복사 중에 오류가 발생: " + e.getMessage());
//
//		}
//
//	}
//
//}
