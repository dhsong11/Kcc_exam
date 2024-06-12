package kosa.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class BufferExam {

	public static void main(String[] args) {
		
		//Scanner => 키보드로 데이터 입력
		//System.in => InputStream => InputStreamReader => BufferedReader
//		InputStream in = System.in;
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("output.txt"));
			
			System.out.print("입력: ");
			String str = "";
			while((str=br.readLine()) != null) {
				str += "\n";
				bw.write(str);
				
			}
			System.out.println("쓰기완료");
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
				br.close();
			}
			catch(Exception e2) {}
		}
		

	}

}
