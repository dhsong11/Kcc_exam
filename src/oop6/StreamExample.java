package oop6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		//set컬렉션생성
//		Set<String>set = new HashSet<>();
//		set.add("홍길동");
//		set.add("신용권");
//		set.add("감자바");
		
		//Stream을 이용한 요소 반복 처리
//		Stream<String> stream = set.stream();
//		stream.forEach(name -> System.out.println(name));
		
		List<String>list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("감자바");
		list.add("람다식");
		list.add("박병렬");
		
		//병렬처리
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});

	}

}
