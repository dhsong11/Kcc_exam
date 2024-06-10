package kosa.io;

import java.io.FileReader;
import java.util.Arrays;

public class KosaReader {

	public static void main(String[] args) {
		
		//파일(poem.txt)에 있는 문자열 데이터를 읽어오기 
		FileReader reader = null;
		char arr[] = new char[100];
		
		
		try {
			//FileReader 생성
			reader = new FileReader("poem.txt");
			
//			reader.read(arr);
//			System.out.println(arr);

//						while(true) {
//				int data = reader.read();
//				if(data==-1) break;
//				System.out.print((char)data);
//			}
			
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data == -1) break;
				System.out.print(arr);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(Exception e2) {}
			
		}

	}

}
