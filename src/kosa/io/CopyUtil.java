package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyUtil {

	// 디렉토리 복사(해당 폴더 복사해서 새로운 디렉토리를 생성 후 모든 파일을 복사)
	public static void copyDirectory(File source, File dest) {
		if (source.isDirectory()) {
			dest.mkdir();
//			if (!dest.exists()) {
//				dest.mkdirs();
//			}

			File fileList[] = source.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				File sourceFile = fileList[i];
				if (sourceFile.isDirectory()) {
					// new File(디렉토리 경로, 파일이름);
					copyDirectory(sourceFile, new File(dest, sourceFile.getName()));
					System.out.println("디렉토리  복사");
				} else {
					File destFile = new File(dest, sourceFile.getName());
					copyFile(sourceFile, destFile);
					System.out.println("파일 복사");
				}
			}
		}

	}

	// 바이트 값을 가진 파일 1개를 복사하는 메서드
	public static void copyFile(File source, File dest) {
		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(dest);

			while (true) {
				int data = is.read();
				if (data < 0) {
					break;
				} else {
					os.write(data);
				}
			}
			System.out.println("정상 복사");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (Exception e2) {
			}

		}

	}

	public static void copy(File source, File destination) {
		try (InputStream in = new FileInputStream(source); 
				OutputStream out = new FileOutputStream(destination)) {
			byte[] buffer = new byte[1024];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			System.out.println("파일 복사 실패: " + e.getMessage());
		}
	}
}
