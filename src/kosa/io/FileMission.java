package kosa.io;

import java.io.File;

public class FileMission {

	public static void main(String[] args) {

		// 1.바이트스트림을 이용하여 이미지 파일을 복사해 보자.(Copyutil클래스 사용해서)
//		String source = "C:\\Users\\KOSA\\Desktop\\KCC\\Java\\SONG.png";
//		String dest = "C:\\Users\\KOSA\\Desktop\\KCC\\work\\sdss.png";
//
//		File sourceDir = new File(source);
//		File destDir = new File(dest);
		
//		CopyUtil.copyFile(sourceDir, destDir);

		
		//2.디렉토리 복사를 구현하자.
		String source = "C:\\Users\\KOSA\\Desktop\\KCC\\Java\\book";
		String dest = "C:\\Users\\KOSA\\Desktop\\KCC\\work\\book";
		
		CopyUtil.copyDirectory(new File(source), new File(dest));
		
	}

}
