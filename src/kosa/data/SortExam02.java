package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {

	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("ȫ�浿", 20));
		list.add(new Person("�̱浿", 25));
		list.add(new Person("��浿", 30));
		list.add(new Person("��浿", 10));
		list.add(new Person("�ϱ浿", 70));
		list.add(new Person("���浿", 55));

		System.out.println("������");
		System.out.println(list);

		Collections.sort(list);
		System.out.println("���̱��� ��������");
		System.out.println(list);

		Collections.sort(list, new Comparator<Person>() {
			// �̸� ���� ��������
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getName().compareTo(o2.getName()) > 0)
					return 1;//�ٲ�
				else if (o1.getName().compareTo(o2.getName()) < 0)
					return -1;
				return 0;
			}

		});
		System.out.println("�̸� ���� ��������");
		System.out.println(list);

//		String str1 = "��";
//		String str2 = "��";
//		int result = str1.compareTo(str2);
//		System.out.println(result);
	}
}