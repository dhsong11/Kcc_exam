package kosa.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MiniDos {

	private File currentDirectory;

	public MiniDos() {
		this.currentDirectory = new File(System.getProperty("user.dir"));
	}

	public void ls() { // 파일목록 출력
		File[] files = currentDirectory.listFiles();
		if (files != null) {
			for (File file : files) {
				System.out.println(file.getName());
			}
		} else {
			System.out.println("파일 목록을 볼 수 없습니다.");
		}
	}

	public void cd(String path) { // 디렉토리 이동
		if (path.equals("..")) {
			currentDirectory = currentDirectory.getParentFile();
		} else {
			File newDirectory = new File(currentDirectory, path);
			if (newDirectory.isDirectory()) {
				currentDirectory = newDirectory;
			} else {
				System.out.println("디렉토리 경로가 없습니다.");
			}
		}
		System.out.println("현재 디렉토리: " + currentDirectory.getAbsolutePath());
	}

	public void mkdir(String dirname) { // 디렉토리 생성
		File newDirectory = new File(currentDirectory, dirname);
		if (newDirectory.mkdir()) {
			System.out.println(dirname + " 디렉토리가 생성되었습니다.");
		} else {
			System.out.println(dirname + " 디렉토리 생성에 실패했습니다.");
		}
	}

	public void vi(String filename) { // 파일 작성 및 읽기
		File file = new File(currentDirectory, filename);
		Scanner scanner = new Scanner(System.in);

		if (file.exists()) {
			System.out.println("파일 내용:");
			try (FileInputStream fis = new FileInputStream(file)) {
				int content;
				while ((content = fis.read()) != -1) {
					System.out.print((char) content);
				}
				System.out.println();
			} catch (IOException e) {
				System.out.println(filename + " 파일 읽기 중 에러가 발생했습니다.");
				e.printStackTrace();
			}
		} else {
			System.out.println(filename + " 파일 없음. 새 파일을 작성");
		}

		System.out.println("파일 내용을 입력 (저장은 q 입력 Enter):");
		try (FileOutputStream fos = new FileOutputStream(file)) {
			while (true) {
				String line = scanner.nextLine();
				if (line.equals("q")) {
					break;
				}
				fos.write((line + System.lineSeparator()).getBytes());
			}
			System.out.println(filename + " 파일이 저장되었습니다.");
		} catch (IOException e) {
			System.out.println(filename + " 파일 작성 중 에러가 발생했습니다.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MiniDos dos = new MiniDos();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("> ");
			String command = scanner.nextLine().trim(); // 공백 제거
			if (command.equals("exit")) {
				break;
			} else if (command.equals("ls")) {
				dos.ls();
			} else if (command.startsWith("cd ")) {
				// 대상 문자열이 특정 문자열 또는 문자로 시작하는지 체크
				String path = command.substring(3).trim();
				dos.cd(path);
			} else if (command.startsWith("mkdir ")) {
				String dirname = command.substring(6).trim();
				dos.mkdir(dirname);
			} else if (command.startsWith("vi ")) {
				String filename = command.substring(3).trim();
				dos.vi(filename);
			} else {
				System.out.println(command + ": 명령어를 찾을 수 없습니다.");
			}
		}

		scanner.close();
	}
}
