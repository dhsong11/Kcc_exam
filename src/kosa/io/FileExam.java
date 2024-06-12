package kosa.io;

import java.io.File;

public class FileExam {

	public static void main(String[] args) {

		String path = "C:\\Users\\KOSA\\Desktop\\KCC";
		File f = new File(path);
		show(f);
	}

	public static void show(File file) {
		File list[] = file.listFiles();

		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out.println();
				System.out.println("** " + list[i].getName() + " **");
				show(list[i]);
			} else {
				System.out.println("- " + list[i].getName());
			}
		}
	}
}

//ListFile(path);
//}
//// 재귀
//private static void ListFile(String strDirPath) {
//
//File path = new File(strDirPath);
//File[] fList = path.listFiles();
//
//for (int i = 0; i < fList.length; i++) {
//
//	if (fList[i].isFile()) {
//		System.out.println(fList[i].getPath());
//	} else if (fList[i].isDirectory()) {
//		ListFile(fList[i].getPath()); // 재귀함수 호출
//	}
//}
//}