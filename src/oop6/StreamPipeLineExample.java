package oop6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student("홍길동", 10), new Student("신용권", 20), new Student("유미선", 30)

		);

//		Stream<Student> studentStream = list.stream();
//		//중간 처리(학생 객체를 점수로 매핑)
//		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
//		
//		//최종 처리(평균 점수)
//		double avg = scoreStream.average().getAsDouble();

//		double avg = list.stream().mapToInt(student -> student.getScore())
//
//				.average().getAsDouble();
//
//		System.out.println("평균 점수: " + avg);

		list.stream().mapToInt(s -> s.getScore()).forEach(score -> System.out.println(score));
		System.out.println();

		list.stream().map(Student::getName).forEach(name -> System.out.println(name));
		System.out.println();

		list.stream().filter(s -> s.getName().startsWith("홍")).forEach(s -> System.out.println(s.getName()));
		System.out.println(); 

		List<Integer>list2 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		list2.stream().forEach(System.out::println);
		System.out.println();
		
		//문자열 배열 => List, Stream 변환
		String arr[]  = {"BB", "CC", "AA"};
		List<String> list3 = Arrays.asList(arr);
		
//		Stream<String> stream2 = list3.stream();
//		stream2.sorted().forEach(System.out::println);
		
		Stream<String> stream2 = Arrays.stream(arr);
		stream2.sorted().forEach(System.out::println);

}
}
