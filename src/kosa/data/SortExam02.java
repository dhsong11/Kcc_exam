package kosa.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {

	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("홍길동", 20));
		list.add(new Person("이길동", 25));
		list.add(new Person("김길동", 30));
		list.add(new Person("빅길동", 10));
		list.add(new Person("하길동", 70));
		list.add(new Person("유길동", 55));

		System.out.println("원상태");
		System.out.println(list);

		Collections.sort(list);
		System.out.println("나이기준 오름차순");
		System.out.println(list);

		Collections.sort(list, new Comparator<Person>() {
			// 이름 기준 오름차순
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getName().compareTo(o2.getName()) > 0)
					return 1;//바꿈
				else if (o1.getName().compareTo(o2.getName()) < 0)
					return -1;
				return 0;
			}

		});
		System.out.println("이름 기준 오름차순");
		System.out.println(list);

//		String str1 = "가";
//		String str2 = "나";
//		int result = str1.compareTo(str2);
//		System.out.println(result);
	}
}