package oop3.ex;

public class Main {

	public static void main(String[] args) {
		Object obj[] = { new Reader("�Ѹ�"), new Work("�浿"), new Student("������") };

		for (Object o : obj) {
			if (o instanceof Speakable) {
				System.out.println(((Speakable) o).speak());
			}

		}

	}
}

